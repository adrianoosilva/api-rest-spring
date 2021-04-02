package br.com.api.error.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.exception.BadCredentialsException;
import br.com.api.exception.BusinessException;
import br.com.api.exception.ErrorMessage;

@RestController
@ControllerAdvice
public class ApiExceptionHandler {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public ErrorHandler handleException(Exception e) {
        String code = ErrorMessage.CD_069;
        String message = ErrorMessage.UNEXPECTED_EXCEPTION;
        
		return new ErrorHandler(code, message + e.getMessage());
    }
    
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(BusinessException.class)
    public ErrorHandler handleBusinessException(BusinessException e) {
        return new ErrorHandler(e.getCode(), e.getMessage());
    }
    
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(BadCredentialsException.class)
    public ErrorHandler handleBadCredentialsException(BadCredentialsException e) {
        return new ErrorHandler(e.getCode(), e.getMessage());
    }
    
}
