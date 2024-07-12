package com.example.Handson1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Handson1.Model.Student;
import com.example.Handson1.Service.StudentService;



@Controller
//@RequestMapping("/student")
public class StudentController {
@Autowired
StudentService service;
	@GetMapping("/login")
	public String login() {
		return "login";
	
	}
	@GetMapping("/Validate")
	public String valid(@RequestParam("name") String uname,@RequestParam ("pass") String pass) {
		if(uname.equals("bambam") && pass.equals("1234")) {
		return "hello";
		}
		else {
		return "notValid";
		}
	}
	@GetMapping("/add")
	public String addmission(Model model) {
		Student student = new Student();
		model.addAttribute("student",student);
		return "studentDataBase";
	}
	@GetMapping("/submit")
	public String submitform(@ModelAttribute Student student) {
		service.addStudent(student);
		return "hello";
		
	}
	@GetMapping("/get")
	public String allStudent(Model model) {
		List<Student> student  = service.allStudent();
		model.addAttribute("student",student);
		return "Showstudent";
	}
	 @GetMapping("/back")
	 public String back() {
		 return "hello";
	 }
}
