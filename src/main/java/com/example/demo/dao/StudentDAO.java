package com.example.demo.dao;

import java.util.List;

import com.example.demo.controller.StudentVO;

public interface StudentDAO {

	public StudentVO getStudent(String name1);

	public StudentVO getStudent40(String name1);

	
	public StudentVO getStudent5(
			 String name1, 
			 String rollnum,  
			 StudentVO student);

	public void deleteAllStudents();

	public List<StudentVO> getAllStudents();


}
