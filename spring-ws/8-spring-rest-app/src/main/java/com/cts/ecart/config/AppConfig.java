package com.cts.ecart.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("com.cts.ecart.service,com.cts.ecart.repository")
public class AppConfig {
	
	

}
