package com.cts.ecart.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cts.ecart.dao.ProductDaoImpl;
//dependent
public class ProductServiceImpl {
	
	
	private ProductDaoImpl productRepository; // dependency
	
	public ProductServiceImpl() {}
	
	
	public ProductServiceImpl(ProductDaoImpl productRepository) {
		this.productRepository = productRepository;
	}


		
//	public void setProductRepository(ProductDaoImpl productRepository) {
//		this.productRepository = productRepository;
//	}

	public void saveProduct() {
		System.out.println("Service:: saving..");
		productRepository.save();
	}

}
