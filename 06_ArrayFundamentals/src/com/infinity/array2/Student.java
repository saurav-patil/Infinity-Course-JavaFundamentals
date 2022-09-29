package com.infinity.array2;

public class Student {
	private int studentId;
	private String studentName;
	private String contactNo;
	private String course;
	private double fees;

	Student(int id, String name, String phone, String course, double fees) {

		studentId = id;
		studentName = name;
		contactNo = phone;
		this.course = course;
		this.fees = fees;

	}
	
	public void display()
	{
		System.out.println("ID - "+studentId);
		System.out.println("Name - "+studentName);
		System.out.println("Contact No - "+contactNo);
		System.out.println("Course - "+this.course);
		System.out.println("Fees - "+this.fees);
	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public String getCourse() {
		return course;
	}

	public double getFees() {
		return fees;
	}

}
