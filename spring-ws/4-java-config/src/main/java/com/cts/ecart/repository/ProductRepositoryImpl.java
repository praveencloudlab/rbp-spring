package com.cts.ecart.repository;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Repository
@Lazy
public class ProductRepositoryImpl {

	public ProductRepositoryImpl() {
		System.out.println(">> ProductRepositoryImpl object created...");
	}
}
