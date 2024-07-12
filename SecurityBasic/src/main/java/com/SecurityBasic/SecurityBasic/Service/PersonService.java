package com.SecurityBasic.SecurityBasic.Service;

import java.util.List;

import com.SecurityBasic.SecurityBasic.Model.Person;

public interface PersonService {
      // add
	  
	public Person addPerson(Person person);
	
	
	// get
	public List<Person> getPerson();
	
	//delete
	
	public boolean deletePerson(int adharId);
	
	// seachById
	
	public Person search(int adharId);
	
	//Update
	public Person update(Person person , int adharId);
	
	
	
}
