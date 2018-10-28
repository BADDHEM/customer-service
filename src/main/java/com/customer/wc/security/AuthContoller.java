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
	
	@PostMapping(value ="/authen/login", produces="application/json")
	public String validateUserAndLogin(@RequestBody CustomerDTO customerDTO) {
		return authenticManager.authenticateUser(customerDTO.getUsername()).getUsername();

	}
	
}