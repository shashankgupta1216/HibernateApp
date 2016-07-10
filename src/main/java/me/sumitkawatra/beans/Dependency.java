package me.sumitkawatra.beans;

import org.springframework.stereotype.Component;

@Component
public class Dependency {
	private String message;

	public Dependency() {
		super();
	}

	public Dependency(String message) {
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