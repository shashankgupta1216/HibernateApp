package me.sumitkawatra.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringBean {
	
	@Autowired
	private Dependency dependency;

	public SpringBean() {
		super();
	}

	public Dependency getDependency() {
		return dependency;
	}

	public void setDependency(Dependency dependency) {
		this.dependency = dependency;
	}
	
	@PostConstruct
	private void init() {
		System.out.println("Spring + @PostConstruct");
	}
	
	@PreDestroy
	private void destroy() {
	System.out.println("Spring + @PreDestroy");	
	}
}
