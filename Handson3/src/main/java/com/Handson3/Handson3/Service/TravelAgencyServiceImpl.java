package com.Handson3.Handson3.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Handson3.Handson3.Dao.TravelAgencyDao;
import com.Handson3.Handson3.Model.TravelAgency;
@Service
public class TravelAgencyServiceImpl implements TravelAgencyService{
@Autowired
TravelAgencyDao dao;
	@Override
	public TravelAgency create(TravelAgency agency) {
		
		return dao.save(agency);
	}
//	@Override
//	public List<TravelAgency> getAll() {
//		
//		return dao.findAll();
//	}

}
