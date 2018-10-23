package com.customer.wc.security;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.customer.wc.customer.dto.CustomerDTO;

@Service
public class AuthenticateManagerImpl implements AuthenticaManager {

	@Resource
	AuthRepository authRepository;
	
	@Override
	public CustomerDTO authenticateUser(String UserName) {
		
		return authRepository.authenticateUser(UserName);
	}

	

	
}
