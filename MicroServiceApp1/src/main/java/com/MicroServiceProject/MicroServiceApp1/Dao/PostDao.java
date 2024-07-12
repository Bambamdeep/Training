package com.MicroServiceProject.MicroServiceApp1.Dao;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MicroServiceProject.MicroServiceApp1.Comment.Comment;
import com.MicroServiceProject.MicroServiceApp1.Model.Post;
@Repository
public interface PostDao extends JpaRepository<Post,Integer>{
	
	
}
