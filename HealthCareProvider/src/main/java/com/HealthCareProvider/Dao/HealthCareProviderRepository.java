package com.HealthCareProvider.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HealthCareProvider.Model.HealthCareProvider;
@Repository
public interface HealthCareProviderRepository extends JpaRepository<HealthCareProvider,Integer>{

	List<HealthCareProvider> findByEmpid(int empid);

	//public List<HealthCareProvider> findAllById(int empid);
	//public List<HealthCareProvider> searchEmpById(int empid);
	
}
