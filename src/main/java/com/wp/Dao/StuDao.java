package com.wp.Dao;



import java.util.List;

import com.wp.Models.Student;


public interface StuDao {
	public void addStudent(Student student);
	public void removeStudent(int rno);
	public Student searchStudent(int rno);
	public List<Student> getAllStudents();
	
		
}