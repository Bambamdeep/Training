package com.OpenFeign1.MicroServiceFegin1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OpenFeign1.MicroServiceFegin1.Dao.CommentDao;
import com.OpenFeign1.MicroServiceFegin1.Model.Comment;
@Service
public class CommentServiceImpl implements CommentService {
@Autowired
CommentDao Dao;
	@Override
	public List<Comment> getAllComment() {
		// TODO Auto-generated method stub
		return Dao.findAll();
	}

	@Override
	public Comment insert(Comment comment) {
		// TODO Auto-generated method stub
		return Dao.save(comment);
	}

	@Override
	public Comment searchCommentById(int pid) {
		// TODO Auto-generated method stub
		return Dao.findById(pid).get();
	}

	@Override
	public List<Comment> getCommentForPid(int pid) {
		// TODO Auto-generated method stub
		return Dao.findAllByPid(pid);
	}

}
