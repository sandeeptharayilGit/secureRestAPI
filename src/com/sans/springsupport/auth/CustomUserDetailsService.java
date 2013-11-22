/**
 * 
 */
package com.sans.springsupport.auth;

import java.util.ArrayList;

import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException, DataAccessException {
		System.out.println("username recieved :: " + username);
		@SuppressWarnings("deprecation")
		// Get this user details from database and set its roles also here
		ArrayList<GrantedAuthority> newList = new ArrayList<GrantedAuthority>();
		newList.add(new GrantedAuthorityImpl("ROLE_USER"));

		UserDetails user = new User(username, "password", true, true, true, true, newList);
		return user;
	}
}
