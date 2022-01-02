package com.glamtech.glamup.exception;

public class MakeupArtistDAOException extends Exception {

	private static final long serialVersionUID = 1L;

	public MakeupArtistDAOException() {
		super();
	}

	public MakeupArtistDAOException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MakeupArtistDAOException(String message, Throwable cause) {
		super(message, cause);
	}

	public MakeupArtistDAOException(String message) {
		super(message);
	}

	public MakeupArtistDAOException(Throwable cause) {
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
