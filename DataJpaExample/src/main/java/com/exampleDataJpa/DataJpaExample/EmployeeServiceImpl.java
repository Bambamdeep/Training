package com.exampleDataJpa.DataJpaExample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public  class EmployeeServiceImpl implements EmployeeService{
 @Autowired
 EmployeeDao employeeDao;
	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return employeeDao.findAll() ;
	}

	@Override
	public Employee getEmployeeById(int id) {
		return employeeDao.findById(id).get() ;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return  employeeDao.save(employee);
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		employeeDao.deleteById(id);
	}

	@Override
	public List<Employee> findByIdGreaterThan(int id) {
		// TODO Auto-generated method stub
		return employeeDao.findByIdGreaterThan(id);
	}

	@Override
	public List<Employee> findByIdLessThan(int id) {
		// TODO Auto-generated method stub
		return employeeDao.findByIdLessThan(id);
	}

	@Override
	public List<Employee> findByIdBetween(int id1, int id2) {
		// TODO Auto-generated method stub
		return  employeeDao.findByIdBetween( id1,  id2);
	}

	@Override
	public List<Employee> findAllByNameGreaterThan(String name) {
		// TODO Auto-generated method stub
		return   employeeDao.findAllByNameGreaterThan( name);
	}
//@Override
//	public List<Employee> findByIdAndSalary(int id, int salary) {
//		// TODO Auto-generated method stub
//		return  employeeDao.findByIdAndSalary(id,salary);
//	}

	@Override
	public List<Employee> getEmployeeByAsc() {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeByAsc();
	}

	
	}
	

	

