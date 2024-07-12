package com.project.lms.controller.model.Dao.Service;

import java.util.List;

import com.project.lms.controller.model.LeaveRequest;

public interface LeaveRequestService {
public  LeaveRequest addLeave(LeaveRequest leaveRequest);
public List< LeaveRequest> getAllRequest();
public List<LeaveRequest> getByStatus(String status);
}
