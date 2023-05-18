package com;

public class C2 {
	
	
	private String personName;
	

	public C2() {
		System.out.println(">> C2 class object created on "+System.identityHashCode(this));
	}
	
	
	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}


	public void f2() {
		System.out.println(">> f1 method called on "+System.identityHashCode(this));
	}

}
