package com.ntg.product.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignupRequest {
	
	private String userName;
	private String password;
	private String email;
	private String phoneNumber;
	private String address;
	

}
