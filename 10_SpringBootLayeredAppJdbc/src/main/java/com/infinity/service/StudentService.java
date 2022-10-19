package com.infinity.service;


import com.infinity.model.Student;

public interface StudentService {
	public boolean addStudent(Student student);
	
	public Student findStudentById(int studentId);
	
	public boolean deleteStudentById(int studentId);
	
	public boolean updateStudent(Student student);
}
