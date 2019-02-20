package com.customer.wc.orders;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customer.wc.util.Response;
import com.customer.wc.orders.dto.OrderDTO;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Resource
	OrderManager orderManger;
	
	@PostMapping
	public ResponseEntity<Response<String>> saveOrder(OrderDTO order) {
		String orderId = orderManger.saveOrder(order);
		return Response.successResponse(orderId);
	}
	
	@DeleteMapping
	public ResponseEntity<Response<Boolean>> deleteOrder(@PathVariable String orderId) {
		orderManger.deleteOrder(orderId);
		return Response.successResponse(true);
	}
	
	@GetMapping("/customer")
    public ResponseEntity<Response<List<OrderDTO>>> getCustomerOrders(@RequestParam("custId") String customerId) {
		List<OrderDTO> customerOrders = orderManger.getCustomerOrders(customerId);
		return Response.successResponse(customerOrders);
	}
    
	@GetMapping("/filter")
    public ResponseEntity<Response<List<OrderDTO>>> getOrdersByCriteria(@RequestParam("criteria") String criteria) {
		List<OrderDTO> filteredOrders = orderManger.getOrdersByCriteria(criteria);
		return Response.successResponse(filteredOrders);
	}
}
