package com.customer.wc.customer;

import javax.annotation.Resource;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.customer.wc.customer.dto.CustomerDTO;

@RestController
public class CutomerController {

    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Resource
    CustomerService  customerService;
    
	@GetMapping(value="/getcustomer",produces="application/json")
	public @ResponseBody String getCustomer() {
		return "Venki";
	}
	
	@PostMapping("/sign-up")
    public void signUp(@RequestBody CustomerDTO customer) {
		customer.setPassword(bCryptPasswordEncoder.encode(customer.getPassword()));
        customerService.saveCustomer(customer);
    }
	
	
}
