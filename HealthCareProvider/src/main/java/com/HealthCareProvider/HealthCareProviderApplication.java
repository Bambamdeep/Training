package com.HealthCareProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.HealthCareProvider.Model.HealthCareProvider;
import com.HealthCareProvider.Service.HealthCareProviderService;

@SpringBootApplication
@EnableDiscoveryClient
public class HealthCareProviderApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(HealthCareProviderApplication.class, args);
	}
	@Autowired
	HealthCareProviderService service;  
	@Override
	public void run(String... args) throws Exception {
		
		HealthCareProvider H = new 	HealthCareProvider(20,"d6fds","tdcf","fvyfgv","fthygg",101);
		HealthCareProvider H1 = new 	HealthCareProvider(21,"d6fdspppp","tooiidcf","fvyyftdsfgv","fthhfvygg",102);
		HealthCareProvider H2 = new 	HealthCareProvider(22,"ycvhv","juvbtgv","fvv","gg",101);
		HealthCareProvider H3 = new 	HealthCareProvider(23,"ycvhv","juvbtgv","fvv","gg",103);
		service.add(H);
		service.add(H1);
		service.add(H2);
		service.add(H3);
		
	}

}
