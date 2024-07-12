package com.example.handson4.Service;

import java.util.List;

import com.example.handson4.Exception.DataIncorrectException;
import com.example.handson4.Exception.IdNotFoundException;
import com.example.handson4.model.Student;

public interface StudentService {
 public Student add(Student student) ;
 public Student getById(int id) throws IdNotFoundException;
 public boolean delete (int id) throws IdNotFoundException;
 public Student update(Student student , int id);
 List<Student> findAll();
 
 
 
 
 
 
}
