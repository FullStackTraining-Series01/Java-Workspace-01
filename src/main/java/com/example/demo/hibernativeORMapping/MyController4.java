package com.example.demo.hibernativeORMapping;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.MyJPA;
import com.example.demo.StudentEntity;

@RestController
public class MyController4 {

	@Autowired
	TrainerJPA trainerJpa;
	
	@Autowired
	MyJPA studentJPA;

	@Autowired
	DepartmentJPA deptJPA;
	
	@GetMapping("/hmOneToOne")
	private String hm() {
		
	
		
		TrainerEntity traineee = new TrainerEntity();
		
		traineee.setRollNum("5");
		
		StudentEntity student = new StudentEntity();
		student.setRollNum("1");
		
		traineee.setStudent(student);
		
		
		studentJPA.save(student);
		trainerJpa.save(traineee);
		
		
		return "success";
	}
	
	
	@GetMapping("/hmOneToOne1")
	private String hm1() {
		
			
		TrainerEntity traineee = new TrainerEntity();		
		traineee.setRollNum("5");
		
		StudentEntity student = new StudentEntity();
		student.setRollNum("10");		
		traineee.setStudent(student);
		trainerJpa.save(traineee);
		
		
		return "success";
	}
	
	
	@GetMapping("/hmOneToOne2")
	private String hm3() {
		
		StudentEntity student = new StudentEntity();
		student.setRollNum("10");	
		student.setName("Ajay");student.setDob("4-July");
		
		studentJPA.save(student);
		studentJPA.save(student);
		
		
		
		return "success";
	}
	@GetMapping("/hmOneToMany")
	private String hm2() {
		
	
		
		DepartmentEntity dept = new DepartmentEntity();
		
		dept.setDeptNum("123");
		dept.setName("CSE");
		
	
		List<StudentEntity> studentList = new ArrayList();
		
		StudentEntity studentEntity1 = new StudentEntity();
		studentEntity1.setRollNum("1234");
		studentEntity1.setName("Ajay-D1");
		
		StudentEntity studentEntity2 = new StudentEntity();
		studentEntity2.setRollNum("1235");
		studentEntity2.setName("Ajay-D2");

		studentList.add(studentEntity1 );
		studentList.add(studentEntity2 );
				
		
		dept.setStudentList(studentList );
		
		
		studentJPA.saveAll(studentList);
		deptJPA.save(dept);
		
		return "success";
	}
	
}
