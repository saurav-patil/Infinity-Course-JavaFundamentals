package com.infinity.exception03;

//exception is of type checked hence the subclass will be also of type checked;
class InvalidStudentNameException extends Exception {
	public InvalidStudentNameException(String message) {
		super(message);
	}
}

public class Test {

	public static void checkName(String name) throws InvalidStudentNameException {
		if (name.matches("[A-Za-z]+")) {
			System.out.println("Valid Name");
		} else {
			throw new InvalidStudentNameException("Invalid Name = " + name);
		}
	}

	public static void main(String[] args) {
		String studentName = "Saurav@123";
		try {
			Test.checkName(studentName);
		} catch (InvalidStudentNameException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End of Program");

	}

}
