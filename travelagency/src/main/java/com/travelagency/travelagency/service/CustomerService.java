package com.travelagency.travelagency.service;

import com.travelagency.travelagency.exception.IdNotFoundException;
import com.travelagency.travelagency.model.Customer;

public interface CustomerService {
	public Customer createCustomer(Customer customer);

	public Customer findCoustomerById(int cId) throws IdNotFoundException;

	public boolean deleteCustomer(int cId) throws IdNotFoundException;

	public Customer updateCustomer(Customer customer, int cId) throws IdNotFoundException;
}
