package com.project.lms.controller.model.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.lms.controller.model.LeaveRequest;

@Repository
public interface LeaveRequestDao extends JpaRepository<LeaveRequest ,Integer>{

}
