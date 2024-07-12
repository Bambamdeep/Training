package com.OpenFeign.MicroServiceFegin.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OpenFeign.MicroServiceFegin.Comment.Comment;
import com.OpenFeign.MicroServiceFegin.Model.Post;
@Repository
public interface PostDao extends JpaRepository<Post,Integer>{

	//List<Comment> findAllById(int pid);
	
}
