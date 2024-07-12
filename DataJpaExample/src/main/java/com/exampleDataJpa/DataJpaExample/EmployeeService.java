package com.exampleDataJpa.DataJpaExample;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

public interface EmployeeService {
public List<Employee> getEmployee();
    
public Employee getEmployeeById(int id);

public Employee addEmployee(Employee employee);

public void deleteEmployee(int id);

public List<Employee> findByIdGreaterThan(int id);

public List<Employee> findByIdLessThan(int id);

public List <Employee> findByIdBetween(int id1,int id2);

public List<Employee> findAllByNameGreaterThan(String name);
//public List<Employee> findByIdAndSalary(int id, int salary);

public List<Employee> getEmployeeByAsc();
}
