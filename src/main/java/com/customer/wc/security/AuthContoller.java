package com.customer.wc.security;



import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customer.wc.Util.CustomerNotFoundException;
import com.customer.wc.Util.Response;
import com.customer.wc.customer.dto.CustomerDTO;

@RestController
public class AuthContoller {

	@Resource
	AuthenticaManager authenticManager;
	
	@PostMapping(value ="/login", produces="application/json")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<Response<CustomerDTO>> validateUserAndLogin(@RequestBody CustomerDTO customerDTO) throws CustomerNotFoundException {
		String username = null;
		try {
			username = authenticManager.authenticateUser(customerDTO.getUsername()).getUsername();
		} catch(Exception e) {
			throw new CustomerNotFoundException(e);
		}
		
        return Response.successResponse(customerDTO);
	}
	
}