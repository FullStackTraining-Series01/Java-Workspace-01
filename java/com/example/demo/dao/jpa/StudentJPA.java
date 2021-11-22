
package com.example.demo.dao.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dao.entity.StudentEntity;

//JPA Repository -- custom interface extends/


public interface  StudentJPA extends JpaRepository<StudentEntity, String>{

}