package com.howtodoinjava.security;

import org.apache.commons.codec.binary.Base64;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {
	@SuppressWarnings("deprecation")
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException, DataAccessException {
		UserDetails userdetail = null;
		System.out.println("username recieved :: " + username);

		if (username.equalsIgnoreCase("Sandeep")) {
			System.out.println(" valid username");
			userdetail = new User(username, "password", true, true, true, true, new GrantedAuthority[] { new GrantedAuthorityImpl("ROLE_USER") });
			System.out.println("created userdetauil object");
		} else {
			System.out.println("Invalid username");
			throw new DataAccessException(username + " is an invalid username") {
			};
		}

		System.out.println(Base64.encodeBase64Chunked(username.getBytes()));
		System.out.println(Base64.encodeBase64String(username.getBytes()));
		System.out.println(Base64.encodeBase64((username.getBytes()), true, true));
		System.out.println(new String(Base64.decodeBase64("U2FuZGVlcA==")));

		System.out.println("returning userdetails");
		return userdetail;
	}
}
