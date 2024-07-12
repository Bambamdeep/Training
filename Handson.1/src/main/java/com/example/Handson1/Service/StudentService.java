package com.example.Handson1.Service;


import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.PageRequest;

import com.example.Handson1.Exception.DataIncorrect;
import com.example.Handson1.Exception.StudentNotFound;
import com.example.Handson1.Model.Student;

public interface StudentService {
public Student addStudent(Student student) throws DataIncorrect;
public Student update(Student student , int sId) throws StudentNotFound;
public Student findById(int sId) throws StudentNotFound ;
public List<Student> allStudent(int pageNumber, int pageSize);
public void delete(int sId) throws StudentNotFound;
public List<Student> getStudentByName(String name);



}
