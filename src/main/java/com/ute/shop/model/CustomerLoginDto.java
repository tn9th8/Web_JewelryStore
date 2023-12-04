package com.ute.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerLoginDto {
	@NotEmpty
	private String phone;
	@NotEmpty
	private String password;
	
	private Boolean rememberMe = false;
}
