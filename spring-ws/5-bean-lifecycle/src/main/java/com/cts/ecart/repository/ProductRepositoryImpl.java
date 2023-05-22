package com.cts.ecart.repository;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Repository
@Lazy
public class ProductRepositoryImpl {

	public ProductRepositoryImpl() {
		//System.out.println(">> ProductRepositoryImpl object created on "+this.hashCode());
	}
	
	
	public void save() {
		System.out.println(">> saving :: Repository on "+this.hashCode());
	}
}
