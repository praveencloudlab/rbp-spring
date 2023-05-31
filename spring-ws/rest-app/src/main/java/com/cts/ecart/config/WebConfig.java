package com.cts.ecart.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("com.cts.ecart.resource")
@EnableTransactionManagement
public class WebConfig implements WebMvcConfigurer {
	public WebConfig() {
		System.out.println(">>>WebConfig");
	}


}
