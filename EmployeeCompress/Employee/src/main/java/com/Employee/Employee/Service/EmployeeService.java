package com.Employee.Employee.Service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.Benefit.Benefits.Model.Benefit;
import com.Employee.Employee.Exception.DataIncorrectException;
import com.Employee.Employee.Exception.IdNotFoundException;
import com.Employee.Employee.Model.Employee;
import com.HealthCareProvider.Model.HealthCareProvider;

public interface EmployeeService {
public Employee addEmployee(Employee employee) throws DataIncorrectException;
public List<Employee> getAllEmployee();
public Employee searchById(int empid) throws IdNotFoundException;
public List <Benefit> searchbenefitByEmp(int empid) throws IdNotFoundException;
public List<HealthCareProvider> searchEmpById(int empid);

}
