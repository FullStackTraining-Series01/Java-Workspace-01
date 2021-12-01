package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

	@Autowired
	MyDAO dao;
	
	
	@Override
	public StudentVO getByDefaultImplicit(String rollNum) {
		// TODO Auto-generated method stub
		return dao.getByDefaultImplicit(rollNum);
	}

}
