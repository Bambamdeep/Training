package com.OpenFeign.MicroServiceFegin.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.OpenFeign.MicroServiceFegin.Comment.Comment;
import com.OpenFeign.MicroServiceFegin.Dao.PostDao;
import com.OpenFeign.MicroServiceFegin.Model.Post;
@Service
public class PostServiceImpl implements PostService{
@Autowired
PostDao Dao;
@Autowired
FeginProxy  pro;
	@Override
	public List<Post> getAllPost() {
		// TODO Auto-generated method stub
		return Dao.findAll();
	}

	@Override
	public Post insertPost(Post post) {
		// TODO Auto-generated method stub
		return Dao.save(post);
	}

	@Override
	public Post getPostById(int pid) {
		// TODO Auto-generated method stub
		return Dao.findById(pid).get();
	}

	@Override
	public List<Comment> getCommentForPid(int pid) {
		// TODO Auto-generated method stub
		return pro.getCommentForPid(pid);
	}

	@Override
	public String getPort() {
		// TODO Auto-generated method stub
		return pro.getPort();
	}

}
