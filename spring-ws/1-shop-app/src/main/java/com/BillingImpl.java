package com;

//dependent
public class BillingImpl {
	
	/* ================= 
	 * Design Issues
	 * =================
	 * -> too many dependency object creations.
	 * 		-> Performance of application goes down
	 * 		-> memory management issues
	 * 
	 *  why this issue happened?
	 *  ============================
	 *  -> dependent class itself creating dependency class objects.
	 *  
	 *  what is the solution?
	 * ========================
	 * -> do not create dependency objects in the dependent class directly.
	 * -> use techniques like JNDI (java naming directory interface)
	 * 		-> JNDI location is tightly coupled with dependent classes
	 * 
	 *  what is the best solution?
	 *  ===========================
	 *  => do not create,nor use look ups. 
	 *     instead ask some one (container) to inject/pass dependency objects =>  (IoC): inversion of control
	 * 
	 *   how to implement IoC?
	 *   ========================
	 *   => by using dependency injection (DI) technique
	 *   
	 *   what is dependency injection?
	 *   ==============================
	 *   => injecting/passing dependency object to the dependent object
	 *   
	 *   how many ways DI can be implemented: 2 ways
	 *   =================================================
	 *   way-1 : setter based injection
	 *   way-2 : constructor based injection
	 *   
	 *   way-1 : setter based injection
	 *   ======================================
	 *   rules
	 *   ------
	 *   1.create reference of dependency at dependent class.
	 * 	 2. create/generate setter method for above defined property
	 * 
	 * 
	 */

	
	private PriceMatrixImpl price;
	
	public void setPrice(PriceMatrixImpl price) {
		this.price = price;
	}


	public double getCartTotal(String[] cart) {

		double total = 0.0;

		//PriceMatrixImpl price = new PriceMatrixImpl(); //dependency

		for (String itemCode : cart) { // for each loop
			total = total + price.getItemPrice(itemCode);
		}
		return total;
	}

}
