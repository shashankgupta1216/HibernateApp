package me.sumitkawatra.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class ContextLoader {
	private ApplicationContext applicationContext;
	
	public ContextLoader() {
		setApplicationContext(new ClassPathXmlApplicationContext("application-context.xml"));
	}

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public void setApplicationContext(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}
}
