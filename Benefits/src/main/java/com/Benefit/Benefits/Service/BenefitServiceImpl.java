package com.Benefit.Benefits.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Benefit.Benefits.Dao.BenefitDao;
import com.Benefit.Benefits.Exception.BenefitIDNotFound;
import com.Benefit.Benefits.Model.Benefit;

@Service 
public class BenefitServiceImpl implements BenefitService{
@Autowired
BenefitDao Dao;
	@Override
	public Benefit addBenefit(Benefit benefit) {
		// TODO Auto-generated method stub
		return Dao.save(benefit);
	}

	@Override
	public List<Benefit> getBenefit() {
		// TODO Auto-generated method stub
		return Dao.findAll();
	}

	@Override
	public Benefit search(int benefit_Id)throws BenefitIDNotFound{
		// TODO Auto-generated method stub
		return Dao.findById(benefit_Id)
		.orElseThrow(()-> new BenefitIDNotFound("Employee Not Found With This Id:" +benefit_Id));
			
	}

	@Override
	public List<Benefit> searchbenefitByEmp(int empid)throws BenefitIDNotFound {
	if (empid > 110) {
		throw   new BenefitIDNotFound("Employee Not Found With This Id:" +empid);
	}
	else {
		return Dao.findByEmpid(empid);
	}
	}


}
