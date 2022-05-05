package com.jocdedaus.demo.model.exception;

import org.springframework.stereotype.Component;

@Component
public class EmptyJugadorListException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorCode;
	private String errorMessage;

	public EmptyJugadorListException(String errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public EmptyJugadorListException() {

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

}
