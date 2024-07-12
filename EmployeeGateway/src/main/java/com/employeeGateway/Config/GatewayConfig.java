package com.employeeGateway.Config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    
	   @Bean
	   public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
			
			return builder.routes()
			.route(p -> p.path("/benefit/**")
	                .uri("lb://Benefits/benefit"))
			.route(p -> p.path("/emp/**")
					.uri("lb://EMPLOYEE/emp"))
			.build();
					
	
	
}

}