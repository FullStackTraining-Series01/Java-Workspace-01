package com.example.demo.hibernativeORMapping;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.StudentEntity;

@Entity
@Table(name = "Dept") 
public class DepartmentEntity  {

	@Id
	private String deptNum;
	
	@Column
	private String name;
	
	@OneToMany //mappedTo
	private List<StudentEntity> studentList; 

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public List<StudentEntity> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<StudentEntity> studentList) {
		this.studentList = studentList;
	}

	public String getDeptNum() {
		return deptNum;
	}

	public void setDeptNum(String deptNum) {
		this.deptNum = deptNum;
	}

	
}
