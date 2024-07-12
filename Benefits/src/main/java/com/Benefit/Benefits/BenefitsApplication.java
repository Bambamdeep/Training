package com.Benefit.Benefits;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.Benefit.Benefits.Model.Benefit;
import com.Benefit.Benefits.Service.BenefitService;

@SpringBootApplication
@EnableDiscoveryClient
public class BenefitsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BenefitsApplication.class, args);
	}
  @Autowired
  BenefitService service;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Benefit B = new Benefit(1001,"Relince health","pf",101);
		Benefit B1 = new Benefit(1002,"Bajaj health","FD",101);
		Benefit B2 = new Benefit(1003,"icici health","PF",101);
		Benefit B3 = new Benefit(1004,"Hdfc health","pf1",104);
		Benefit B4 = new Benefit(1005,"Sbi health","pf4",105);
		Benefit B5 = new Benefit(1006,"BOi health","pf5",106);
		service.addBenefit(B);
		service.addBenefit(B1);
		service.addBenefit(B2);
		service.addBenefit(B3);
		service.addBenefit(B4);
		service.addBenefit(B5);
		
		
	}

}
