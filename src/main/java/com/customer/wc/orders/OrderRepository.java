package com.customer.wc.orders;

import java.util.List;

import com.customer.wc.orders.dto.OrderDTO;

public interface OrderRepository {

	
    String saveOrder(OrderDTO orderDTO);
	
	void deleteOrder(String orderId);
	
	List<OrderDTO> getCustomerOrders(String customerId);
	
	List<OrderDTO> getOrdersByCriteria(String criteria);
}
