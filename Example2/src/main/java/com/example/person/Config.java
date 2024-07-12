package com.example.person;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
@Bean 
public Person getperson() {
	return new Person();
}
@Bean
public Address getAddress() {
	return new Address();
}
}
