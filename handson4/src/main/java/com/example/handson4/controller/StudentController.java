package com.example.handson4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.handson4.Service.StudentService;
import com.example.handson4.model.Student;

import jakarta.validation.Valid;
@Validated
@RestController
@RequestMapping("/stu")
public class StudentController {
	@Autowired
	StudentService service;
 @PostMapping("/add")
 public Student add(@Valid @RequestBody Student student) {
	 return service.add(student);
 }
 @GetMapping("/get/{id}")
 public Student getById(@PathVariable int id) {
	 return service.getById(id);
 }
 @DeleteMapping("/delte/{id}")
 public String delete (@PathVariable int id) {
	 service.delete(id);
	 return "Student is Sucessfully Deleted With Given Id:" +id;
 }
 @PutMapping("/update/{id}")
 public Student update(@Valid @RequestBody Student student ,@PathVariable  int id) {
	 return service.update(student, id);
 }
 
 
}
