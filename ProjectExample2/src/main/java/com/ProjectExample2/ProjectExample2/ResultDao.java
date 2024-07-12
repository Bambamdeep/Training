package com.ProjectExample2.ProjectExample2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ResultDao extends JpaRepository<Result,Integer>{

	

}
