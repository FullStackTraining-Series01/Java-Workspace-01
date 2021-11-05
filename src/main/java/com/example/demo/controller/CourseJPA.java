package com.example.demo.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.StudentEntity;
import com.example.demo.vo.Student;


public interface CourseJPA extends JpaRepository<StudentEntity, Long>{

}
