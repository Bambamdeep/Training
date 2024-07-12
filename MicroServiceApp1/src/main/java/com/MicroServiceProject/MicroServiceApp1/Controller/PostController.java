package com.MicroServiceProject.MicroServiceApp1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MicroServiceProject.MicroServiceApp1.Comment.Comment;
import com.MicroServiceProject.MicroServiceApp1.Model.Post;
import com.MicroServiceProject.MicroServiceApp1.Service.PostService;

@RestController
@RequestMapping("/post")
public class PostController {
@Autowired
PostService service;
@GetMapping("/all")
public List<Post> getAllPost(){
	return service.getAllPost();
}
     @PostMapping("/insert")
    public Post insertPost(@RequestBody Post post) {
    	return service.insertPost(post);
    }
     @GetMapping("/get/{pid}")
     public List<Comment> getCommentById(@PathVariable int pid){
    	 return service.getCommentById(pid);
     }
}
