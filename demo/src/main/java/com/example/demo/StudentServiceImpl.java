package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudentServiceImpl implements StudentService{
@Autowired
StudentDao Dao;
	@Override
	public List<Student> getAllRecord() {
		// TODO Auto-generated method stub
		return Dao.findAll();
	}

	@Override
	public Student getRecordById(int id) {
		// TODO Auto-generated method stub
		return  Dao.findById(id).get();
	}

     @Override
   public void deletestudent(int id) {
	      Dao.deleteById(id);
	}

	@Override
	public Student addRecord(Student student) {
		// TODO Auto-generated method stub
		return Dao.save(student);
	}
	

	@Override
	public List<Student> findByIdGreaterThan(int id) {
		// TODO Auto-generated method stub
		return Dao.findByIdGreaterThan(id);
	}
	

}
