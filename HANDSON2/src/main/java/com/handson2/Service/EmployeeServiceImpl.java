package com.handson2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.handson2.Dao.EmployeeRespsitory;
import com.handson2.Model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{
@Autowired
EmployeeRespsitory repository;
	@Override
	public Employee addEmp(Employee employee) {
		// TODO Auto-generated method stub
		return repository.save(employee);
	}

	@Override
	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
