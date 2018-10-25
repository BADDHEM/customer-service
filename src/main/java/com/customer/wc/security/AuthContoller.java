package com.customer.wc.security;



import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customer.wc.customer.dto.CustomerDTO;

@RestController
public class AuthContoller {

	@Resource
	AuthenticaManager authenticManager;
	
	@PostMapping(value ="/login", produces="application/json")
	public String validateUser(@RequestBody CustomerDTO customerDTO) {
		
		return authenticManager.authenticateUser(customerDTO.getUsername()).getUsername();

	}
	
	@PostMapping(value ="/authenticated", produces="application/json")
	public void logger(@RequestBody CustomerDTO customerDTO) {
		
		System.out.println(customerDTO.getPassword());

	}
}