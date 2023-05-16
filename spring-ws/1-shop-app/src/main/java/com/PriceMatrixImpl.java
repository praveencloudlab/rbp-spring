package com;

//dependency
public class PriceMatrixImpl {
	/*
	 * 	Types of Java Objects : 2 types
	 * ==================================
	 * 	1.dependency : works independently. never depends on other objects
	 * 	2.dependent  : always depends on dependency objects.
	 * 
	 * 
	 */
	
	public PriceMatrixImpl() {
		System.out.println(">> PriceMatrixImpl object created");
	}
	
	public double getItemPrice(String itemCode) {
		// code to fetch price of a given itemCode from DB
		return 100.00;
	}

}
