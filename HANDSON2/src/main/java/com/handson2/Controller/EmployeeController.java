package com.handson2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.handson2.Service.EmployeeService;

@RestController
//@RequestMapping("/emp")
public class EmployeeController {
@Autowired
EmployeeService service;
@GetMapping("/login")
public String login() {
	return "yes you are the user ";
}
@GetMapping("/all")
public String get() {
	return "list of emp";
}
@GetMapping("/al")
public String get1() {
	return "list of emp1";
}
}
