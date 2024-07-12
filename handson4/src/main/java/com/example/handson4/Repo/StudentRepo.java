package com.example.handson4.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.handson4.model.Student;

import jakarta.transaction.Transactional;

public interface StudentRepo extends JpaRepository<Student,Integer>{

}
