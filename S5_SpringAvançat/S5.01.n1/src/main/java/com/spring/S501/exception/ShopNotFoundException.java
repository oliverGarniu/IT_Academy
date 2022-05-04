package com.spring.S501.exception;

import org.springframework.stereotype.Component;

@Component
public class ShopNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//	public ShopNotFoundException(Long shopId) {
//		super(MessageFormat.format("No shop found with id", shopId));
//	}

	private String errorCode;
	private String errorMessage;

	@SuppressWarnings("unused")
	private Long shopId;

	public ShopNotFoundException(final Long shopId) {
		this.shopId = shopId;
	}

	public ShopNotFoundException(String errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public ShopNotFoundException() {

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
