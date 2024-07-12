package com.ProjectExample2.ProjectExample2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ResultServiceImpl implements ResultService{
@Autowired
ResultDao dao;
	@Override
	public List<Result> getResultAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Result insertResult(Result result) {
		// TODO Auto-generated method stub
		return dao.save(result);
	}

	@Override
	public Result getResult(int roll) {
		// TODO Auto-generated method stub
		return dao.findById(roll).get();
	}

}
