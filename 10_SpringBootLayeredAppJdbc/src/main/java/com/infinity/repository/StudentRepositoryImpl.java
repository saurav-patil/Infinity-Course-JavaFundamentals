package com.infinity.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.infinity.model.Student;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

	@Autowired
	private JdbcTemplate template;
	
	@Override
	public boolean createStudent(Student student) {
		String query = "Insert into student(Student_Id, Student_Name, Student_Score) values(?, ?, ?)";
		int result = template.update(query, student.getStudentId(), student.getStudentName(), student.getStudentScore());
		return result == 1 ? true : false;
	}

	@Override
	public Student readStudentById(int studentId) {
		String query = "Select * from student where Student_Id = ?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = template.queryForObject(query, rowMapper, studentId);
		return student;
	}

	@Override
	public boolean deleteStudentById(int studentId) {
		String query = "Delete from student where Student_Id = ?";
		int flag = template.update(query, studentId);
		return flag ==  1? true : false;
	}

	@Override
	public boolean updateStudent(Student student) {
		String query = "Update student Set Student_Name = ?, Student_Score = ? where Student_Id = ?";
		int flag = template.update(query, student.getStudentName(), student.getStudentScore(), student.getStudentId());
		return flag ==  1? true : false;
	}

}
