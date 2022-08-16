package com.ntg.product.dto;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class CustomUser extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2570855747735180835L;

	private final String userName;
	private final String phoneNumber;
	private final String address;

	public CustomUser(String email, String password, boolean enabled, boolean accountNonExpired,
					  boolean credentialsNonExpired, boolean accountNonLocked, Collection<GrantedAuthority> authorities,
					  String userName, String phoneNumber, String address) {

		super(email, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getUserName() {
		return userName;
	}

}
