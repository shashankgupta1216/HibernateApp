package me.sumitkawatra.beans;

import org.springframework.stereotype.Component;

@Component
public class BContaineeImpl implements Containee {
	private String message;

	public BContaineeImpl(String message) {
		super();
		this.message = message;
	}

	public BContaineeImpl() {
		this("B");
	}

	public String getMessage() {

		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}