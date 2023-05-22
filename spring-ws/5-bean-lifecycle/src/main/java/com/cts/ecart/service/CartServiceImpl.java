package com.cts.ecart.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
@Lazy(value = true)
public class CartServiceImpl {
	
	public CartServiceImpl() {
		System.out.println(">> CartServiceImpl object created");
	}

}
