package me.sumitkawatra.model;

public class B {

	private A a;

	public B() {
		super();		
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	public B(A a) {
		super();
		this.a = a;
	}
	
}
