package com.Benefit.Benefits.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Benefit.Benefits.Model.Benefit;
@Repository
public interface BenefitDao extends JpaRepository<Benefit,Integer>{
	 List <Benefit> findByEmpid(int empid);
	
}
