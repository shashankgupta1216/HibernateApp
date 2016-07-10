package me.sumitkawatra.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextUtil {
	
	private static ApplicationContext applicationContext;
	
	static {
		System.out.println("Application Context Loading Start..!");
		applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		System.out.println("Application Context Loading Finish..!");		
	}
	
	public static ApplicationContext getContext() {		
		return ApplicationContextUtil.applicationContext;
	}
	
	public static void closeContext() {
		System.out.println("Done!!!");
		 ((AbstractApplicationContext)applicationContext).registerShutdownHook();
		System.out.println("Application Context deallocated.");
	}

}
