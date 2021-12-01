package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MyJPA extends JpaRepository<StudentEntity, String> {

	StudentEntity getByName(String name);
	StudentEntity getByDob(String dob);
	
	StudentEntity getByNameAndRollNum(String name, String rollNum);
	
	//@Query(value = "SELECT dob from StudentEntity where name= :name") //JPQL or HQL
	//String getByCusom(@Param("name") String name);
	
	@Query(value = "SELECT dob from StudentEntity where name= 'Ajay'")
	String useCusom();
	
	
	@Query(value = "SELECT dob from StudentEntity where name= :name1")
	String useCusom(@Param("name1")  String name);
	
	@Query(value = "SELECT dob from Student where name= :name", nativeQuery = true) //JPQL or HQL
	String useByCusomNative(@Param("name") String name);
	
	
}
