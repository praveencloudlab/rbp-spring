package com.cts.ecart.resource;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.cts.ecart.config.AppConfig;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppConfig.class)
@WebAppConfiguration
public class ProductApiResourceTest {
	
	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	@BeforeEach
	public void setup() {
		this.mockMvc=MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	@Test
	public void testGetProducts()throws Exception {
		this.mockMvc.perform(get("/api/products").accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())	
		.andExpect(content().contentType(MediaType.APPLICATION_JSON));
		
				
		
	}
	
	
	
	
	
	

}
