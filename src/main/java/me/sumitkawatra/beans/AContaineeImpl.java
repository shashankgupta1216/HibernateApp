package me.sumitkawatra.beans;

import org.springframework.stereotype.Component;

@Component
public class AContaineeImpl implements Containee {

	private String message;

	public AContaineeImpl() {		
		this("A");		
	}

	public AContaineeImpl(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}