package com.wp.Services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wp.Dao.StuDao;
import com.wp.Models.Student;


@Service
public class StuServiceImpl  implements StuService{

	
	@Autowired
	 private StuDao daoInterface;
	public void studentEntry(Student student) {
		daoInterface.addStudent(student);
		
	}

	public void deleteStudent(int code) {
		daoInterface.removeStudent(code);
		
	}

	public void changeStudentDetails(Student student) {
		daoInterface.updateStudent(student);
		
	}

	
	public Student searchStudent(int code) {
		
		return daoInterface.getStudentById(code);
	}

	public List<Student> viewAllStudents() {
		
		return daoInterface.getAllStudents();
	}

	public void updateStudent(Student student) {
		daoInterface.updateStudent(student);
		
	}

}