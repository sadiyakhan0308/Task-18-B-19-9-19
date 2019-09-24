package com.wp.Services;

import java.util.List;

import com.wp.Models.Student;

public interface StuService {
	public void studentEntry(Student student);
	public void deleteStudent(int rno); 
	public Student searchStudent(int rno);
	public List<Student> viewAllStudents();
	public void updateStudent(Student student);
	public void changeStudentDetails(Student student);
		
	

}
