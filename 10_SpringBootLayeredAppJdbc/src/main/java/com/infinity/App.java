package com.infinity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.infinity.model.Student;
import com.infinity.service.StudentService;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);
		StudentService service = context.getBean(StudentService.class);

		Student student = context.getBean(Student.class);
		student.setStudentId(101);
		student.setStudentName("Virat");
		student.setStudentScore(340);

		Student updateStudent = new Student();
		updateStudent.setStudentId(102);
		updateStudent.setStudentName("Rohit");
		updateStudent.setStudentScore(450);

		/*
		 * boolean addResult1 = service.addStudent(student);
		 * 
		 * if (addResult1 == true) {
		 * System.out.println("Student data addded successfully."); } else {
		 * System.out.println("Student data failed to add."); }
		 */

		/* readStudentById */
//		int findStudentById = 101;
//		Student findResultStudent = service.findStudentById(findStudentById);
//		System.out.println(findResultStudent);

		/* deleteStudentById */
//		int deleteStudentId = 106;
//		boolean delResult = service.deleteStudentById(deleteStudentId);
//		if (delResult == true) {
//			System.out.println("Student data deleted successfully.");
//		} else {
//			System.out.println("Student data failed to delete.");
//		}

		/* updateStudent */ 		
		boolean updateResult = service.updateStudent(updateStudent);
		if (updateResult == true) {
			System.out.println("Student data updated successfully.");
		} else {
			System.out.println("Student data updation failed.");
		}

	}

}
