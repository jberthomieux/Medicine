package com.jackson.model;

public class AuthToken {
	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public AuthToken(String token) {
		super();
		this.token = token;
	}

	public AuthToken() {
		super();
	}
}
