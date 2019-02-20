package com.customer.wc.security;

import java.util.Collections;

import javax.annotation.Resource;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.customer.wc.customer.dto.CustomerDTO;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	 @Resource
     private AuthenticaManager authenticaManager;

   

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    	 CustomerDTO applicationUser = authenticaManager.authenticateUser(username);
        if (applicationUser == null) {
            throw new UsernameNotFoundException(username);
        }
        return new User(applicationUser.getUsername(), applicationUser.getPassword(),Collections.emptyList());
    }
}
