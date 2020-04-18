package com.myapp.springbootrestcrud.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.springbootrestcrud.entity.Employee;
import com.myapp.springbootrestcrud.dao.EmployeeDAO;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	private EmployeeDAO empDao;

	@Autowired
	public EmployeeRestController(EmployeeDAO empDao) {
		
		this.empDao = empDao;
	}
	
	@GetMapping("/employees")
	public List<Employee> findAll(){
		return empDao.findAll();
	}
	
	
}
