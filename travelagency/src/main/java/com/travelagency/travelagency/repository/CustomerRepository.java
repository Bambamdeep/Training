package com.travelagency.travelagency.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travelagency.travelagency.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
