package com.example.Handson1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Handson1.Exception.DataIncorrect;
import com.example.Handson1.Exception.StudentNotFound;
import com.example.Handson1.Model.Student;
import com.example.Handson1.Service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController1 {
	@Autowired
	StudentService service;
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student) throws DataIncorrect{
		if(student.getsId()==0 || student.getName()==null || student.getStandard()==0 || student.getSchoolName()== null || student.getPhone()==0){
					throw  new DataIncorrect();
				}
		return service.addStudent(student);
	}
	@GetMapping("/get")
	public List<Student> allStudent(@RequestParam(value = "pageNumber",defaultValue="0",required =false) int pageNumber , @RequestParam(value ="pageSize",defaultValue="5",required =false) int pageSize)
			{
	
		return service.allStudent(pageNumber,pageSize);
	}
	
	@DeleteMapping("/delete/{sId}")
	public String delete(@PathVariable int sId) {
	   service.delete(sId);
	   return "The Student is Deleted with the given id";  
	}
	@GetMapping("/search/{name}")
	public List<Student> getStudentByName(@PathVariable String name){
		return service.getStudentByName(name);
		
	}
	@PutMapping("update/{sId}")
	public Student update(@RequestBody Student student , @PathVariable int sId) {
		return service.update(student, sId);
	}
	@GetMapping("/id/{sId}")
	public Student findById(@PathVariable int sId) {
		return service.findById(sId);
	}
  }

