package br.com.api.error.handler;

public class ErrorHandler {
    
	private final String errorCode;
    private final String errorMessage;

    public ErrorHandler(final String errorCode, final String errorMessage) {
    	this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
    
    public ErrorHandler(final Integer errorCode, final String errorMessage) {
    	this.errorCode = errorCode.toString();
        this.errorMessage = errorMessage;
    }
    
    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
