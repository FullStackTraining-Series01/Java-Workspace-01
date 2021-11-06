package com.example.demo.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
	
	@JsonProperty
	private String name;
	
	@JsonProperty
	 private String technology;
	
	@JsonProperty
	private String industry;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	
	@Override
	public String toString() {
		
		
		
		return "name= "+name+" technology= "+technology+ "industry "+industry;
	}

}
