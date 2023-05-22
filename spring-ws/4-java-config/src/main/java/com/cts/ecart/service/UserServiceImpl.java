package com.cts.ecart.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class UserServiceImpl {
	public UserServiceImpl() {
		
		System.out.println(">> UserServiceImpl object created..");
	}
}
