package com.jocdedaus.model.exception;

import org.springframework.stereotype.Component;

@Component
public class JugadorNotFoundException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

//	public JugadorNotFoundException(int jugadorId) {
//		super(MessageFormat.format("No jugador found with id", jugadorId));
//	}

    private String errorCode;
    private String errorMessage;

    @SuppressWarnings("unused")
    private int jugadorId;

    public JugadorNotFoundException(final int jugadorId) {
        this.jugadorId = jugadorId;
    }

    public JugadorNotFoundException(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public JugadorNotFoundException() {

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


