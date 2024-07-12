package com.OpenFeign.MicroServiceFegin.Service;

import java.util.List;

import com.OpenFeign.MicroServiceFegin.Comment.Comment;
import com.OpenFeign.MicroServiceFegin.Model.Post;



public interface PostService {
	public List<Post> getAllPost();
	public Post insertPost(Post post);
	public Post getPostById(int pid);
    public List<Comment> getCommentForPid(int pid);
    public String getPort();

}
