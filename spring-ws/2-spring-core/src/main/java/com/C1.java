package com;

public class C1 {
	
	
	private String personName;
	

	public C1() {
		System.out.println(">> C1 class object created on "+System.identityHashCode(this));
	}
	
	
	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}


	public void f1() {
		System.out.println(">> f1 method called on "+System.identityHashCode(this));
		System.out.println("Person Name is "+personName);
	}

}
