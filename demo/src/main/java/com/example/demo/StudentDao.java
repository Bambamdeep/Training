package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends JpaRepository<Student,Integer> {
  //public List<Student> findByroll_NoGreaterThan(int roll_No);

//public List<Student> findByRoll_NoGreaterThan(int roll_No);

public List<Student> findByIdGreaterThan(int id);
}
