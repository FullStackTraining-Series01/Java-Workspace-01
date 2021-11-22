
package com.example.demo.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StudentTab")
public class StudentEntity {

	@Id
	@Column(name = "rollNum")
	private String rollnum;

	@Column(name = "name1")
	private String name;
	
	@Column(name = "dob")
	private String dob;
	
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
	public String getRollnum() {
		return rollnum;
	}
	public void setRollnum(String rollnum) {
		this.rollnum = rollnum;
	}
}