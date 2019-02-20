package com.customer.wc.customer;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.wc.util.Response;
import com.customer.wc.customer.dto.CustomerDTO;

@RestController
@RequestMapping("/customer")
public class CutomerController {

	@Resource
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Resource
    CustomerService  customerService;
    
	
    @GetMapping(value="/getcustomer",produces="application/json")
	public ResponseEntity<Response<String>>  getCustomer() {
		return Response.successResponse("SuccessFully SignedUp");
	}
    
	@PostMapping("/sign-up")
    public ResponseEntity<Response<String>> signUp(@RequestBody CustomerDTO customer) {
		customer.setPassword(bCryptPasswordEncoder.encode(customer.getPassword()));
        customerService.saveCustomer(customer);
        return Response.successResponse("SuccessFully SignedUp");
    }
	
	
}
