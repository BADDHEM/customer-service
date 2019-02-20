package com.customer.wc.util;

import org.springframework.context.annotation.Bean;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;

@Component
public class VBeanConfig {

	@Bean
	public Jaxb2Marshaller getJaxb2Marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setPackagesToScan("wpackage");
		return marshaller;
	}
}
