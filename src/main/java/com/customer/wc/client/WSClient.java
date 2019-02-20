package com.customer.wc.client;

import java.io.IOException;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

public class WSClient extends WebServiceGatewaySupport {

	@Autowired
	Jaxb2Marshaller marshaller;
	
	@Autowired
	Jaxb2Marshaller unMarshaller;
	
   public void invokeClient(Object object) throws SOAPException {
	   WebServiceTemplate template = getWebServiceTemplate();
	   HttpComponentsMessageSender sender = new HttpComponentsMessageSender();
	   sender.setConnectionTimeout(600*1000);
	   sender.setReadTimeout(600*1000);
	   MessageFactory factory = MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL);
	   SaajSoapMessageFactory saajSoapMessageFactory = new SaajSoapMessageFactory(factory);
	   marshaller.setMtomEnabled(true);
	   template.setMarshaller(marshaller);
	   template.setUnmarshaller(unMarshaller);
	   template.marshalSendAndReceive("Url", object, new SoapActionCallback("url"+"/responseMethod") {

		@Override
		public void doWithMessage(WebServiceMessage message) throws IOException {
			// TODO Auto-generated method stub
			super.doWithMessage(message);
		}
		   
	   });
	   
   }
}
