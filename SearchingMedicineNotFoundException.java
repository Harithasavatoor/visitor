package com.capgemini.medicalstoremanagement.exception;

public class SearchingMedicineNotFoundException extends RuntimeException {
	public String getMessage() {
		return "Medicine is not available";
	}

}
