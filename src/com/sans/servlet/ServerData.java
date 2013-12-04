package com.sans.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sans.model.SharedData;
import com.sans.model.VehicleJsonBean;

public class ServerData extends HttpServlet {

	private static final long serialVersionUID = 1L;
private static Date date = new Date(System.currentTimeMillis());
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/** Setting Content-type to text/event-stream **/
		response.setContentType("text/event-stream");
		/**Setting encoding to UTF-8*/
		response.setCharacterEncoding("UTF-8");
		
		/*ServerTime serverTime = new ServerTime();
		
		
		serverTime.setServerDay(date.getDay()+"");
		serverTime.setServerMon(date.getMonth()+"");
		serverTime.setServerHour(date.getHours()+"");
		serverTime.setServerMin(date.getMinutes()+"");
		serverTime.setServerSec(date.getSeconds()+"");*/
		ArrayList<VehicleJsonBean> list= SharedData.getInstance().getList();
		System.out.println("data: " +list.size()+list.toString() + "\n\n"); 
		response.getWriter();
		response.getWriter().write("data: " +list.toString() + "\n\n");
		//response.getWriter().write("data: " +list.size() +"Items \n "+ list.toString() + "\n\n");
		response.getWriter().flush();
		response.getWriter().close();
	}

}
