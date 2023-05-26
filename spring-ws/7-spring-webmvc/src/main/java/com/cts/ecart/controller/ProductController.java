package com.cts.ecart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.ecart.entity.Employee;
import com.cts.ecart.repository.EmployeeRepositoryImpl;

@Controller
public class ProductController {
	
	@Autowired
	private EmployeeRepositoryImpl empRepo;
	
	public ProductController() {
		System.out.println(">>ProductController<<<<");
	}
	
	
	// load employee form
		@RequestMapping("/loadEmpForm")
		public String loadEmpForm() {
			return "employeeform";
		}
	
	@RequestMapping(value = "/saveEmployee")
	public String saveEmployee(
			@RequestParam("firstName")String firstName,
			@RequestParam("lastName") String lastName,
			@RequestParam("email")String email,
			@RequestParam("gender")String gender ){
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(email);
		System.out.println(gender);
		return null;
	}
	
	@RequestMapping(value = "/saveEmployeev1")
	public String saveEmployeeV1(@ModelAttribute Employee emp) {
		System.out.println(emp);
		
		Employee employee=new Employee(emp.getFirstName(),emp.getLastName(),emp.getEmail(),emp.getGender());
		
		empRepo.save(employee);
		
		return "redirect:/listAll";
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
