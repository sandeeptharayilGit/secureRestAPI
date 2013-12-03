package com.sans.utils;

import java.util.HashMap;

public class AppConstants {

	

	public static HashMap<String, String> CUSTOMERDOMAINLIST = new HashMap<>();

	public static String getHost(String remoteHost)
	{
		return CUSTOMERDOMAINLIST.containsKey(remoteHost)? CUSTOMERDOMAINLIST.get(remoteHost):"";
	}
	
	static {
		CUSTOMERDOMAINLIST.put("127.0.0.1", "http://localhost:9090");

	}

}
