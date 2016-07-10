package me.sumitkawatra.model;

public class Product {
	String name;

	public Product() {
		super();		
	}

	public Product(String name) {
		super();
		System.out.println("Product Ready.");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
