package com.glamtech.glamup.exception;

public class EventPlannerDAOException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EventPlannerDAOException() {
		super();
	}

	public EventPlannerDAOException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public EventPlannerDAOException(String message, Throwable cause) {
		super(message, cause);
	}

	public EventPlannerDAOException(String message) {
		super(message);
	}

	public EventPlannerDAOException(Throwable cause) {
		super(cause);
	}
	@Override
	public String getMessage() {
		return super.getMessage();
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	

}
