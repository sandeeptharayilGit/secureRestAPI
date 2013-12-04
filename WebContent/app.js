
var app = angular.module('myApp', []);



function MainCtrl($scope,$location,$document) {
	
	$scope.messages = [];
	
	
	$scope.pushData= function() {
		myUrl = 'http://localhost:8080/secureRestAPI/securerestapi/addVehicle';
		var analyticsData={name:"BMW",model:"X1"}
		  $.ajax({type : "POST",
             url: myUrl,
             data:JSON.stringify(analyticsData),
             contentType : 'application/json',
             dataType : 'json',
             processData : false,
             headers:{"SecureToken":"atom"}
             }).success(function(data, status, headers, config) {
                     console.dir(data);
                     console.log("pushed data successfully");
             }).
             error(function(data, status, headers, config) {
               console.log("data= "+data);
               console.log("status= "+status)
               console.log("error in pushing data ");
             }); 
	};
	$scope.myFunction= function(data) {
		console.log("In myFunction()");
		console.log(data);
	};

	$scope.myCallBack= function(data) {
		console.log("In myCallBack()");
		console.log(data);
		$("#restApiResult").text(data.vehicleName);
	};
	$scope.myFailureFunction= function(data) {
		console.log("In myFailureFunction()");
		console.log(data);
	};
	
	
	/**SSE Example - Start**/
	if (typeof (EventSource) !== "undefined") {
		var source = new EventSource("getServerData");
		/**What to do when a connection is opened*/
		source.onopen = function(event){
			//console.log("Connection Opened");
			//console.log(event);
			//$("#result").text("Message Type : "+event.type+" ,Time : "+event.timeStamp);
		};
		
		/**What to do when data is received*/
		source.onmessage = function(event) {
			console.log("Message Recieved: ");
			console.log(event.data);
			//$("#result").text("Message Type : "+event.type+" :: "+event.data);
			var obj=angular.fromJson(event.data)
			console.log(obj);
			if(obj.length>0){
			
				for(var index in obj){
				$scope.messages.push(obj[index]);
				}
			
				$scope.$apply();
			}
		};
		
		/**What to do when an error is thrown*/
		source.onerror = function(message){
			console.log("Error Recieved: ");console.log(message);
			//$("#result").text("Message Type : "+message.type+" ,Time : "+new Date(message.timeStamp));
		};
		
	} else {
		$("#result").text("Sorry, your browser does not support server-sent events...");
	}
/**SSE Example - End**/
	
	
	
}