package com.cts.ecart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.ecart.config.AppConfig;
import com.cts.ecart.service.ProductServiceImpl;

public class MainApp {
	
	public static void main(String[] args) {
		
		
	 ApplicationContext ac=	new AnnotationConfigApplicationContext(AppConfig.class);
	 
	 
	 //ProductServiceImpl ps = (ProductServiceImpl)  ac.getBean("prodService");
	// ProductServiceImpl ps = ac.getBean("prodService",ProductServiceImpl.class);
	// ProductServiceImpl ps = ac.getBean(ProductServiceImpl.class);
	 
	 ProductServiceImpl ps = ac.getBean("productServiceImpl",ProductServiceImpl.class);

	 
	 ps.f1();
		
		
		
	}

}
