package com.nt.service;

import com.nt.entity.Employee;

public interface IEmployeeService 
{
	
	public Iterable<Employee> showEmployees() ;
	public String registerEmployee(Employee emp);
	public Employee getEmployee(int eno);
	public String EditEmployee(Employee emp);
	public String deleteEmployee(int no);

}
