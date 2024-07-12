package com.ProjectExample.ProjectExample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import feign.Feign;
@Service
public class StudentServiceImpl implements StudentService{
@Autowired
StudentDao dao;
@Autowired
Fegin proxy;
	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Student insert(Student student) {
		// TODO Auto-generated method stub
		return dao.save(student);
	}
	public List<Result> getResultAll(){
		return proxy.getResultAll();
	}
}
