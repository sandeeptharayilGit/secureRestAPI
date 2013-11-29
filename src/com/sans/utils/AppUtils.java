/**
 * 
 */
package com.sans.utils;

import java.io.IOException;
import java.io.OutputStream;

import com.sans.springsupport.wrapper.GenericResponseWrapper;

/**
 * @author sandeep_ts
 * 
 */
public class AppUtils {

	static final byte[] jsonpstart = new String("(").getBytes();
	static final byte[] jsonpclose = new String(");").getBytes();

	/**
	 * 
	 * @param authHeader
	 * @return
	 */
	public static boolean validateToken(String authHeader) {
		// valid urls-safe token created using
		// org.apache.commons.codec.binary.Base64 --> U2FuZGVlcA==
		boolean ret = ((authHeader != null) && authHeader.equalsIgnoreCase("atom"));
		// new
		// String(Base64.decodeBase64(authHeader)).equalsIgnoreCase("Sandeep");

		return ret;

	}

	/**
	 * 
	 * @param wrapper
	 * @param callback
	 * @param out
	 * @throws IOException
	 */
	public static void createjsonp(GenericResponseWrapper wrapper, String callback, OutputStream out) throws IOException {

		out.write(new String(callback).getBytes());
		out.write(jsonpstart);
		out.write(wrapper.getData());
		out.write(jsonpclose);
		wrapper.setContentType("json");
		out.close();
	}

}
