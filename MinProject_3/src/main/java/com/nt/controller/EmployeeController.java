package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.entity.Employee;
import com.nt.service.IEmployeeService;

@Controller
public class EmployeeController
{
	
	@Autowired
	private IEmployeeService  empService;
	@GetMapping("/")
	public String EmployeeHome()
	{
		return "welcome";
	}
	@GetMapping("report")
	public String showEmployeeData(Map<String,Object> map)
	{
		Iterable<Employee> it = empService.showEmployees();
		map.put("empData", it);
		
		return "show_report";
		
	}

}
