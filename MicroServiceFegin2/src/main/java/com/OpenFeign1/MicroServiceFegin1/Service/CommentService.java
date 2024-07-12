package com.OpenFeign1.MicroServiceFegin1.Service;

import java.util.List;

import com.OpenFeign1.MicroServiceFegin1.Model.Comment;



public interface CommentService {
	public List<Comment> getAllComment();
	public Comment insert(Comment comment);
	public Comment searchCommentById(int pid);
	public List<Comment> getCommentForPid(int pid);

}
