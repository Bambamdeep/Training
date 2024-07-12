package com.OpenFeign.MicroServiceFegin.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OpenFeign.MicroServiceFegin.Comment.Comment;
import com.OpenFeign.MicroServiceFegin.Model.Post;
import com.OpenFeign.MicroServiceFegin.Service.PostService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
@RequestMapping("/post")
public class PostController {
@Autowired
PostService service;

@GetMapping("/All")
public List<Post> getAllPost(){
	return service.getAllPost();
}
     @PostMapping("/insert")
    public Post insertPost(@RequestBody Post post) {
    	return service.insertPost(post);
    }
//     @GetMapping("/get/{pid}")
//     public Post getPostById(@PathVariable int pid) {
//    	 return service.getPostById(pid);
//     }
   @Retry(name = "retryService", fallbackMethod = "getCommentsForPidFallback")
 	//@CircuitBreaker(name = "retryService", fallbackMethod="getCommentsForPidFallback")
 //	@CircuitBreaker(name="retryService")
     @GetMapping("/comment/{pid}")
     public List<Comment> getCommentForPid(@PathVariable int pid){
    	 return service.getCommentForPid(pid);
     }
     @GetMapping("/commentsport")
 	public String getCommentsPort() {
 		return service.getPort();
 	}
     public List<Comment> getCommentsForPidFallback(Exception e){
 		
 		List<Comment> data = new ArrayList<>();
 		data.add(new Comment(9001, "Fallback Comment-1", "Fallback Commenter-1", 1));
 		data.add(new Comment(9002, "Fallback Comment-2", "Fallback Commenter-2", 2));
 		data.add(new Comment(9003, "Fallback Comment-3", "Fallback Commenter-3", 1));
 		return data;
 	}
}
