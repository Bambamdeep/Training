package com.example.demo;

import java.util.List;

public interface StudentService {
public List<Student> getAllRecord();
public Student getRecordById(int id);
public void deletestudent(int id);
public Student addRecord(Student student);
public List<Student> findByIdGreaterThan(int id);

}
