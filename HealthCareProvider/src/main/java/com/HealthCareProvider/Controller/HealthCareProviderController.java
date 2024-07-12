package com.HealthCareProvider.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HealthCareProvider.Model.HealthCareProvider;
import com.HealthCareProvider.Service.HealthCareProviderService;

@RestController
@RequestMapping("/care")
public class HealthCareProviderController {
@Autowired
HealthCareProviderService service;

@PostMapping("/addcare")
public  HealthCareProvider add( HealthCareProvider healthcare) {
	return service.add(healthcare);
}
@GetMapping("/getAll")
public List<HealthCareProvider> getAll(){
	return service.getAll();
}
@GetMapping("/getbyid/{provider_Id}")
public HealthCareProvider getById(@PathVariable int provider_Id) {
	return service.getById(provider_Id);
}
@DeleteMapping("/delete")
public String deleteById(@PathVariable int provider_Id) {
	service.deleteById(provider_Id);
   return "Data is Deleted with give id:" + provider_Id;
}
@GetMapping("/searchByEmp/{empid}")
public List<HealthCareProvider> searchEmpById(@PathVariable int empid){
	return service.searchEmpById(empid);
}

	
	
	
	
}
