package com.infinity.java8_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();

		Student student1 = new Student(101, "Sachin", 50);
		Student student2 = new Student(102, "Virat", 92);
		Student student3 = new Student(103, "Chahal", 80);
		Student student4 = new Student(104, "Yuvi", 85);

		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);

		displayList(list);

//		Comparator<Student> comparator = (Student s1, Student s2) -> {
//
//			return s1.getStudentId() < s2.getStudentId() ? 1 : -1;
//		};

		// Compact Code:
		Comparator<Student> comparator = (s1, s2) -> s1.getStudentId() < s2.getStudentId() ? 1 : -1;
		System.out.println("Student by student id : Desc");

		Collections.sort(list, comparator);
		displayList(list);

//		Comparator<Student> comparator2 = (s1, s2) -> s1.getStudentScore() < s2.getStudentScore() ? 1 : -1;
		System.out.println("Student by student score : Desc");

		Collections.sort(list, (s1, s2) -> s1.getStudentScore() < s2.getStudentScore() ? 1 : -1);
		displayList(list);

	}

	private static void displayList(List<Student> studentList) {
		Iterator<Student> itr = studentList.iterator();
		while (itr.hasNext()) {
			Student str = itr.next();
			System.out.println(str);
		}
		System.out.println("-------------------------------------------------------------");
	}

}
