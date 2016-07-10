package me.sumitkawatra.model;

public class VendingMachine {

	private String name;
	private Product product;

	public VendingMachine() {
		super();
	}

	public VendingMachine(String name, Product product) {
		super();
		System.out.println("Vending Machine Ready.");
		this.name = name;
		this.product = product;
	}	

	@Override
	public String toString() {
		return "VendingMachine [name=" + name + ", product=" + product + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
