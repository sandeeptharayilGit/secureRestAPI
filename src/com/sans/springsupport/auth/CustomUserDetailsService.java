package com.sans.springsupport.auth;

import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {
	@SuppressWarnings({ "deprecation", "serial" })
	@Override
	public UserDetails loadUserByUsername(String token) throws UsernameNotFoundException, DataAccessException {
		// UserDetails userdetail = null;
		System.out.println("Token recieved :: " + token);

		/*
		 * if (token.equalsIgnoreCase("Sandeep")) {
		 * System.out.println("Valid token"); // userdetail = new User(token,
		 * "password", true, false, false, true, new GrantedAuthority[] { new
		 * GrantedAuthorityImpl("ROLE_USER") });
		 * 
		 * } else { System.out.println("Invalid token"); throw new
		 * UsernameNotFoundException(token + " is an invalid token") { }; }
		 */

		return new User(token, "password", true, false, false, true, new GrantedAuthority[] { new GrantedAuthorityImpl("ROLE_USER") });
	}
}
