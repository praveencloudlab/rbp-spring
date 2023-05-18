package com.cts.ecar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.ecart.service.ProductServiceImpl;

public class TestApp {
	
	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
		ProductServiceImpl ps = ac.getBean("prodService",ProductServiceImpl.class);
		ps.saveProduct();
		
		
	}

}
