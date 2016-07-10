package me.sumitkawatra.demo;

import me.sumitkawatra.model.Company;
import me.sumitkawatra.util.ApplicationContextUtil;

public class Demo2 {
	
	public static void main(String[] args) {
		Company company = ApplicationContextUtil.getContext().getBean(Company.class,"company2");
		
		System.out.println(company);		
		System.out.println(ApplicationContextUtil.getContext().isPrototype("company2"));
		System.out.println(ApplicationContextUtil.getContext().isSingleton("company2"));
		ApplicationContextUtil.closeContext();
	}

}
