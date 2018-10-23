package com.customer.wc.customer;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.customer.wc.customer.dto.CustomerDTO;

@Service
public class CustomerServiceImpl implements CustomerService{
 
	@Resource
	CustomerRepository customerRepository;
	
	@Override
	public void saveCustomer(CustomerDTO customerDTO) {
		customerRepository.saveCustomer(customerDTO);
		
	}
	
	
}