package com.netjstech.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.netjstech.entities.Employee;


@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer>,PagingAndSortingRepository<Employee, Integer> {
 
//JpaRepository<Employee, Integer> {
	

}
