package com.spring.S402.n.exception;

public class NoEmployeeByPositionException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorCode;
	private String errorMessage;

	public NoEmployeeByPositionException() {
		super();
	}
	
	public NoEmployeeByPositionException(String errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "noEmployeeByPositionException [errorCode=" + errorCode + ", errorMessage=" + errorMessage + "]";
	}

}
