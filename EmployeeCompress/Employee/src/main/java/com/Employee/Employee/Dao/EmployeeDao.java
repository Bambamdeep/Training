package com.Employee.Employee.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Benefit.Benefits.Model.Benefit;
import com.Employee.Employee.Model.Employee;
@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer> {

	

}
