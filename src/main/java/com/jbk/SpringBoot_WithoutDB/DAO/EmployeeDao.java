package com.jbk.SpringBoot_WithoutDB.DAO;

import java.util.List;

import com.jbk.SpringBoot_WithoutDB.Entity.Employee;

public interface EmployeeDao 
{

	public String saveEmployee(Employee employee);

	public List<Employee> getAllEmployee();
	
	public Employee getEmployee(int eid);

	public String deleteEmployee(int eid);

	public Employee updateEmployee(Employee employee);

	public List<Employee> getEmployeeSalarySorted();
}
