package com.SpringMvcDemo.SpringMvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/p")
public class DemoController {
//	@GetMapping("/home")
//  public String home() {
//	  return "home";
//  }
	@GetMapping("/login")
  public String login() {
	  return "login";
  }
//	@GetMapping("/logout")
//  public String logout() {
//	  return "logout";
//  }
}
