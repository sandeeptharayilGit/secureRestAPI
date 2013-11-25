/**
 * 
 */
package com.sans.utils;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.binary.Base64;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * @author sandeep_ts
 * 
 */
public class AppUtils {

	static final byte[] jsonpstart = new String("(").getBytes();
	static final byte[] jsonpclose = new String(");").getBytes();

	public static boolean validateToken(String authHeader) {
		// valid urls-safe token created using
		// org.apache.commons.codec.binary.Base64 --> U2FuZGVlcA==
		boolean ret = new String(Base64.decodeBase64(authHeader)).equalsIgnoreCase("Sandeep");

		return ret;

	}

	public static void createjsonp(Object returnBean, String callback, HttpServletResponse response) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		response.getOutputStream().write(new String(callback).getBytes());
		response.getOutputStream().write(jsonpstart);
		response.getOutputStream().write(mapper.writeValueAsBytes(returnBean));
		response.getOutputStream().write(jsonpclose);
		response.getOutputStream().flush();
	}
}
