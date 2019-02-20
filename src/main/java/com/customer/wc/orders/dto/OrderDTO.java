package com.customer.wc.orders.dto;

import java.util.List;

import org.springframework.data.annotation.Id;

public class OrderDTO {

	@Id
	private String id;
	private String orderId;
	private String custId;
	List<OrderItemDTO> orderedItems;
	private float totalPrice;
	private String orderStatus;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public List<OrderItemDTO> getOrderedItems() {
		return orderedItems;
	}
	public void setOrderedItems(List<OrderItemDTO> orderedItems) {
		this.orderedItems = orderedItems;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
}