package com.RestDemo.RestDemoExample.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.RestDemo.RestDemoExample.Model.Student;

@RestController
public class DemoController {

	@GetMapping("/city/{city}")
     public String city(@PathVariable("city")String city) {
	return "your city is" + city;
	}
	@GetMapping ("/name/{name}")
		public String name(@PathVariable("name")String name) {
			return "Your Name Is "+ name;
		}
	// new ReponseEntity<>("response Data",HttpStatus.ACCEPTED);
	
		@GetMapping("/test")
		public ResponseEntity<String> test5(){
			return new ResponseEntity<>("Response Data whic is present in Response Entity", HttpStatus.CREATED	);
		}
		
		@GetMapping("/test1")
		public ResponseEntity<Student> test1() {
			Student student = new Student(1, "Deepak", "bangalore");
			return new ResponseEntity<>(student,HttpStatus.OK);
		}
	@GetMapping("/test5")
	public String test() { 
		return "This is only to test";
	}
	
	@PostMapping("/test2")
	public Student test2(@RequestBody Student student) {
		student.setName("Deepak");
		student.setPid(2329039);
		student.setAddress("Patna");
	
		return student;
	}
	@PutMapping("/test3")
	public String test3() {
		return "put mapping is called";
	}
	@DeleteMapping("/test4")
	public String test4() {
		return "delete3 mapping is called";
	}
	@ResponseStatus(HttpStatus.ACCEPTED)
	@GetMapping("/test6")
	public String test6() {
		return "Response Data";
	}
	}
	
	
	
