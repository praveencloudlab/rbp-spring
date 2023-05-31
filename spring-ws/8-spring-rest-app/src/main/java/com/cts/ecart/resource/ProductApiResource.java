package com.cts.ecart.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductApiResource {
	
	@GetMapping
	public String f1() {
		return "Welcome to Spring rest";
	}

}
