package com.customer.wc.customerservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CutomerController {

	@GetMapping(value="/getcustomer",produces="application/json")
	public @ResponseBody String getCustomer() {
		return "Venki";
	}
}
