package com.HealthCareProvider.Service;

import java.util.List;

import com.HealthCareProvider.Model.HealthCareProvider;

public interface HealthCareProviderService {
public  HealthCareProvider add( HealthCareProvider healthcare);
public List<HealthCareProvider> getAll();
public HealthCareProvider getById(int provider_Id);
public void deleteById(int provider_Id);
public List<HealthCareProvider> searchEmpById(int empid);
}
