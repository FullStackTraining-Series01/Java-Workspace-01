package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class MyIdClass {
	@Column
	private Integer rollNum;
	

	@Column
	private String name;
}
