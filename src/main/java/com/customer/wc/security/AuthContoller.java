package com.customer.wc.security;



import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthContoller {

	@Resource
	AuthenticaManager authenticManager;
	
	@GetMapping(value ="/authenticateUser", produces="application/json")
	public String validateUser(@PathVariable String userName) {
		
		return authenticManager.authenticateUser(userName).getUsername();

	}
}