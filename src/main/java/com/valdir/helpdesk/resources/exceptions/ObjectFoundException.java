package com.valdir.helpdesk.resources.exceptions;

public class ObjectFoundException extends RuntimeException {
		private static final long serialVersionUID = 1L;

		public ObjectFoundException(String message, Throwable cause) {
			super(message, cause);
		}

		public ObjectFoundException(String message) {
			super(message);
		}
		
		
	

}
