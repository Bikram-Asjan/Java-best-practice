package com.bikram.regex;

public class ValidationException extends Exception{
	private String errorMessage;
	
	public ValidationException(String errorMessage){
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

}
