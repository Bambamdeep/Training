package com.Employee.Employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.Benefit.Benefits.Model.Benefit;
import com.Employee.Employee.Exception.DataIncorrectException;
import com.Employee.Employee.Exception.IdNotFoundException;
import com.Employee.Employee.Model.Employee;
import com.Employee.Employee.Service.EmployeeService;
import com.HealthCareProvider.Model.HealthCareProvider;

@RestController
@RequestMapping("/emp")
 public class EmployeeController {
	@Autowired
	EmployeeService service;
	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public Employee addEmployee(@RequestBody Employee employee) throws DataIncorrectException {
		if (employee.getEmpid()==0 || employee.getName()== null || employee.getPhone_no()==0 ||
			employee.getDept()== null || employee.getGender() == null	) {
			 throw new DataIncorrectException();
		}
		else {
		return service.addEmployee(employee);
		}
	}
	@GetMapping("/get")
	@ResponseStatus(HttpStatus.OK)
	public List<Employee> getAllEmployee(){
		return service.getAllEmployee();
	}
	@GetMapping("/search/{empid}")
	@ResponseStatus(HttpStatus.OK)
	public Employee searchById(@PathVariable int empid) throws IdNotFoundException{
		return service.searchById(empid);
	}
	@GetMapping ("/searchemp/{empid}")
	@ResponseStatus(HttpStatus.OK)
	public List <Benefit> searchbenefitByEmp(@PathVariable int empid) {
		return  service.searchbenefitByEmp(empid);
	}
	@GetMapping("/searchcare/{empid}")
	@ResponseStatus(HttpStatus.OK)
	public List<HealthCareProvider> searchEmpById(@PathVariable int empid){
		return service.searchEmpById(empid);
	}
}
