package com.exampleDataJpa.DataJpaExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataJpaExampleApplication implements CommandLineRunner{
@Autowired
EmployeeService service;
	public static void main(String[] args) {
		SpringApplication.run(DataJpaExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee(1,"Deepak",10000);
		Employee employee2 = new Employee(2,"Kumar",30000);
		Employee employee3 = new Employee(3,"Narendra",20000);
		Employee employee4 = new Employee(4,"Bhardwaj",40000);
		Employee employee5 = new Employee(5,"Rita",60000);
		Employee employee6 = new Employee(6,"Kumari",90000);
		service.addEmployee(employee1);
		service.addEmployee(employee2);
		service.addEmployee(employee3);
		service.addEmployee(employee4);
		service.addEmployee(employee5);
		service.addEmployee(employee6);	
		//service.getEmployee().forEach(System.out::println);
		service.getEmployee().forEach((n)-> System.out.println(n));
	//	service.deleteEmployee(6);
	
		//service.getEmployee().forEach(System.out::println);
	//	System.out.println("The Searched Employee with id :");
	//System.out.println(	service.getEmployeeById(3));
	//service.getEmployeeByAsc().forEach(System.out::println);
	
	//service.findAllByNameGreaterThan("Deepak").forEach(System.out::println);;
		//service.findByIdGreaterThan(3).forEach(System.out::println);
		//service.findByIdLessThan(4).forEach(System.out::println);
		//service.findByIdBetween( 2, 5).forEach(System.out::println);
		// 	service.findByIdAndSalary(3,30000).forEach(System.out::println);
		
	}
	
}


