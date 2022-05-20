package com.valdir.helpdesk.resources.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourcesExceptionHandler {

	@ExceptionHandler(ObjectFoundException.class)
	public ResponseEntity<StandartError> objectFoundException( ObjectFoundException ex, HttpServletRequest request ){
		
		StandartError error = new StandartError(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(), "Object Not Found",
		ex.getMessage(), request.getRequestURI());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
		
	}
	
	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<StandartError> dataIntegrityViolationException( DataIntegrityViolationException ex,
			HttpServletRequest request ){
		
		StandartError error = new StandartError(System.currentTimeMillis(), HttpStatus.BAD_REQUEST.value(), "Violação de Dados",
		ex.getMessage(), request.getRequestURI());
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
	}
}


