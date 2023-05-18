package com.cts.ecart.dao;

public class ProductDaoImpl {
	
	public ProductDaoImpl() {
		System.out.println("ProductDao object on "+System.identityHashCode(this));
	}
	
	public void save() {
		System.out.println("DAO:: saving  on  "+System.identityHashCode(this));
	}

}
