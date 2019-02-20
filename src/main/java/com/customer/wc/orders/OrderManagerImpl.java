package com.customer.wc.orders;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.customer.wc.util.UniqueIdGenerator;
import com.customer.wc.orders.dto.OrderDTO;

@Service
public class OrderManagerImpl implements OrderManager {

	
	@Resource
	OrderRepository orderRepository;
	
	@Resource
	UniqueIdGenerator uniqueIdGenerator;
	
	@Override
	public String saveOrder(OrderDTO orderDTO) {
		String orderID = uniqueIdGenerator.nextString();
		orderID = "ORDER"+orderID;
		orderDTO.setOrderId(orderID);
		orderRepository.saveOrder(orderDTO);
		return "order SuccessFully created";
	}

	@Override
	public void deleteOrder(String orderId) {
		orderRepository.deleteOrder(orderId);
	}

	@Override
	public List<OrderDTO> getCustomerOrders(String customerId) {
		return orderRepository.getCustomerOrders(customerId);
	}

	@Override
	public List<OrderDTO> getOrdersByCriteria(String criteria) {
		return orderRepository.getOrdersByCriteria(criteria);
	}

	
}
