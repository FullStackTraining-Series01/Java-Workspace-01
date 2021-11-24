package com.example.demo.hibernativeORMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.demo.StudentEntity;

@Entity
@Table(name = "Trainee") 
public class TrainerEntity  {

	@Id
//	@GeneratedValue
	private String rollNum;
	
	@Column
	private String name;
	
	@Column
	//@JoinColumn
	private String dob;
	
	@OneToOne
	private StudentEntity student; 

	public String getRollNum() {
		return rollNum;
	}

	public void setRollNum(String rollNum) {
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public StudentEntity getStudent() {
		return student;
	}

	public void setStudent(StudentEntity student) {
		this.student = student;
	}
}
