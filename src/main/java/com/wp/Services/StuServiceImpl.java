package com.wp.Services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wp.Dao.StuDao;
import com.wp.Models.Student;



@Service
public class StuServiceImpl implements StuService {
	
	@Autowired
	private StuDao studentDAO;
	
	@Override
	public void studentEntry(Student student) {
		studentDAO.addStudent(student);
	}

	@Override
	public void deleteStudent(int rno) {
		studentDAO.removeStudent(rno);
	}

	
	@Override
	public Student searchStudent(int rno) {
		return studentDAO.searchStudent(rno);
	}

	@Override
	public List<Student> viewAllStudents() {
		return studentDAO.getAllStudents();
	}

	
}