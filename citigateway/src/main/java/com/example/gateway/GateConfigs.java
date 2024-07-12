package com.example.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GateConfigs {
	
	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
		
		return builder.routes()
		.route(p -> p.path("/comment/**")
                .uri("lb://MICROSERVICEFEGIN1/comment"))
		.route(p -> p.path("/post/**")
				.uri("lb://MICROSERVICEFEGIN/post"))
		.build();
				
	}

}
