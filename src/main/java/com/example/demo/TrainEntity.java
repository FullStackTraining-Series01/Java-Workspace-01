package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

;
@Entity
@Table(name = "Train")
public class TrainEntity  {

//	@EmbeddedId
	@Id
	@GeneratedValue //generator, strategy
	private Integer rollNum;
	
//	@EmbeddedId
	@Column
	private String name;
	
//	@Embedded
//	private MyIdClass  idClass;
	
	@Column
	private String dob;

	public Integer getRollNum() {
		return rollNum;
	}

	public void setRollNum(Integer rollNum) {
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
}
