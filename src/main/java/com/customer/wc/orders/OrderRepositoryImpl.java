package com.customer.wc.orders;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.customer.wc.orders.dto.OrderDTO;

public class OrderRepositoryImpl implements OrderRepository{

	@Resource
	MongoOperations mongoOperations;
	
	@Override
	public void saveOrder(OrderDTO orderDTO) {
		 mongoOperations.save(orderDTO);
	}

	@Override
	public void deleteOrder(String orderId) {
		Query query = new Query(Criteria.where("orderId").is(orderId));
		mongoOperations.remove(query, OrderDTO.class);
	}

	@Override
	public List<OrderDTO> getCustomerOrders(String customerId) {
		Query query = new Query(Criteria.where("custId").is(customerId));
		return mongoOperations.find(query, OrderDTO.class);
	}

	@Override
	public List<OrderDTO> getOrdersByCriteria(String criteria) {
		Query query = new Query(Criteria.where("orderStatus").is(criteria));
		return mongoOperations.find(query, OrderDTO.class);
	}

	
	
}
