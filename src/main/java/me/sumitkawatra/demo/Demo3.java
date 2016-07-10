package me.sumitkawatra.demo;

import me.sumitkawatra.model.Company;
import me.sumitkawatra.util.ApplicationContextUtil;

public class Demo3 {
	public static void main(String[] args) {
	Company company = ApplicationContextUtil.getContext().getBean(Company.class,"company3");
		
		System.out.println(company);		
		System.out.println(ApplicationContextUtil.getContext().isPrototype("company3"));
		System.out.println(ApplicationContextUtil.getContext().isSingleton("company3"));
		ApplicationContextUtil.closeContext();
	
	}	
}
