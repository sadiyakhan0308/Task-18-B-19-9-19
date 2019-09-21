package com.wp.Dao;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.wp.Models.Student;



@Repository
public class StuDaoImpl implements StuDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public void addStudent(Student student) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(student);
		tr.commit();
		session.close();
	}

	@Override
	public void removeStudent(int rno) {
		Session session=sessionFactory.openSession();
		Student student=session.get(Student.class, rno);
		
		Transaction tr=session.beginTransaction();
		session.delete(student);
		tr.commit();
		session.close();
	}


	@Override
	public Student searchStudent(int rno) {
		Session session=sessionFactory.openSession();
		Student student=session.get(Student.class,rno);
		session.close();
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		Session session=sessionFactory.openSession();
		Criteria cr=session.createCriteria(Student.class);
		List<Student> students=cr.list();
		session.close();
		return students;
	}

	
}