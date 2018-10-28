package com.customer.wc.payment;

import java.util.TreeMap;

import org.springframework.stereotype.Service;

@Service
public class PaymentGateWayImpl implements PaymentGateWay {

	@Override
	public String generateCheckSum(PaytmRequest paytmrequest) {
		
		try {
			//save order and geneate OrderId
			TreeMap<String, String> paramMap = new TreeMap<String, String>();
			paramMap.put("MID", PaytmConstants.MID);
			paramMap.put("ORDER_ID", paytmrequest.getOrderId());
			paramMap.put("CUST_ID", "CUST00011");
			paramMap.put("INDUSTRY_TYPE_ID", PaytmConstants.INDUSTRY_TYPE_ID);
			paramMap.put("CHANNEL_ID", PaytmConstants.CHANNEL_ID);
			paramMap.put("TXN_AMOUNT", "1.00");
			paramMap.put("WEBSITE", PaytmConstants.WEBSITE);
			paramMap.put("EMAIL", "test@gmail.com");
			paramMap.put("MOBILE_NO", "9999999999");
			paramMap.put("CALLBACK_URL", PaytmConstants.PAYTM_URL);
		} catch (Exception e) {

		}
		return null;
	}

	
}
