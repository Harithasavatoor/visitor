package com.capgemini.medicalstoremanagement.exception;

public class LoginValidationException extends RuntimeException{
	public String getMessage() {
		return "Login Invalidation";
	}
}
