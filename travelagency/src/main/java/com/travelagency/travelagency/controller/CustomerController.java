package com.travelagency.travelagency.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.travelagency.travelagency.model.Customer;
import com.travelagency.travelagency.service.CustomerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/travelAgency")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	// This method is creatingCustomer
	@PostMapping("/save")
	@ResponseStatus(HttpStatus.CREATED)
	public Customer createCustomer(@Valid @RequestBody Customer customer) {
		return customerService.createCustomer(customer);
	}

	// This method is use to fetch the customer By Id
	@GetMapping("/get/{cId}")
	@ResponseStatus(HttpStatus.OK)
	public Customer findCoustomerById(@PathVariable int cId) {
		
		return customerService.findCoustomerById(cId);
	}

	// This Method is use to Delete Customer By Id
	@DeleteMapping("/delete/{cId}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public String deleteCustomer(@PathVariable int cId) {
		customerService.deleteCustomer(cId);

		return "Customer Is Sucessfully Deleted with id :" + cId;

	}

	// This Method is use to Update the Customer By Id
	@PutMapping("/update/{cId}")
	@ResponseStatus(HttpStatus.CREATED)
	public Customer updateCustomer(@Valid @RequestBody Customer customer, @PathVariable int cId) {
		return customerService.updateCustomer(customer, cId);
	}

}
