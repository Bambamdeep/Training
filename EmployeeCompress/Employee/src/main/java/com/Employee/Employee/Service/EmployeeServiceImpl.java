package com.Employee.Employee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Benefit.Benefits.Model.Benefit;
import com.Employee.Employee.Dao.EmployeeDao;
import com.Employee.Employee.Exception.DataIncorrectException;
import com.Employee.Employee.Exception.IdNotFoundException;
import com.Employee.Employee.Model.Employee;
import com.HealthCareProvider.Model.HealthCareProvider;
import com.google.common.base.Optional;
@Service 
public class EmployeeServiceImpl implements EmployeeService{
@Autowired
EmployeeDao Dao;
@Autowired
Feign pro;
	@Override
	public Employee addEmployee(Employee employee) throws DataIncorrectException{
		return Dao.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return Dao.findAll();
	}

	@Override
	public Employee searchById(int empid) throws IdNotFoundException{
		
		return Dao.findById(empid).orElseThrow(()-> new IdNotFoundException());
	}

	@Override
	public List<Benefit> searchbenefitByEmp(int empid)  {
	
		
		 
	return  pro.searchbenefitByEmp(empid);
		 
	}

	@Override
	public List<HealthCareProvider> searchEmpById(int empid) {
		
		return pro.searchEmpById(empid);


	}
}
