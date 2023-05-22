package com.cts.ecart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cts.ecart.config.AppConfig;
import com.cts.ecart.service.ProductServiceImpl;

public class MainApp {
	
	public static void main(String[] args) {
		
		
	 AbstractApplicationContext ac=	new AnnotationConfigApplicationContext(AppConfig.class);
	 
	// System.out.println(">>> main");
	 
	 //ProductServiceImpl ps = (ProductServiceImpl)  ac.getBean("prodService");
	// ProductServiceImpl ps = ac.getBean("prodService",ProductServiceImpl.class);
	 //ProductServiceImpl ps = ac.getBean(ProductServiceImpl.class);
	 
	 //ProductServiceImpl ps = ac.getBean("productServiceImpl",ProductServiceImpl.class);

	 
	 //ps.f1();
	 
	 ac.close();
		
		
		
	}

}
