package com.SecurityBasic.SecurityBasic.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SecurityBasic.SecurityBasic.Model.Person;
import com.SecurityBasic.SecurityBasic.Service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	PersonService service;
	
	@PostMapping("/add")
	public Person addPerson(@RequestBody Person person) {
		return service.addPerson(person);
	}
	
	@GetMapping("/get")
	public List<Person> getPerson(){
		return service.getPerson();
	}
	@GetMapping("/getid/{adharId}")
	public Person search(@PathVariable int adharId) {
		return service.search(adharId);
	}
	@DeleteMapping("/delete/{adharId}")
	public boolean deletePerson(@PathVariable int adharId) {
		return service.deletePerson(adharId);
	}
	@PutMapping("/update/{adharId}")
	public Person update(@RequestBody Person person , @PathVariable int adharId) {
		return service.addPerson(person);
	}
	

}
