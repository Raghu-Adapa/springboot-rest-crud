package com.myapp.springbootrestcrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myapp.springbootrestcrud.entity.Employee;

import org.hibernate.query.Query;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {
	
	private EntityManager entityManager;

	@Autowired
	public EmployeeDAOHibernateImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	
	@Override
	@Transactional
	public List<Employee> findAll() {
		// get the hibernate sesion
		Session currentSession = entityManager.unwrap(Session.class);
		//create a query
		Query<Employee> query= currentSession.createQuery("from Employee", Employee.class);
		
		// execute
		List<Employee> employees = query.getResultList();
		return employees;
	}

}
