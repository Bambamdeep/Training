package com.mvcSelfProject.SelfProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
@RequestMapping("/")
public String userLogin() {
	return "userLogin";
}
@GetMapping("/Check")
public String check (@RequestParam ("UserName") String uname , @RequestParam("Password") String pass) {
	if (uname.equals("b") && pass.equals(1)) {
		return "Valid";
	}
		else {
			return "Invalid";
		}
	}
}

