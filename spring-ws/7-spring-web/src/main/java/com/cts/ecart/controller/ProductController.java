package com.cts.ecart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@GetMapping(value = "/s1")
	public void f1() {
		System.out.println(">>ProductController :: f1 method");
	}

}
