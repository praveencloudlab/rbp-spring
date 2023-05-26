package com.cts.ecart.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.ecart.entity.Employee;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

@Repository
public class EmployeeRepositoryImpl {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	// save employee
	@Transactional
	public Employee save(Employee emp) {
		
		
		
		System.out.println("REPO::: "+emp);
		Session session = sessionFactory.getCurrentSession();
		//session.save(emp);
		session.persist(emp);
		return emp;
	}
	
	@Transactional
	public Employee update(int id) {
		Session session = sessionFactory.getCurrentSession();
		Employee employee = findById(id);
		employee.setFirstName("Bucky");
		employee.setLastName("Wall");
		//employee.setGender("Female");
		employee.setEmail("bucky@abc.com");
		session.persist(employee);
		return employee;
		
	}
	

	// find an employee by ID
	@Transactional
	public Employee findById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Employee employee = session.get(Employee.class, id);

		if (employee != null)
			return employee;
		else
			return null;
	}

	@Transactional
	public List<Employee> listAll() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
		Root<Employee> root = cq.from(Employee.class);
		cq.select(root);
		Query query = session.createQuery(cq);
		return query.getResultList();
	}

}
