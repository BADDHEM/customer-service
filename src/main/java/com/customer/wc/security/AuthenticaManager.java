package com.customer.wc.security;

import com.customer.wc.customer.dto.CustomerDTO;

public interface AuthenticaManager {

	CustomerDTO authenticateUser(String UserName);
}
