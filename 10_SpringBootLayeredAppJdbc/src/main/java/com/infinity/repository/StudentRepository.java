package com.infinity.repository;



import com.infinity.model.Student;

public interface StudentRepository {
	public boolean createStudent(Student student);
	
	public Student readStudentById(int studentId);
	
	public boolean deleteStudentById(int studentId);
	
	public boolean updateStudent(Student student);
	
	
}
