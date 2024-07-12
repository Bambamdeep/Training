package com.MicroServiceProject2.MicroServiceApp2.Service;

import java.util.List;

import com.MicroServiceProject2.MicroServiceApp2.Model.Comment;

public interface CommentService {
public List<Comment> getAllComment();
public Comment insert(Comment comment);
//public Comment searchCommentById(int pid);
public List<Comment> getCommentsForPid(int pid);

}
