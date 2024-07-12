package com.project.lms.controller.model.Dao.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.project.lms.controller.model.LeaveRequest;
import com.project.lms.controller.model.Dao.LeaveRequestDao;
@Service
public class LeaveRequestServiceImpl implements LeaveRequestService{
@Autowired 
LeaveRequestDao leaveRequestDao;
	@Override
	public LeaveRequest addLeave(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		return leaveRequestDao.save(leaveRequest) ;
	}
	@Override
	public List<LeaveRequest> getAllRequest() {
		// TODO Auto-generated method stub
		return leaveRequestDao.findAll();
	}
	@Override
	public List<LeaveRequest> getByStatus(String status) {
		// TODO Auto-generated method stub
		List<LeaveRequest> leaveRequest = leaveRequestDao.findAll();
		List <LeaveRequest> request = new ArrayList<>();
		for (LeaveRequest l :leaveRequest) {
			if(l.getStatus().equals(status))  {
				request .add(l);
			}
		}
		
		return request ;
	}
	}


