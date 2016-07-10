package me.sumitkawatra.demo;

import me.sumitkawatra.model.MySingleton;
import me.sumitkawatra.util.ApplicationContextUtil;

public class Demo4 {
	
	public static void main(String[] args) {
		MySingleton singleton = ApplicationContextUtil.getContext().getBean(MySingleton.class,"mySingleton");
		
		System.out.println(singleton.hashCode());
		System.out.println(MySingleton.getInstance().hashCode());
	}

}
