package com.cts.ecart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductApiResource {
	
	@GetMapping
	public String f1() {
		return "Spring Rest api app";
	}

}
