package com.sans.rest.services.impl;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sans.rest.services.IDeviceService;

@Controller
public class DeviceService implements IDeviceService {

	private static Logger logger = Logger.getLogger(DeviceService.class);

	@Override
	@RequestMapping(value = "/constant", method = RequestMethod.GET)
	public @ResponseBody
	ProductJsonBean fetchConstants(@RequestParam(value = "constantID", required = true) String constantID, HttpServletRequest request) {
		Logger.getLogger(this.getClass()).info(" hostname   " + request.getLocalName());

		ProductJsonBean returnBean = new ProductJsonBean();
		// returnBean = deviceDelegate.getConstant(constantID,
		// request.getLocalName());
		returnBean.setReturnType("Sandeep");

		return returnBean;
	}

	/*
	 * Use : Validate Admin page Login credential
	 * 
	 * This method validate the store Number for a device, If its a valid store
	 * number its return true. Otherwise return false
	 */
	/*
	 * @RequestMapping(value = "/login", method = RequestMethod.GET) public
	 * 
	 * @ResponseBody Boolean login(@RequestParam(value = "store", required =
	 * true) String storeNumber, @RequestParam(value = "device") String device)
	 * { //
	 * http://localhost:9080/dejdss/restapi/login?device=AD1C4DAE971DDB81E9&
	 * store=1660 logger.log(Level.INFO, "Admin Login Begin"); Boolean flag =
	 * false; try {
	 * 
	 * DeviceDelegate deviceDelegate = new DeviceDelegate();
	 * 
	 * flag = deviceDelegate.validateLogin(storeNumber, device); if (flag) {
	 * logger.log(Level.INFO, "Admin Login Success"); } else {
	 * logger.log(Level.INFO, "Admin Login Fail with password : " +
	 * storeNumber); }
	 * 
	 * } catch (Exception e) { // TODO: handle exception
	 * logger.error("Error in admin Login", e); e.printStackTrace(); }
	 * 
	 * return flag;
	 * 
	 * }
	 */

	/*
	 * Use : Generate Device mapped Product Details as JSoN object
	 * 
	 * (this is the home url for a device)
	 * 
	 * Its load all the mapped product corresponding to a device from dB (using
	 * hibernate) then it get product price from DB using those product
	 * PartNumber and storeNumber Its pass all Product partNumber to SHC
	 * ProductDetails API one by one, the API response is in XML then its
	 * Unmarshal the data and form a Product details JSON
	 * 
	 * Update the price value in Product details Json
	 * 
	 * Retrieve the Video for a product and insert into the JSON data
	 * 
	 * 
	 * 
	 * finally Update HeartBeat table then return a whole productDetails JsoN
	 * for a device
	 */

