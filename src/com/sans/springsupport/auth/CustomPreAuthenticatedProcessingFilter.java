package com.sans.springsupport.auth;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.web.authentication.preauth.AbstractPreAuthenticatedProcessingFilter;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedCredentialsNotFoundException;
import org.springframework.util.Assert;

import com.sans.utils.AppUtils;

/**
 * 
 * @author sandeep_ts
 * 
 */

public class CustomPreAuthenticatedProcessingFilter extends AbstractPreAuthenticatedProcessingFilter {
	private String principalRequestHeader = "SecureToken";
	private String credentialsRequestHeader;
	private boolean exceptionIfHeaderMissing = true;

	/**
	 * Read and returns the header named by {@code principalRequestHeader} from
	 * the request.
	 * 
	 * @throws PreAuthenticatedCredentialsNotFoundException
	 *             if the header is missing and {@code exceptionIfHeaderMissing}
	 *             is set to {@code true}.
	 */
	@Override
	protected Object getPreAuthenticatedPrincipal(HttpServletRequest request) {
		String principal = request.getHeader(principalRequestHeader);

		if ((principal == null) && exceptionIfHeaderMissing) {
			throw new PreAuthenticatedCredentialsNotFoundException("Security Token not found in request");
		}
		if (!AppUtils.validateToken(principal)) { // validate this token
													// using custom logic
			throw new PreAuthenticatedCredentialsNotFoundException("Valid Security Token not found in request");
		}

		return principal;
	}

	/**
	 * Credentials aren't usually applicable, but if a
	 * {@code credentialsRequestHeader} is set, this will be read and used as
	 * the credentials value. Otherwise a dummy value will be used.
	 */
	@Override
	protected Object getPreAuthenticatedCredentials(HttpServletRequest request) {
		if (credentialsRequestHeader != null) {
			String credentials = request.getHeader(credentialsRequestHeader);

			return credentials;
		}

		return "N/A";
	}

	public void setPrincipalRequestHeader(String principalRequestHeader) {
		Assert.hasText(principalRequestHeader, "principalRequestHeader must not be empty or null");
		this.principalRequestHeader = principalRequestHeader;
	}

	public void setCredentialsRequestHeader(String credentialsRequestHeader) {
		Assert.hasText(credentialsRequestHeader, "credentialsRequestHeader must not be empty or null");
		this.credentialsRequestHeader = credentialsRequestHeader;
	}

	/**
	 * Defines whether an exception should be raised if the principal header is
	 * missing. Defaults to {@code true}.
	 * 
	 * @param exceptionIfHeaderMissing
	 *            set to {@code false} to override the default behaviour and
	 *            allow the request to proceed if no header is found.
	 */
	public void setExceptionIfHeaderMissing(boolean exceptionIfHeaderMissing) {
		this.exceptionIfHeaderMissing = exceptionIfHeaderMissing;
	}
}
