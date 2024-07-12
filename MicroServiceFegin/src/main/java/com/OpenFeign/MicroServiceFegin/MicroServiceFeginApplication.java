package com.OpenFeign.MicroServiceFegin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients("com.OpenFeign.MicroServiceFegin.Service")
@SpringBootApplication
@EnableDiscoveryClient
public class MicroServiceFeginApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceFeginApplication.class, args);
	}

}
