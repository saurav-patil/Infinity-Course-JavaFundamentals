package com.infinity.array2;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1001, "Virat", "8765321456", "Java", 10000);
		Student student2 = new Student(1002, "Rohit", "8765321459", "Python", 12000);
		Student student3 = new Student(1003, "Rahul", "8765321455", "C", 10000);
		Student student4 = new Student(1004, "Rishabh", "8765321453", "C++", 7000);
		Student student5 = new Student(1005, "Karthik", "8765321451", "Java", 10000);

		// datatype _ nameOFArray[] = new datatype[size]
		Student students[] = new Student[5];
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		students[3] = student4;
		students[4] = student5;

		StudentServices.displayStudentByCourse(students, "Java");

		System.out.println("The total fees of all the students is - Rs."+StudentServices.getTotalFees(students));
	}

}
