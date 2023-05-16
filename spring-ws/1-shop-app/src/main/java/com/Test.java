package com;

public class Test {

	public static void main(String[] args) {
		
		//create cart
		String cart1[]= {"P01","P02","P03"};
		String cart2[]= {"P01","P02"};

		
		
		//===============================================
		//create PriceMatrixImpl class object
			PriceMatrixImpl price=new PriceMatrixImpl(); // dependency
		//create biller object
			BillingImpl biller=new BillingImpl(); // dependent
			biller.setPrice(price);// Injecting/passing dependency object(price) to the dependent object (biller) is called DI
			
		//===============================================
		
		//pass cart to biller to get total 
		double total = biller.getCartTotal(cart1);
		System.out.println("Cart1 Total: "+total);
		
		total = biller.getCartTotal(cart2);
		System.out.println("Cart2 Total: "+total);

		 
		

	}

}
