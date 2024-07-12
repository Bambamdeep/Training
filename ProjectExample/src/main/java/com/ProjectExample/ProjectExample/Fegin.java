package com.ProjectExample.ProjectExample;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "ProjectExample2",url = "http://localhost9091/result")
public interface Fegin {
//	@GetMapping("/all")
//	public List<Result> getResultAll();
	@GetMapping("/all")
	public List<Result> getResultAll();
}
