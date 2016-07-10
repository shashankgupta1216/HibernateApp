package me.sumitkawatra.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Container {
	@Autowired
	@Qualifier("BContaineeImpl")
	private Containee containee;

	public Container() {
		super();
	}

	public Container(Containee containee) {
		super();
		this.containee = containee;
	}

	public Containee getContainee() {
		return containee;
	}

	public void setContainee(Containee containee) {
		this.containee = containee;
	}
	
}