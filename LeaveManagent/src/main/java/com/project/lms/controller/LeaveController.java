package com.project.lms.controller;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.lms.controller.model.LeaveRequest;
import com.project.lms.controller.model.Dao.Service.LeaveRequestService;

@Controller
public class LeaveController {
	@Autowired
	LeaveRequestService service ;
	@GetMapping("/")
public String login() {
	return "login";
}
	@GetMapping("/Validate")
	public String validate(@RequestParam("loginid") String logid, @RequestParam("password") String pass) {
		if (logid.equals("Deepak") &&  pass.equals("1234")) {
			return "Validate";
		}
		else {
		return "Invalid";
		}
	
}
	@GetMapping("/apply")
		
			 public String applyLeave(Model model1) {
					LeaveRequest leaveRequest = new LeaveRequest();
					model1.addAttribute("leaveRequest", leaveRequest);
					return "applyLeave";
	}            
	@GetMapping("/ViewRequest")
	public String view(Model model1) {
		List<LeaveRequest> leaveRequest = service.getAllRequest();
		model1.addAttribute("leaveRequests",leaveRequest);
		
		return "ViewRequest";
	}
	@GetMapping("/submitLeave")
	public String submitLeave(@ModelAttribute LeaveRequest leaveRequest) {
		service.addLeave(leaveRequest);
		return "Validate";
	}
	
	@GetMapping("/search")
	public String search() {
		return "search";
	}
	
	
	@GetMapping("/searchstatus")
	public String findByStatus(@RequestParam String status , Model model1 ) {
    	List<LeaveRequest> leaveRequest= service.getByStatus(status);
     model1.addAttribute("leaveRequests",leaveRequest);
		return "ViewRequest";
   
	}
	
  }
 


