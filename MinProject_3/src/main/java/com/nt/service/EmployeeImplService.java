package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
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
	@Override
	public String registerEmployee(Employee emp) {
		int Idvalue=repository.save(emp).getEmpno();
		return "The Employee Id Value"+Idvalue;
	}
	@Override
	public Employee getEmployee(int eno) {
		Employee emp=repository.findById(eno).orElseThrow( ()->new IllegalArgumentException());
		return emp;
	}
	@Override
	public String EditEmployee(Employee emp) {
		
		return "Employee Updated With Id Value:"+repository.save(emp).getEmpno();
	}
	@Override
	public String deleteEmployee(int eno) {
		repository.deleteById(eno);
	
		return eno+":Employee deleted ";
	}
	
	
	
	}
	


