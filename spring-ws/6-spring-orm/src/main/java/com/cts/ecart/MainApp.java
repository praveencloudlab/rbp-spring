package com.cts.ecart;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cts.ecart.config.AppConfig;
import com.cts.ecart.entity.Employee;
import com.cts.ecart.repository.EmployeeRepositoryImpl;

public class MainApp {

	public static void main(String[] args) {

		AbstractApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		EmployeeRepositoryImpl empRepo = ac.getBean(EmployeeRepositoryImpl.class);

		// empRepo.listAll().forEach(emp->{
		// System.out.println(emp);
		// });

		// empRepo.listAll().forEach(System.out::println);

		// List<Employee> emps =
		// empRepo.listAll().stream().filter(emp->emp.getGender().equals("Male")).toList();
		// emps.forEach(System.out::println);

		/*
		Employee emp = empRepo.findById(3);
		if (emp != null)
			System.out.println(emp);
		else
			System.out.println("Employee id not found");
			
		 */
		
		//empRepo.save(new Employee("Praveen","reddy","abc@abnc.com","Male"));
		
		
		empRepo.update(5004);
		
		

	}

}
