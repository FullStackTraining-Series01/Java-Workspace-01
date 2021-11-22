package com.example.demo.service;



import com.example.demo.controller.StudentVO;

public interface StudentService {

	
	public StudentVO getStudent(String name1);

	public StudentVO getStudent40(String name1);

	public StudentVO getStudent4(
   			 String name1, 
   			 String rollnum,
   			 StudentVO student);
}