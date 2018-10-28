package com.customer.wc.payment;

public interface PaymentGateWay {

	String generateCheckSum(PaytmRequest paytmrequest);
}
