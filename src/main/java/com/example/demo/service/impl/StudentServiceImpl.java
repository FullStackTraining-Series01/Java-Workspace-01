package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.StudentVO;
import com.example.demo.dao.StudentDAO;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl  implements StudentService{
	
	@Autowired
	StudentDAO dao;
	
	public StudentVO getStudent(String name1) {
	
		StudentVO student2 = new StudentVO();
		student2.setName("Ajay2");
		student2.setRollnum("2");
		student2.setDob("5-JAn"); 
		
		return dao.getStudent(name1);
		
	}
	
	public StudentVO getStudent40(String name1) {
	
		StudentVO student2 = new StudentVO();
		student2.setName("Ajay2");
		student2.setRollnum("2");
		student2.setDob("5-JAn"); 
		
		return dao.getStudent40(name1);
		
	}
	public StudentVO getStudent5(
			 String name1, 
			 String rollnum,  
			 StudentVO student) {
		
		/*StudentVO student2 = new StudentVO();
		student2.setName("Ajay2");
		student2.setRollnum("2");
		student2.setDob("5-JAn");*/
		
		
		
		return dao.getStudent5(name1, rollnum, student);
	}

	@Override
	public void deleteAllStudents() {
		dao.deleteAllStudents();
	}

	@Override
	public List<StudentVO> getAllStudents() {
		return dao.getAllStudents();
	}
}
