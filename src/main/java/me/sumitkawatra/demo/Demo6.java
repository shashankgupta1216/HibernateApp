package me.sumitkawatra.demo;

import me.sumitkawatra.model.Product;
import me.sumitkawatra.model.VendingMachine;
import me.sumitkawatra.util.ApplicationContextUtil;

/**
 * See here we are injecting prototype in prototype
 * @author Sumit Kawatra
 *
 */
public class Demo6 {
	
	public static void main(String[] args) {
		
		Product product = ApplicationContextUtil.getContext().getBean(Product.class,"product");
		VendingMachine machine = ApplicationContextUtil.getContext().getBean(VendingMachine.class,"vendingMachine");
		System.out.println(product.hashCode());
		System.out.println(machine.getProduct().hashCode());
	}

}
