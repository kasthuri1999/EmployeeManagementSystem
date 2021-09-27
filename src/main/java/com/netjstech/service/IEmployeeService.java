package com.netjstech.service;

import java.util.List;

import com.netjstech.entities.Employee;


public interface IEmployeeService {
	public Employee addEmployee(Employee emp);
	public void deleteEmployee(int id);
	public Employee updateEmployee(Employee emp);
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(int userid);
	public List<Employee> getAllEmployeesByPagination(int maxPage,int ofset);
	public int getEmployeeCount();

}
