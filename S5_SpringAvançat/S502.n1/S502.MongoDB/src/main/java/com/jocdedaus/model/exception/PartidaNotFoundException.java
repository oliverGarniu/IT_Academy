package com.jocdedaus.model.exception;

import org.springframework.stereotype.Component;

@Component
public class PartidaNotFoundException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

//	public PartidaNotFoundException(int partidaId) {
//		super(MessageFormat.format("No partida found with id", partidaId));
//	}

    private String errorCode;
    private String errorMessage;

    @SuppressWarnings("unused")
    private int partidaId;

    public PartidaNotFoundException(final int partidaId) {
        this.partidaId = partidaId;
    }

    public PartidaNotFoundException(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public PartidaNotFoundException() {

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
