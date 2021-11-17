package com.example.demo.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.StudentEntity;

public interface CourseJPA extends JpaRepository<StudentEntity, Long>{
}
