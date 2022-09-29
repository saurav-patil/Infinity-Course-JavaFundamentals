package com.infinity.array2;

public class StudentServices {
	public static void displayStudentByCourse(Student arr[], String course) {
		for (int i = 0; i < arr.length; i++) {
			Student s = arr[i];
			if (s.getCourse().equals(course)) {
				s.display();
				System.out.println("-------------------------------------");
			}
		}
	}

	public static double getTotalFees(Student arr[]) {
		double total = 0;
		for (Student s : arr) {
			total += s.getFees();
		}
		return total;
	}

}
