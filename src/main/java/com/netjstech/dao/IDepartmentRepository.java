package com.netjstech.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.netjstech.entities.Department;


public interface IDepartmentRepository extends JpaRepository<Department, Integer>,PagingAndSortingRepository<Department, Integer> {
	
	
}
