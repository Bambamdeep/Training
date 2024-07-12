package com.MicroServiceProject.MicroServiceApp1.Service;

import java.util.List;

import org.hibernate.annotations.Comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.MicroServiceProject.MicroServiceApp1.Comment.Comment;
import com.MicroServiceProject.MicroServiceApp1.Dao.PostDao;
import com.MicroServiceProject.MicroServiceApp1.Model.Post;
@Service
public class PostServiceImpl implements PostService{
@Autowired
PostDao postDao;
@Autowired
RestTemplate rest;
	@Override
	public List<Post> getAllPost() {
		// TODO Auto-generated method stub
		return postDao.findAll();
	}

	@Override
	public Post insertPost(Post post) {
		// TODO Auto-generated method stub
		return postDao.save(post);
	}

	@Override
	public Post getPostById(int pid) {
		// TODO Auto-generated method stub
		return postDao.findById(pid).get();
	}

	@Override
	public List<Comment> getCommentById(int pid) {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8082/comment/get/"+pid, List.class);
	}

	



	
}
