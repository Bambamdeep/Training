package com.Employee.Employee.Service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Benefit.Benefits.Model.Benefit;
import com.HealthCareProvider.Model.HealthCareProvider;

//@FeignClient(name = "HealthCareProvider",url= "http://localhost:6063/care")
@FeignClient(name = "Benefits")
public interface Feign {
	@GetMapping ("/benefit/searchemp/{empid}")
	public List <Benefit> searchbenefitByEmp(@PathVariable int empid);
	
	@GetMapping("/searchByEmp/{empid}")
	public List<HealthCareProvider> searchEmpById(@PathVariable int empid);
}