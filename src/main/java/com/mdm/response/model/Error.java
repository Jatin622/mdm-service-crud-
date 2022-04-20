package com.mdm.response.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(value = Include.NON_NULL)
public class Error {

	private String identifier;
	private String message;

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Error(String identifier, String message) {
		super();
		this.identifier = identifier;
		this.message = message;
	}

	public Error(String message) {
		super();
		this.message = message;
	}

}