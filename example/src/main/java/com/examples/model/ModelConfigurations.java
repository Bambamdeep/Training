package com.examples.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ModelConfigurations {
	@Bean("dept1")
public Department getDepartment1() {
	return new Department(9002,"MicroService","Patna");
}
	@Bean("dept2")
	public Department getDepartment2() {
		return new Department(9003,"Finance","Kolkata");
	}
    @Bean
	public Employee getEmpolyee() {
		return new Employee(9004,"Finance","Kolkata");
	}

}
