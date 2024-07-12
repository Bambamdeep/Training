package com.SpringSecurity.SecurityDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class SecurityDemoController {
	@GetMapping ("/all")
	public String all() {
		return "All get Access";
	}
	@GetMapping("/login")
	public String login() {
		return "Enter your ID And Pass";
	}
	@GetMapping("/withdrawal")
	public static String withdrawal() {
		return "withdrawal";
	}
	@GetMapping("/acc")
	public String accDeatil() {
		return "YourDetails is Here";
	}
	
	@GetMapping("/checkbal")
	public String check() {
		return "Your money is left";
	}
	@GetMapping("/logout")
	public String logout() {
		return "Sucessfully logout";
    }

}

