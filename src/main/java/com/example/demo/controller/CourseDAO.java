package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.StudentEntity;
import com.example.demo.vo.Student;

@Repository
public class CourseDAO {
	
	@Autowired
	CourseJPA myjpa;
	public String insertStudentDetails(Student student) {
		
		System.out.println("in DAO class - student object"+student);
		System.out.println("in DAO class - student name"+student.getName());
		
		StudentEntity myentity= new StudentEntity();
		myentity.setName(student.getName());
		myentity.setTechnology(student.getTechnology());
		myentity.setIndustry(student.getIndustry());
		myjpa.save(myentity);
		
		return "success";
	}
}


