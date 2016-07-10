package me.sumitkawatra.demo;

import me.sumitkawatra.model.Company;
import me.sumitkawatra.util.ApplicationContextUtil;

public class Demo1 {
	
	public static void main(String[] args) {
		Company company = ApplicationContextUtil.getContext().getBean(Company.class,"company");
		
		System.out.println(company);		
		
		System.out.println(ApplicationContextUtil.getContext().isPrototype("company"));
		System.out.println(ApplicationContextUtil.getContext().isSingleton("company"));
		ApplicationContextUtil.closeContext();
	}
	
}