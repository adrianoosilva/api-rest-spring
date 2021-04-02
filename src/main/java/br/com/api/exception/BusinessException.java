package br.com.api.exception;

public class BusinessException extends Exception implements IException{

	private static final long serialVersionUID = 1L;
	
	private final String code;
	
	public BusinessException (final String code, final String message) {
		super(message);
		this.code = code;
	}

	@Override
	public String getCode() {
		return code;
	}
	
}
