package com.customer.wc.customer;

import com.customer.wc.customer.dto.CustomerDTO;

public interface CustomerRepository {

	
	void saveCustomer(CustomerDTO customer);
}
