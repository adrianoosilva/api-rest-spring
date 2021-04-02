package br.com.api.exception;

public class BadCredentialsException extends BusinessException implements IException{

	private static final long serialVersionUID = 1L;
	
	private static final String code = ErrorMessage.CD_001;

	public BadCredentialsException () {
		super(code, ErrorMessage.BAD_CREDENTIALS);
	}
	
	@Override
	public String getCode() {
		return code;
	}
}
