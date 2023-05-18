package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	System.out.println(">> main");
		
	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
	
	//C1 obj1 = ac.getBean("b3",C1.class);
	/*
	C1 obj1 = ac.getBean("b3",C1.class);
	C1 obj2 = ac.getBean("b1",C1.class);
	C1 obj3 = ac.getBean("b1",C1.class);
	C1 obj4 = ac.getBean("b1",C1.class);
	
	obj1.f1();
	obj2.f1();
	obj3.f1();
	obj4.f1();
	
	*/
	
	
	

	}

}
