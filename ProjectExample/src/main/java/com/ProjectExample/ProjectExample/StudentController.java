package com.ProjectExample.ProjectExample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
@Autowired
StudentService service;
@GetMapping("/get")
public List<Student> getAll(){
	return service.getAll();
}
@GetMapping("/insert")
public Student insert(@RequestBody Student student) {
	return service.insert(student);
}


}
