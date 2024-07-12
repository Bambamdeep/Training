package com.MicroServiceProject.MicroServiceApp1.Service;

import java.util.List;

import org.hibernate.annotations.Comments;

import com.MicroServiceProject.MicroServiceApp1.Comment.Comment;
import com.MicroServiceProject.MicroServiceApp1.Model.Post;

public interface PostService {
public List<Post> getAllPost();
public Post insertPost(Post post);
public Post getPostById(int pid);
public List<Comment> getCommentById(int pid);

}
