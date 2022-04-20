package com.mdm.exception;

public class MdmException extends Exception {
	private static final long serialVersionUID = 1L;

	public MdmException(String message) {
		super(message);
	}

	public MdmException(Throwable cause) {
		super(cause);
	}

	public MdmException(String message, Throwable cause) {
		super(message, cause);
	}
	
	

}
