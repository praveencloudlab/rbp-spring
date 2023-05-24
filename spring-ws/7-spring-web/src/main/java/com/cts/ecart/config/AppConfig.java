package com.cts.ecart.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cts.ecart.service,com.cts.ecart.reposiotory")
public class AppConfig {
	
	public AppConfig() {
		System.out.println(">> AppConfig");
	}
	

}
