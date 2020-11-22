package com.webapp.rest.basic.auth;

public class AuthenticationBean {

	private String message;

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public AuthenticationBean(String message) {
		// TODO Auto-generated constructor stub
		this.message=message;
	}
	
	

}
