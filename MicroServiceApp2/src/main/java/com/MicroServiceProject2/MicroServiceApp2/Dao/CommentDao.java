package com.MicroServiceProject2.MicroServiceApp2.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MicroServiceProject2.MicroServiceApp2.Model.Comment;
@Repository
public interface CommentDao extends JpaRepository<Comment,Integer>{
	

	List<Comment> findAllByPid(int pid);
}
