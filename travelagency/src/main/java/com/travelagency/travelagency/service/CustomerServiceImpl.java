package com.travelagency.travelagency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travelagency.travelagency.exception.IdNotFoundException;
import com.travelagency.travelagency.model.Customer;
import com.travelagency.travelagency.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer createCustomer(Customer customer) {

		return customerRepository.save(customer);
	}

	@Override
	public Customer findCoustomerById(int cId) throws IdNotFoundException {

		return customerRepository.findById(cId)
				.orElseThrow(() -> new IdNotFoundException("Customer Not Found With THis cId:" + cId));
	}

	@Override
	public boolean deleteCustomer(int cId) throws IdNotFoundException {
		if (customerRepository.existsById(cId)) {
			customerRepository.deleteById(cId);
		} else {
			throw new IdNotFoundException("Customer Not Found With THis cId:" + cId);
		}
		return false;
	}

	@Override
	public Customer updateCustomer(Customer customer, int cId) throws IdNotFoundException {
		Customer customer1 = customerRepository.findById(cId)
				.orElseThrow(() -> new IdNotFoundException("Customer Not Found With THis cId:" + cId));
		customer1.setFirstName(customer.getFirstName());
		customer1.setLastName(customer.getLastName());
		customer1.setStartingLocation(customer.getStartingLocation());
		customer1.setDestinationLocation(customer.getDestinationLocation());
		customer1.setLocationCovered(customer.getLocationCovered());
		customer1.setPackageName(customer.getPackageName());
		customer1.setCost(customer.getCost());
		customer1.setPhone(customer.getPhone());
		customer1.setPermanentAddress(customer.getPermanentAddress());
		customer1.setCommunicationAddress(customer.getCommunicationAddress());
		customer1.setNotes(customer.getNotes());

		return customerRepository.save(customer1);

	}

}
