package com.cts.ecart.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.cts.ecart.repository.ProductRepositoryImpl;

//@Service(value = "prodService")
@Service
//@Lazy(value = true) // @Bean will not work if the Lazy value set to be true
@Scope("prototype") // if scope is prototype , then @PreDestroy will not invoke
public class ProductServiceImpl {

	public ProductServiceImpl() {
		System.out.println(">>1.ProductServiceImpl object created on " + this.hashCode());
	}

	@Autowired
	private ProductRepositoryImpl productRepository;

	
	public void setProductRepository(ProductRepositoryImpl productRepository) {
		this.productRepository = productRepository;
	}

	@PostConstruct
	public void f1() {
		System.out.println(">>2.PostConstruct::f1 on " + this.hashCode());
	}

	@Bean // force not to use lazy init
	void f2() {
		System.out.println(">>3.Bean::f2 on " + this.hashCode());
		productRepository.save();
	}

	@Bean
	void f22() {
		System.out.println(">>3.Bean::f22 on " + this.hashCode());
	}

	@PreDestroy
	public void f3() {
		System.out.println(">>4.PreDestroy::f3 on " + this.hashCode());
	}

}
