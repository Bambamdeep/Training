package com.SecurityBasic.SecurityBasic.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SecurityBasic.SecurityBasic.Dao.PersonDao;
import com.SecurityBasic.SecurityBasic.Model.Person;
@Service
public class PersonServiceImpl implements PersonService{

@Autowired
PersonDao Dao;
	@Override
	public Person addPerson(Person person) {
		
		return Dao.save(person);
	}

	@Override
	public List<Person> getPerson() {
		
		return Dao.findAll();
	}

	@Override
	public boolean deletePerson(int adharId) {
      
		Dao.deleteById(adharId);

		return false;
	}

	@Override
	public Person search(int adharId) {
	
		return Dao.findById(adharId).get();
	}

	@Override
	public Person update(Person person, int adharId) {
	
	   Person p = Dao.findById(adharId).get();
	   p.setName(person.getName());
	   p.setFatherName(person.getFatherName());
	   p.setAddress(person.getAddress());
	   p.setPhone_no(person.getPhone_no());
		
		return p;
	}

}
