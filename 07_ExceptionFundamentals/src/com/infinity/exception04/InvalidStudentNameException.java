package com.infinity.exception04;
//Runtimeexception is of type unchecked hence the subclass will be also of type unchecked;

class InvalidStudentNameException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidStudentNameException(String message) {
		super(message);
	}
}