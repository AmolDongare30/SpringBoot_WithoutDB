package com.jbk.SpringBoot_WithoutDB.DAO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.jbk.SpringBoot_WithoutDB.Entity.Employee;

@Repository
public class EmployeeDao_impl implements EmployeeDao 
{
	List<Employee> list=new ArrayList<>();
	
	@Override
	public String saveEmployee(Employee employee) 
	{
		list.add(employee);
		return "Data Saved Successfully....";
	}
	
	@Override
	public List<Employee> getAllEmployee() 
	{
		return list;
	}

	@Override
	public Employee getEmployee(int eid) 
	{	
		Employee employee=null;
		for(Employee emp:list)
		{
			if(eid==emp.getEid())
			{
				employee=emp;
				break;
			}
		}
		return employee;
	}

	@Override
	public String  deleteEmployee(int eid) 
	{	
		String msg="Record not Available!!!!";
		
		//Employee employee=null;
		
		for(Employee employee:list) 
		{
			if(employee.getEid()==eid)
			{
				list.remove(employee);
				msg="Record Deleted Successfully";
				break;
			}
		}
		return msg;
	}

	@Override
	public Employee updateEmployee(Employee employee) 
	{
		
		
		for(Employee emp : list)
		{
			if(emp.getEid()==employee.getEid())
			{
				list.remove(emp);
				list.add(employee);
				return employee;
						
			}
				
		}
					
		return null;
	}

	@Override
	public List<Employee> getEmployeeSalarySorted() 
	{
		//list.sort(e1,e2)->
		{
			 
		}
		return null;
	}
	
	

}
