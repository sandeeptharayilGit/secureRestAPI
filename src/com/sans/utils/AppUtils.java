/**
 * 
 */
package com.sans.utils;

import org.apache.commons.codec.binary.Base64;

/**
 * @author sandeep_ts
 * 
 */
public class AppUtils {

	public static boolean validateToken(String authHeader) {
		// valid urls safe token created using
		// org.apache.commons.codec.binary.Base64 --> U2FuZGVlcA==
		boolean ret = new String(Base64.decodeBase64(authHeader)).equalsIgnoreCase("Sandeep");

		return ret;

	}
}
