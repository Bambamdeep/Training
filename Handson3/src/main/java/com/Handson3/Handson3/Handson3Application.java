package com.Handson3.Handson3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Handson3.Handson3.Model.Address;
import com.Handson3.Handson3.Model.TravelAgency;
import com.Handson3.Handson3.Service.TravelAgencyService;

@SpringBootApplication
public class Handson3Application implements CommandLineRunner{
@Autowired
TravelAgencyService service;
	public static void main(String[] args) {
		SpringApplication.run(Handson3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Address a	= new Address(101,11);
		ArrayList <String> l = new ArrayList<String>();
		l.add("Patna");
		l.add("gaya");
		l.add("kolkata");
		
		TravelAgency t = new TravelAgency(1,"Deepak",l,a);
		service.create(t);	
		System.out.println(service.create(t));
	}
}
