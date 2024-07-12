package com.Handson3.Handson3.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Handson3.Handson3.Model.TravelAgency;
import com.Handson3.Handson3.Service.TravelAgencyService;

@RestController
@RequestMapping("/agency")
public class TravelAgencyController {
	@Autowired

TravelAgencyService service;
@PostMapping("/add")

public TravelAgency create(@RequestBody TravelAgency agency) {
	return service.create(agency);
	
}
//  @GetMapping("/get")
//  public List<TravelAgency>   getAll(){
//	 return service.getAll(); 
//  }
}
