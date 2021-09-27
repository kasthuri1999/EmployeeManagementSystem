package com.netjstech.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.netjstech.entities.UserEntity;


@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>{
	public UserEntity findByUserName(String userName);
	public boolean existsByUserName(String userName);
}
