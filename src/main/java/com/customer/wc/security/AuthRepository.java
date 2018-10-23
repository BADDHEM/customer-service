package com.customer.wc.security;

import com.customer.wc.customer.dto.CustomerDTO;

public interface AuthRepository {

	CustomerDTO authenticateUser(String UserName);
}
