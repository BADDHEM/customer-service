package com.customer.wc.client;

import java.io.IOException;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamSource;

import org.apache.cxf.binding.soap.SoapHeader;
import org.apache.cxf.binding.soap.SoapMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

import com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl;

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
	   template.setMessageSender(sender);
	   MessageFactory factory = MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL);
	   SaajSoapMessageFactory saajSoapMessageFactory = new SaajSoapMessageFactory(factory);
	   template.setMessageFactory(saajSoapMessageFactory);
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
   
   public void setHeader(WebServiceMessage message) throws TransformerConfigurationException {
	   SoapMessage soapEnvelop = (SoapMessage) message;
	   StreamSource source = new StreamSource("header");
	   TransformerFactoryImpl factory = new TransformerFactoryImpl();
	   Transformer transformer = factory.newTransformer();
	   try {
		transformer.transform(source,null );
	} catch (TransformerException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
