package com.infinity.exception04;

//No throws block required in case of unchecked exceptions:

public class Test {

	public static void checkName(String name) {
		if (name.matches("[A-Za-z]+")) {
			System.out.println("Valid Name");
		} else {
			throw new InvalidStudentNameException("Invalid Name = " + name);
		}
	}

	public static void main(String[] args) {
		String studentName = "Virat@12";
		try {
			Test.checkName(studentName);
		} catch (InvalidStudentNameException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End of Program");

	}

}
