package com.MicroServiceProject2.MicroServiceApp2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MicroServiceProject2.MicroServiceApp2.Model.Comment;
import com.MicroServiceProject2.MicroServiceApp2.Service.CommentService;

@RestController
@RequestMapping("/comment")
public class CommentController {
	@Autowired
	CommentService service;
	
	@GetMapping("/All")
	public List<Comment> getAllComment(){
		return service.getAllComment();
	}
//	@GetMapping("/search/{pid}")
//	public Comment searchCommentById(@PathVariable int pid) {
//		return service.searchCommentById(pid);
//	}
	@PostMapping("/insert")
	public Comment insert(@RequestBody Comment comment) {
		return service.insert(comment);
	}
	@GetMapping("/get/{pid}")
	public List<Comment> getCommentsForPid(@PathVariable int pid){
		return service.getCommentsForPid(pid);
	}
}
