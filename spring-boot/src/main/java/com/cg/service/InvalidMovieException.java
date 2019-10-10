package com.cg.service;

public class InvalidMovieException extends Exception {

	public InvalidMovieException() {
		super();
	}

	public InvalidMovieException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public InvalidMovieException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public InvalidMovieException(String arg0) {
		super(arg0);
	}

	public InvalidMovieException(Throwable arg0) {
		super(arg0);
	}
	
}