	/*
	 * @RequestMapping(value = "/product", method = RequestMethod.GET) public
	 * 
	 * @ResponseBody ProductJsonBean
	 * loadDeviceProductDetailsByUniqueCode(@RequestParam(value = "device",
	 * required = true) String barcode, HttpServletRequest request) { //
	 * http://localhost
	 * :9080/DigitalSign/restapi/product?device=AD1C4DAE971DDB81E9
	 * ProductJsonBean jsonbean = new ProductJsonBean(); List<ProductInfoBean>
	 * w_beanList = new ArrayList<ProductInfoBean>();
	 * 
	 * Boolean videoFlag = true, enableStoreMapFlag = false; DeviceDelegate
	 * deviceDelegate = new DeviceDelegate(); StoreConfigDelegate
	 * storeConfDelegate = new StoreConfigDelegate(); List<String>
	 * emptyApiPartNumber = new ArrayList<String>(); String priceInfoStr = "";
	 * String storeNo = "", deviceIp = "", storeManagerId = ""; Map<String,
	 * String> storeDetail = null;
	 * 
	 * logger.log(Level.INFO,
	 * " method start : loadDeviceProductDetailsByUniqueCode : " + barcode);
	 * 
	 * try { deviceIp = request.getRemoteAddr(); List<Object[]> productPartNos =
	 * deviceDelegate.getListOfPartNumberByDeviceCode(barcode); //
	 * partNumber,productXdeviceId // Get StoreNo from Session, if its not
	 * available get it from db and // set in Session
	 * 
	 * storeDetail = deviceDelegate.getStoreDetailsByDeviceCode(barcode);
	 * storeNo = storeDetail.get("storeNumber"); storeManagerId =
	 * storeDetail.get("storeManagerId");
	 * 
	 * if (!productPartNos.isEmpty()) {
	 * 
	 * logger.log(Level.INFO, " Product Detail Api Url Begin for a Device : " +
	 * barcode);
	 * 
	 * w_beanList = deviceDelegate.getProductsInfoBeanListByPartNos(storeNo,
	 * videoFlag, productPartNos, request, barcode);
	 * 
	 * priceInfoStr = deviceDelegate.generateProductPriceString(w_beanList);
	 * 
	 * logger.log(Level.INFO, " Product Detail Api  End for a Device : " +
	 * barcode);
	 * 
	 * // Verify whether the store having StoreMap ? enableStoreMapFlag =
	 * StoreUtil.isThisStoreHavingMap(storeNo);
	 * 
	 * } else { logger.log(Level.INFO, " No product for a device : " + barcode);
	 * 
	 * }
	 * 
	 * if (request.getSession().getAttribute("nullResponseProduct") != null) {
	 * emptyApiPartNumber = (List<String>)
	 * request.getSession().getAttribute("nullResponseProduct");
	 * 
	 * logger.log(Level.INFO, "Empty Api Response : " +
	 * emptyApiPartNumber.toString());
	 * 
	 * } if (emptyApiPartNumber.isEmpty()) { emptyApiPartNumber.add("Empty"); }
	 * 
	 * // Store wake up and close time start
	 * 
	 * String wakeUpName = DSAppConstants.getConstant("wakeUpName").trim();
	 * String sleepName = DSAppConstants.getConstant("sleepName").trim(); String
	 * wakeUpRange = DSAppConstants.getConstant("wakeupRangeName").trim();
	 * 
	 * Map<String, String> storeConfigMap =
	 * storeConfDelegate.getStoreConfiguration(storeNo);
	 * 
	 * jsonbean.setEmptyApiPartNumber(emptyApiPartNumber);
	 * jsonbean.setProductList(w_beanList); jsonbean.setStoreNumber(storeNo);
	 * jsonbean.setBarcode(barcode); jsonbean.setStoreManagerId(storeManagerId);
	 * 
	 * jsonbean.setSleepHour(storeConfigMap.get(sleepName).toString().split(":")[
	 * 0]);
	 * jsonbean.setSleepMinute(storeConfigMap.get(sleepName).toString().split
	 * (":")[1]);
	 * jsonbean.setWakeUpHour(storeConfigMap.get(wakeUpName).toString(
	 * ).split(":")[0]);
	 * jsonbean.setWakeUpMinute(storeConfigMap.get(wakeUpName).
	 * toString().split(":")[1]);
	 * jsonbean.setWakeUpRange(storeConfigMap.get(wakeUpRange).toString());
	 * 
	 * jsonbean.setEnableStoreMap(enableStoreMapFlag);
	 * 
	 * // check whether the Store conf table having any configuration or // not
	 * Boolean enableStoreSetUp = true; String enableStoreSetUpFromMap =
	 * storeConfigMap.get("enableStoreSetUp").toString();
	 * 
	 * if (enableStoreSetUpFromMap.equals("false")) { enableStoreSetUp = false;
	 * } jsonbean.setEnableStoreSetUp(enableStoreSetUp);
	 * 
	 * // Store wake up and close time end
	 * 
	 * jsonbean.setReturnType("product");
	 * 
	 * } catch (Exception e) {
	 * 
	 * if (e instanceof DSAppException) { w_errObj = new DSError();
	 * w_errObj.setErrorDesc(((DSAppException) e).getExceptionDescription());
	 * jsonbean.setErrorResponse(w_errObj); logger.error("Error in Product Url",
	 * e); } else { w_errObj = new DSError();
	 * w_errObj.setErrorDesc(e.getMessage());
	 * jsonbean.setErrorResponse(w_errObj); } logger.error("Error ", e);
	 * e.printStackTrace();
	 * 
	 * } finally { // Update Heart Beat try {
	 * 
	 * deviceDelegate.saveOrUpdateHeartBeat(barcode, priceInfoStr, deviceIp,
	 * storeNo);
	 * 
	 * logger.log(Level.INFO,
	 * " method end : loadDeviceProductDetailsByUniqueCode : " + barcode);
	 * 
	 * } catch (Exception e) { // TODO Auto-generated catch block
	 * logger.error("Heart Beat update Error", e); e.printStackTrace(); } }
	 * 
	 * return jsonbean; }
	 */

	/*
	 * 
	 * 
	 * 
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.searshc.digitalsigns.services.IDeviceService#fetchConstants(java.
	 * lang.String, javax.servlet.http.HttpServletRequest)
	 */

	// @RequestMapping(value ="/log", method=RequestMethod.GET)
	// public @ResponseBody Boolean logEvents(
	// @RequestParam(value="barcode",required =false) String barcode,
	// @RequestParam(value="macAddress",required =false) String
	// deviceMacAddress,
	// @RequestParam(value="storeNumber",required =false) String storeNumber,
	// @RequestParam(value="eventDetails",required =true) String eventDetails,
	// @RequestParam(value="time",required =false) String time,
	// HttpServletRequest request) {
	// //restapi/log?barcode=sampleBarcodeNew&macAddress=123&storeNumber=1660&eventDetails=test&time=05-05-2013
	// 00:00:00
	//
	// DeviceDelegate deviceDelegate = new DeviceDelegate();
	//
	//
	// Logger.getLogger(this.getClass()).info("barcode="+barcode+",  deviceMacAddress="+deviceMacAddress+",  storeNumber="+storeNumber+
	// ",  eventDetails="+eventDetails+",  time="+time);
	//
	//
	// deviceDelegate.logEvent(barcode,deviceMacAddress,storeNumber,eventDetails,time);
	// return true;
	// }
	//
	// @RequestMapping(value ="/ping", method=RequestMethod.GET)
	// public @ResponseBody Boolean ping() {
	// return true;
	// }
	//
	//
	//
	//
	// @Override
	// public List<Object[]> getListOfPartNumberByDeviceCode(String a_DeviceID)
	// {
	// // TODO Auto-generated method stub
	// return null;
	// }
	//
	//
	//
	// @Override
	// public Integer getMappedDeviceIdByStoreAndDeviceCode(String storeNumber,
	// String device) throws Exception {
	// // TODO Auto-generated method stub
	// return null;
	// }
	//
	// @Override
	// public Object[] getStoreDetailsByDeviceCode(String barCode) {
	// // TODO Auto-generated method stub
	// return null;
	// }

}
