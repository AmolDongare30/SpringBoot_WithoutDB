package com.jbk.SpringBoot_WithoutDB.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.SpringBoot_WithoutDB.Entity.Employee;
import com.jbk.SpringBoot_WithoutDB.Service.EmployeeService;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController 
{	
	@Autowired
	EmployeeService service;
	
	
	
	@PostMapping(value="/saveEmployee")
	public String saveEmployee(@RequestBody Employee employee)
	{
		String msg=service.saveEmployee(employee);
		return msg;
	}
	
	@GetMapping(value="/getAllEmployee")
	
	public List<Employee> getAllEmployee()
	{
//		List<Employee> ls=service.getAllEmployee();
//		return ls;
		
		return service.getAllEmployee();
	}
	
	@GetMapping(value="/getEmployee/{eid}")
	public Object getEmployee(@PathVariable int eid)
	{
		Employee employee =service.getEmployee(eid);
		
		if(employee!=null)
		{
			return employee;
		}
		else {
			return "Employee Record Not Found !!!";
		}
	}
	
	
	@GetMapping(value="/getEmployeeByParam")
	public Object getEmployeeByParam(@RequestParam int eid)
	{
		Employee employee =service.getEmployee(eid);
		
		if(employee!=null)
		{
			return employee;
		}
		else {
			return "Employee Record Not Found !!!";
		}
	}
	
	
	@DeleteMapping(value="/deleteEmployee/{eid}")
	public String deleteEmployee(@PathVariable int eid) 
	{
		String msg1=service.deleteEmployee(eid);
		return msg1;
	}
	
	
	
	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		Employee emp=service.updateEmployee(employee);
		return emp;
		
	}
	
	@GetMapping("getEmployeeSalarySorted")
	public List<Employee> getEmployeeSalarySorted()
	{
		return service.getEmployeeSalarySorted();
	}
}

