package com.cts.ecart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.ecart.entity.Employee;
import com.cts.ecart.repository.EmployeeRepositoryImpl;

@Controller
public class ProductController {
	
	@Autowired
	private EmployeeRepositoryImpl empRepo;
	
	public ProductController() {
		System.out.println(">>ProductController<<<<");
	}
	
	// list all emps from db
	@RequestMapping(value = "/listAll")
	public String listAllEmps(Model model) {
		
		
		List<Employee> emps = empRepo.listAll();
		System.out.println(emps);
		model.addAttribute("employees", emps);
		
		
		return "employees";
	}
	
	
	@RequestMapping(value = "/s1")
	public String f1(Model model) {
		System.out.println(">>>f1 method");
		
		String user="Admin";
		model.addAttribute("userName", user);// request Scope
		
		
		return "one"; // view name: 
	}

}
