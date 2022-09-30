package stream02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Test {

	public static void main(String[] args) {
		Student student1 = new Student(101, "Rahul", 90);
		Student student2 = new Student(102, "Rohit", 90);
		Student student3 = new Student(103, "Sachin", 91);
		Student student4 = new Student(104, "Kohli", 92);
		Student student5 = new Student(105, "Dhoni", 90);

		List<Student> studentsList = new ArrayList<>();
		studentsList.add(student1);
		studentsList.add(student2);
		studentsList.add(student3);
		studentsList.add(student4);
		studentsList.add(student5);

		Consumer<Student> consumer = (Student element) -> System.out
				.println(element.getStudentId() + "," + element.getStudentName() + "," + element.getStudentScore());
		
		studentsList.stream().forEach(consumer);
	}

}
