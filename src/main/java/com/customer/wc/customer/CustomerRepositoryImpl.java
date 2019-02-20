package com.customer.wc.customer;

import javax.annotation.Resource;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

import com.customer.wc.customer.dto.CustomerDTO;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

	@Resource
	MongoOperations mongoOperations;

	@Override
	public void saveCustomer(CustomerDTO customer) {
		mongoOperations.save(customer);
		
	}

	
}
