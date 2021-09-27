package com.netjstech.service;

import java.util.List;

import com.netjstech.entities.Department;


public interface IDepartmentService {
	public Department addDepartment(Department dname);
	public List<Department> getAllDepartments();
	public List<Department> getAllDepartByPagination(int maxPage,int ofset);
	public int getAllDepartCount();
	public boolean deleteDepartment(int id);
	

}
