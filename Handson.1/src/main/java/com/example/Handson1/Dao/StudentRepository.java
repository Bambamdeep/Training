package com.example.Handson1.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Handson1.Model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{





	

}
