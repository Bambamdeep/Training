package com.handson2.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.handson2.Model.Employee;

public interface EmployeeRespsitory extends JpaRepository<Employee,Integer>{

}
