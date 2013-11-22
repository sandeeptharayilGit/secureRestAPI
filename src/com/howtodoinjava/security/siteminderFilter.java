/**
 * 
 */
package com.howtodoinjava.security;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.authentication.preauth.RequestHeaderAuthenticationFilter;

/**
 * @author sandeep_ts
 * 
 */
public class siteminderFilter extends RequestHeaderAuthenticationFilter {

	@Override
	public Object getPreAuthenticatedPrincipal(HttpServletRequest request) {

		String authHeader = request.getHeader("Authorization");
		if ((authHeader == null) || authHeader.equals("")) {
			// Log.getGeneralLogger().fatal("No authorization header");
			throw new AccessDeniedException("Internal problem.  Please contact ABC.");
		}
		return authHeader;
	}

}
