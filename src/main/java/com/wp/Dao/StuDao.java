package com.wp.Dao;

import java.util.List;

import com.wp.Models.Student;

public interface StuDao {
	
	public void addStudent(Student student);
	public void removeStudent(int code);
	public void updateStudent(Student student);
	public Student getStudentById(int code);
	public List<Student> getAllStudents();

}