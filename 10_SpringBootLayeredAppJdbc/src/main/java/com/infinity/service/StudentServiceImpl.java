package com.infinity.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infinity.model.Student;
import com.infinity.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository repository;
	
	@Override
	public boolean addStudent(Student student) {
		return repository.createStudent(student);
	}

	@Override
	public Student findStudentById(int studentId) {
		return repository.readStudentById(studentId);
	}

	@Override
	public boolean deleteStudentById(int studentId) {
		return repository.deleteStudentById(studentId);
	}

	@Override
	public boolean updateStudent(Student student) {
		return repository.updateStudent(student);
	}
}
