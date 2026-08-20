package com.ws03.service;

public class UserAccountNotFoundException extends Exception {
	
	public UserAccountNotFoundException() {
		super();
	}
	
	public UserAccountNotFoundException(String message) {
		super(message);
	}
	
}
