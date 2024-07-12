package com.OpenFeign.MicroServiceFegin.Service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.OpenFeign.MicroServiceFegin.Comment.Comment;
//@FeignClient(name= "MicroServiceFegin1",url ="http://localhost:8084/comment")
@FeignClient(name ="MICROSERVICEFEGIN1")
public interface FeginProxy {
	@GetMapping("/get/{pid}")
	public List<Comment> getCommentForPid(@PathVariable int pid);
	@GetMapping("/comment/port")
	public String getPort();
}
