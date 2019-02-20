package com.customer.wc.orders.dto;

public class OrderItemDTO {

	private String productName;
	private String productId;
	private String productImageUrl;
	private int noOfItems;
	private float priceOfEachItem;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductImageUrl() {
		return productImageUrl;
	}
	public void setProductImageUrl(String productImageUrl) {
		this.productImageUrl = productImageUrl;
	}
	public int getNoOfItems() {
		return noOfItems;
	}
	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}
	public float getPriceOfEachItem() {
		return priceOfEachItem;
	}
	public void setPriceOfEachItem(float priceOfEachItem) {
		this.priceOfEachItem = priceOfEachItem;
	}
	
	
}
