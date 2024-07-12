package com.Handson3.Handson3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Handson3.Handson3.Dao.TravelAgencyDao;
import com.Handson3.Handson3.Model.Address;
import com.Handson3.Handson3.Model.TravelAgency;
import com.Handson3.Handson3.Service.TravelAgencyService;
import com.Handson3.Handson3.Service.TravelAgencyServiceImpl;

@SpringBootApplication
public class demotest {
	@Autowired
	TravelAgencyService service;
	@Autowired
	TravelAgencyDao dao;
	
	
		
		
		@Test
		public void create() {
			Address a = new Address(11,2);
			List<String> l = new ArrayList<String>();
		//	l.add("pyna");
			l.add("DEDE");
		 TravelAgency t =new TravelAgency(1,"name",l,a);
		 service.create(t);
		 TravelAgency save = dao.findById( t.getId());
		 
		 assertNotNull(save);
		 
		 assertEquals(t.getName(),save.getName());
		 assertEquals(t.getLocationCovered(),save.getLocationCovered());
		 assertEquals(t.getAddres(),save.getAddres());
		 
		}

}
