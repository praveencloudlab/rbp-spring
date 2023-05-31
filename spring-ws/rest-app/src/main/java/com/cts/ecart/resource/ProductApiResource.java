package com.cts.ecart.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.ecart.entity.Employee;
import com.cts.ecart.repository.EmployeeRepositoryImpl;

@RestController
@RequestMapping("/api/products")
public class ProductApiResource {
	
	@Autowired
	private EmployeeRepositoryImpl empRepo;
	
	@GetMapping
	public List<Employee> listAll(){
		
		return empRepo.listAll();
	}
	
	@GetMapping("/{empId}")
	public Employee findEmployee(@PathVariable int empId) {
		return empRepo.findById(empId);
	}
	
}
