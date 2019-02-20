package com.customer.wc.payment;

import org.springframework.data.annotation.Id;

public class PaytmRequest {

	@Id
	private String id;
	
	private String orderId;
	
	private String custId;
	
	private String taxAmount;
	
	private String checkSumHash;
	
	private String custMobile;
	
	private String email;
	
	private String callBackUrl;

	
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

	public String getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}


	public String getCheckSumHash() {
		return checkSumHash;
	}

	public void setCheckSumHash(String checkSumHash) {
		this.checkSumHash = checkSumHash;
	}

	public String getCustMobile() {
		return custMobile;
	}

	public void setCustMobile(String custMobile) {
		this.custMobile = custMobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCallBackUrl() {
		return callBackUrl;
	}

	public void setCallBackUrl(String callBackUrl) {
		this.callBackUrl = callBackUrl;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
