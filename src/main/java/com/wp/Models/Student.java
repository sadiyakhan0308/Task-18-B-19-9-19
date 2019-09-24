package com.wp.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;

@Entity
public class Student {
    @Id
   
     private int rno;
    @Pattern(regexp="[a-zA-Z]*",message="only alphabetes allowed")
    private String name;
    private String dept;
    private String sem;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getSem() {
		return sem;
		
	}
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", dept=" + dept + ", sem=" + sem + "]";
	}
	public void setSem(String sem) {
		this.sem = sem;
	}
	
	
	

}