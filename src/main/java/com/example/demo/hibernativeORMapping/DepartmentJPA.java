package com.example.demo.hibernativeORMapping;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentJPA  extends JpaRepository<DepartmentEntity, String>{

	
}
