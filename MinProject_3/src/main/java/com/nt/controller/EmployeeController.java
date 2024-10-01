package com.nt.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.entity.Employee;
import com.nt.service.IEmployeeService;

@Controller
@RequestMapping("/app")
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
	
	@GetMapping("/register")
	public String showRegisterPage(@ModelAttribute("emp") Employee emp)
	{
		return "register_page";
	}
	@PostMapping("/register")
	public String showRegisterEmp(@ModelAttribute("emp") Employee emp,Map<String,Object> map)
	{
		String msg=empService.registerEmployee(emp);
		map.put("resultMsg",msg);
		return "redirect:report";
	}
	
	@GetMapping("/edit")
	public String EditEmployeeform(@RequestParam("no") int  no,@ModelAttribute("emp") Employee emp)
	{
		Employee emp1=empService.getEmployee(no);
		BeanUtils.copyProperties(emp1,emp);
		return "edit_employee";
	}
	
	@PostMapping("/edit")
	public String UpdateEmployee(RedirectAttributes attr,@ModelAttribute("emp") Employee emp)
	{
		String msg=empService.EditEmployee(emp);
		attr.addFlashAttribute("resultMsg", msg);
		return "redirect:report";
	}
	@GetMapping("/delete")
	public String DeleteEmployee(RedirectAttributes attr,@RequestParam int no )
	{
		String msg=empService.deleteEmployee(no);
		attr.addFlashAttribute("resultMsg",msg);
		return "redirect:report";
		
	}
	
	
	

}
