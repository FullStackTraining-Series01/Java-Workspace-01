package com.example.demo.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.controller.StudentVO;
import com.example.demo.dao.StudentDAO;
import com.example.demo.dao.entity.StudentEntity;
import com.example.demo.dao.jpa.StudentJPA;

@Repository
public class StudentDaoImpl implements StudentDAO {

	@Autowired
	StudentJPA jpa;
	
	@Override
	public StudentVO getStudent(String name1) {
		
		
		Optional<StudentEntity> student2 =  jpa.findById(name1);
		
		StudentEntity entity = student2.get();
		
		StudentVO student3 = new StudentVO();
		student3.setName(entity.getName());
		student3.setRollnum(entity.getRollnum());
		student3.setDob(entity.getDob());
		
		return student3;
	}
	@Override
	public StudentVO getStudent40(String name1) {
		
		
		 jpa.deleteById(name1);
		
		

		 
		return null;
	}

	@Override
	public StudentVO getStudent5(String name1, String rollnum, StudentVO student) {
		
		
		StudentEntity student2 = new StudentEntity();
		student2.setName(student.getName());
		student2.setRollnum(student.getRollnum());
		student2.setDob(student.getDob());
		
		jpa.save(student2);
		return null;
	}
	@Override
	public void deleteAllStudents() {
		jpa.deleteAll();
		
	}
	
	@Override
	public List<StudentVO> getAllStudents() {
		
		
		List<StudentEntity> students = jpa.findAll();
		
		List<StudentVO> studentVOList = new ArrayList<>();
		
		for (StudentEntity studentEntity : students) {
			
			StudentVO student = new StudentVO();
			student.setName(studentEntity.getName());
			student.setRollnum(studentEntity.getRollnum());
			student.setDob(studentEntity.getDob());
			
			studentVOList.add(student);
		}
		
		return studentVOList;
		
		
		
		
//		Map<String, String> abcMap = new HashMap<>();
//		
//		abcMap.put("1", "Ajay");
//		
//		System.out.println(abcMap);
		
	}

}
