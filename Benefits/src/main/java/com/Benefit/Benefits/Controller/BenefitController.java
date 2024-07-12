package com.Benefit.Benefits.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Benefit.Benefits.Exception.BenefitIDNotFound;
import com.Benefit.Benefits.Model.Benefit;
import com.Benefit.Benefits.Service.BenefitService;

@RestController
@RequestMapping("/benefit")
public class BenefitController {
@Autowired
BenefitService service;
@PostMapping("/add")
public Benefit addBenefit(@RequestBody Benefit benefit) {
	return service.addBenefit(benefit);
}
@GetMapping("/all")
public List<Benefit> getBenefit(){
	return service.getBenefit();
}
@GetMapping ("/search/{benefit_Id}")
public Benefit search(@PathVariable int benefit_Id) throws BenefitIDNotFound{
	return service.search(benefit_Id);
}
@GetMapping ("/searchemp/{empid}")
public List<Benefit> searchbenefitByEmp(@PathVariable int empid) throws BenefitIDNotFound{
	return  service.searchbenefitByEmp(empid);
}
}
