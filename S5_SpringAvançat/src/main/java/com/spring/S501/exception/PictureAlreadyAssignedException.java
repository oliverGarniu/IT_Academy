package com.spring.S501.exception;

import org.springframework.stereotype.Component;

@Component
public class PictureAlreadyAssignedException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//	public PictureAlreadyAssignedException(final Long pictureId, final Long shopId) {
//		super(MessageFormat.format("El quadre: {0} ja està assignat a una altra botiga", pictureId, shopId));
//	}

	private String errorCode;
	private String errorMessage;

	@SuppressWarnings("unused")
	private Long shopId;

	public PictureAlreadyAssignedException(final Long pictureId, final Long shopId) {
		this.shopId = shopId;
	}

	public PictureAlreadyAssignedException(String errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public PictureAlreadyAssignedException() {

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
