package com.example.demo.service;


import java.util.List;

import com.example.demo.controller.StudentVO;

public interface StudentService {

	public StudentVO getStudent(String name1);


	public StudentVO getStudent40(String name1);

	
	public StudentVO getStudent5(
			 String name1, 
			 String rollnum,  
			 StudentVO student);


	public void deleteAllStudents();
	public List<StudentVO> getAllStudents();
}
