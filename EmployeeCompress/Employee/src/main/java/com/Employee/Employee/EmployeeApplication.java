 package com.Employee.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.Employee.Employee.Model.Employee;
import com.Employee.Employee.Service.EmployeeService;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.Employee.Employee.Service")
public class EmployeeApplication implements CommandLineRunner{
@Autowired
EmployeeService service;
	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Employee E = new Employee(101,"DEEPAK",12345,"Spring","M");
		Employee E1 = new Employee(102,"BAMBAM",123456,"Spring1","M");
		Employee E2 = new Employee(103,"PRATIK",123457,"Spring2","M");
		Employee E3 = new Employee(104,"HARIOM",123458,"Spring3","M");
		Employee E4 = new Employee(105,"RATNESH",123459,"Spring4","M");
		Employee E5 = new Employee(106,"ABIR",123450,"Spring5","M");
		
		service.addEmployee(E);
		service.addEmployee(E1);
		service.addEmployee(E2);
		service.addEmployee(E3);
		service.addEmployee(E4);

	}

}
