package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
	
	C1 c1Obj = ac.getBean("b1",C1.class);
	
	c1Obj.f1();
	
	
	

	}

}
