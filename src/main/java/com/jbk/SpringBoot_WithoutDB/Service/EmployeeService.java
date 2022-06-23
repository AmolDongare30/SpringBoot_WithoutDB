package com.jbk.SpringBoot_WithoutDB.Service;

import java.util.List;

import com.jbk.SpringBoot_WithoutDB.Entity.Employee;

public interface EmployeeService 
{
	public String saveEmployee(Employee employee);
	
	public List<Employee> getAllEmployee();
	
	public Employee getEmployee(int eid);
	
	public String deleteEmployee(int eid);

	public Employee updateEmployee(Employee employee);

	public List<Employee> getEmployeeSalarySorted();
}
