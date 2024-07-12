package com.ProjectExample2.ProjectExample2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/result")
public class ResultController {
	@Autowired
	ResultService service;
	@GetMapping("/all")
	public List<Result> getResultAll(){
		return service.getResultAll();
	}
	@GetMapping("insert")
	public Result insertResult(@RequestBody Result result) {
		return service.insertResult(result);
	}
	@GetMapping("/get/{roll}")
	public Result getResult (@PathVariable int roll) {
		return service.getResult(roll);
	}
}
