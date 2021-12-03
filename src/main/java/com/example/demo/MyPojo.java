package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MyPojo {

	@JsonProperty
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
