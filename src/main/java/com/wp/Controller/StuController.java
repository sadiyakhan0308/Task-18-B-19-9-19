package com.wp.Controller;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wp.Models.Student;
import com.wp.Services.StuService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class StuController {
	
	
	@Autowired
	private StuService studentService;
	
	
	@RequestMapping("removestudent")
	public ModelAndView deleteStudent(@RequestParam("rno") int rno){

		studentService.deleteStudent(rno);
		ModelAndView mv=new ModelAndView("redirect:viewallstudents");
		return mv;
	
	
	}
	@RequestMapping("viewallstudents")
	public ModelAndView showAllRecords(){
		List<Student> students=studentService.viewAllStudents();
		ModelAndView mv=new ModelAndView("studentlist");
		mv.addObject("students", students);
		return mv;
	}
	@RequestMapping("search")
	public ModelAndView searchDetaills(@RequestParam("rno") int rno) {
		Student student=studentService.searchStudent(rno);
		
		ModelAndView mv = new ModelAndView("getdetail");
		mv.addObject("student", student);
        return mv;

	}
	
	@RequestMapping("dataentry")
	public String showDataEntryForm(){
		return "studententry";
	}
	@RequestMapping("searchstudent")
	public String showSearchForm(){
		return "search";
	}
	
	@RequestMapping("remove")
	public String showDeleteForm(){
		return "delete";
	}
	@RequestMapping("savestudent")
	public ModelAndView saveStudentInfo(@ModelAttribute("student") Student student){
		studentService.studentEntry(student);
		ModelAndView mv=new ModelAndView("Savedetail");
		return mv;
	}
	
	
}

