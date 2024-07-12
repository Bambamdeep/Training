package com.OpenFeign1.MicroServiceFegin1.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OpenFeign1.MicroServiceFegin1.Model.Comment;
@Repository
public interface CommentDao extends JpaRepository<Comment,Integer>{
	List<Comment> findAllByPid(int pid);
}
