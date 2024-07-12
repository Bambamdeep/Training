package com.travelagency.travelagency;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.travelagency.travelagency.model.Customer;
import com.travelagency.travelagency.service.CustomerService;
import com.travelagency.travelagency.util.CommunicationAddress;
import com.travelagency.travelagency.util.PermanentAddress;

@SpringBootTest
public class CustomerTest {
	@Autowired
	private CustomerService customerService;

	@Test
	public void testCreate() {
		PermanentAddress address = new PermanentAddress("102", "main street", "metrostaton", "delhi", "delhi", 320001);

		CommunicationAddress cAddress = new CommunicationAddress("204", "4", "rajendranagar", "patna", "bihar", 500001);

		List<String> list = new ArrayList<String>();
		list.add("patna");
		list.add("kolkata");

		Customer addcustomer = new Customer(2, "Pratik", "dhote", "Patna", "delhi", list, "3days", 8000, "1234567890",
				address, cAddress, "good");

		Customer addedCustomer = customerService.createCustomer(addcustomer);

		assertNotNull(addedCustomer.getcId());
		assertEquals(addcustomer.getFirstName(), addedCustomer.getFirstName());

	}

	@Test
	public void testfindById() {
		PermanentAddress address = new PermanentAddress("102", "main street", "metrostaton", "delhi", "delhi", 320001);

		CommunicationAddress cAddress = new CommunicationAddress("204", "4", "rajendranagar", "patna", "bihar", 500001);

		List<String> list = new ArrayList<String>();
		list.add("patna");
		list.add("kolkata");
		Customer addcustomer = new Customer(2, "Pratik", "dhote", "Patna", "delhi", list, "3days", 8000, "1234567890",
				address, cAddress, "good");
		customerService.createCustomer(addcustomer);

		Customer getById = customerService.findCoustomerById(2);

		assertNotNull(getById);
		assertEquals(addcustomer.getcId(), getById.getcId());

	}

	@Test
	public void testDelete() {
		PermanentAddress address = new PermanentAddress("102", "main street", "metrostaton", "delhi", "delhi", 320001);

		CommunicationAddress cAddress = new CommunicationAddress("204", "4", "rajendranagar", "patna", "bihar", 500001);

		List<String> list = new ArrayList<String>();
		list.add("patna");
		list.add("kolkata");
		Customer addcustomer = new Customer(2, "Pratik", "dhote", "Patna", "delhi", list, "3days", 8000, "1234567890",
				address, cAddress, "good");
		Customer addedCustomer = customerService.createCustomer(addcustomer);

		boolean isDeleted = customerService.deleteCustomer(addedCustomer.getcId());
		assertFalse(isDeleted);
	}

	@Test
	public void testUpdate() {
		PermanentAddress address = new PermanentAddress("102", "main street", "metrostaton", "delhi", "delhi", 320001);

		CommunicationAddress cAddress = new CommunicationAddress("204", "4", "rajendranagar", "patna", "bihar", 500001);

		List<String> list = new ArrayList<String>();
		list.add("patna");
		list.add("kolkata");
		Customer addcustomer = new Customer(2, "Pratik", "dhote", "Patna", "delhi", list, "3days", 8000, "1234567890",
				address, cAddress, "good");
		Customer addedCustomer = customerService.createCustomer(addcustomer);
		assertNotNull(addedCustomer.getcId());
		addedCustomer.setFirstName("Deepak");
		Customer updateCustomer = customerService.updateCustomer(addedCustomer, addedCustomer.getcId());
		assertNotNull(updateCustomer);
		assertEquals("Deepak", updateCustomer.getFirstName());

	}
}
