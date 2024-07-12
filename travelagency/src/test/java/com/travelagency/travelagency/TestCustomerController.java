package com.travelagency.travelagency;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.travelagency.travelagency.model.Customer;
import com.travelagency.travelagency.service.CustomerService;
import com.travelagency.travelagency.util.CommunicationAddress;
import com.travelagency.travelagency.util.PermanentAddress;
@SpringBootTest
@AutoConfiguration
public class TestCustomerController {
	@Autowired
	Mock mvcmock;
	@MockBean
	CustomerService customerService;
	@Test
	public void testCreate() {
		PermanentAddress address = new PermanentAddress("102", "main street", "metrostaton", "delhi", "delhi", 320001);

		CommunicationAddress cAddress = new CommunicationAddress("204", "4", "rajendranagar", "patna", "bihar", 500001);

		List<String> list = new ArrayList<String>();
		list.add("patna");
		list.add("kolkata");

		Customer addcustomer = new Customer(2, "Pratik", "dhote", "Patna", "delhi", list, "3days", 8000, "1234567890",
				address, cAddress, "good");

		customerService.createCustomer(addcustomer);
		///Mockito.when(service.getAllNotes()).thenReturn(note);
	}
}
