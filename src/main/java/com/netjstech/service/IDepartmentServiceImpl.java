package com.netjstech.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.netjstech.dao.IDepartmentRepository;
import com.netjstech.entities.Department;
import com.netjstech.entities.Employee;


@Service
public class IDepartmentServiceImpl implements IDepartmentService {
@Autowired
	private IDepartmentRepository repository;
	
	//@Override
	public Department addDepartment(Department dname) {
		// TODO Auto-generated method stub
		 return repository.save(dname);
	}

	@Override
	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Department> getAllDepartByPagination(int maxPage, int ofset) {
		// TODO Auto-generated method stub
		Pageable paging = PageRequest.of(maxPage, ofset);
		Page<Department> pageResult = repository.findAll(paging);
		return pageResult.toList();
		
	} 

	@Override
	public int getAllDepartCount() {
		// TODO Auto-generated method stub
		return (int) repository.count();
	}

	@Override
	public boolean deleteDepartment(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		return true;
	}

}
