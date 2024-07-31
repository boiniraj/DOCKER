package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.repository.IEmployeeRepository;
@Service("empService")
public class EmployeeImplService implements IEmployeeService
{
	@Autowired
	 private IEmployeeRepository   repository;
	@Override
	public Iterable<Employee> showEmployees() 
	{
		return repository.findAll();
	}
	

}
