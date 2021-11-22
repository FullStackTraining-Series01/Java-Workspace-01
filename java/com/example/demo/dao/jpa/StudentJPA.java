package com.example.demo.dao.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dao.entity.StudentEntity;

public interface StudentJPA extends JpaRepository<StudentEntity, String>{

}
