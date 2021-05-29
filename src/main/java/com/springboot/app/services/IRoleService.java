package com.springboot.app.services;

import java.util.List;

import com.springboot.app.domain.Role;
import com.springboot.app.dto.RoleDto;

public interface IRoleService {
	List<Role> getAll();
	
	boolean Insert(RoleDto roles);
	
	boolean Update(Role roles, Long id);
	
	boolean Delete(Long id);
}
