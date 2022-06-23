package com.jbk.SpringBoot_WithoutDB.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.SpringBoot_WithoutDB.DAO.EmployeeDao;
import com.jbk.SpringBoot_WithoutDB.Entity.Employee;


@Service
public class EmployeeService_impl implements EmployeeService 
{
	@Autowired
	
	private EmployeeDao dao;
	
	@Override
	public String saveEmployee(Employee employee) 
	{
		String msg=dao.saveEmployee(employee);
		return msg;
	}

	@Override
	public List<Employee> getAllEmployee() 
	{
		List<Employee> list=dao.getAllEmployee();
		return list;
	}

	@Override
	public Employee getEmployee(int eid)
	{
		return dao.getEmployee(eid);
		
	}

	@Override
	public String deleteEmployee(int eid) 
	{
		 String msg=dao.deleteEmployee(eid);
		 return msg;
		
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Employee str=dao.updateEmployee(employee);
		return str;
	}

	@Override
	public List<Employee> getEmployeeSalarySorted() {
		
		return dao.getEmployeeSalarySorted();
	}
	
	

}
