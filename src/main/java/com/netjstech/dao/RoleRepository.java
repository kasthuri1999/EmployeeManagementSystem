package com.netjstech.dao;


import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.netjstech.entities.Role;
import com.netjstech.entities.Roles;


public interface RoleRepository extends JpaRepository<Role, Integer>{
	Optional<Role> findByRoleName(Roles role);
}

