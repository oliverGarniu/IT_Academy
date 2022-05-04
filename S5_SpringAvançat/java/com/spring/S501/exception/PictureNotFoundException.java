package com.spring.S501.exception;

//import java.text.MessageFormat;

import org.springframework.stereotype.Component;

@Component
public class PictureNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//	public ShopNotFoundException(Long shopId) {
//		super(MessageFormat.format("No picture found with id", shopId));
//	}

	private String errorCode;
	private String errorMessage;

	@SuppressWarnings("unused")
	private Long pictureId;

	public PictureNotFoundException(final Long pictureId) {
		this.pictureId = pictureId;
	}
	
	public PictureNotFoundException(String errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public PictureNotFoundException() {

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
