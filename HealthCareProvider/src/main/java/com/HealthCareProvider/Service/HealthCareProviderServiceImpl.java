package com.HealthCareProvider.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HealthCareProvider.Dao.HealthCareProviderRepository;
import com.HealthCareProvider.Model.HealthCareProvider;
@Service
public class HealthCareProviderServiceImpl implements HealthCareProviderService{
@Autowired
HealthCareProviderRepository repo;
	@Override
	public HealthCareProvider add(HealthCareProvider healthcare) {
		
		return repo.save(healthcare);
	}

	@Override
	public List<HealthCareProvider> getAll() {
		
		return repo.findAll();
	}

	@Override
	public HealthCareProvider getById(int provider_Id) {
		
		return repo.findById(provider_Id).get();
	}

	@Override
	public void deleteById(int provider_Id) {
		repo.deleteById(provider_Id);
		
	}

	@Override
	public List<HealthCareProvider> searchEmpById(int empid) {
	
		return repo.findByEmpid(empid);
	}

}
