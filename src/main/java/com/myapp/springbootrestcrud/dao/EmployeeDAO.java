package com.myapp.springbootrestcrud.dao;

import java.util.List;

import com.myapp.springbootrestcrud.entity.Employee;

public interface EmployeeDAO {
	
	public List<Employee> findAll();

}
