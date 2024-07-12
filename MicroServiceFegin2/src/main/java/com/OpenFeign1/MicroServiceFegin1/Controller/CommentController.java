package com.OpenFeign1.MicroServiceFegin1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OpenFeign1.MicroServiceFegin1.Model.Comment;
import com.OpenFeign1.MicroServiceFegin1.Service.CommentService;

@RestController
@RequestMapping("/comment")
public class CommentController {
	@Autowired
	CommentService service;
	@Value("${server.port}")
	String port;
	@GetMapping("/port")
	public String getPort() {
		return "Comment service is running on port: "+port;
	}
	
	@GetMapping("/All")
	public List<Comment> getAllComment(){
		return service.getAllComment();
	}
	@GetMapping("/search/{pid}")
	public Comment searchCommentById(@PathVariable int pid) {
		return service.searchCommentById(pid);
	}
	@PostMapping("/insert")
	public Comment insert(@RequestBody Comment comment) {
		return service.insert(comment);
	}
	@GetMapping("/get/{pid}")
	public List<Comment> getCommentForPid(@PathVariable int pid){
		return service.getCommentForPid(pid);
	}
}
