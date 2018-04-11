package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.s_Role;

public interface RoleService {
	public List<s_Role> getRoles();
	public s_Role getRole(int roleId);
	
	public int store(s_Role roleModel);
	public int update(s_Role roleModel);
	public int delete(s_Role roleModel);
}
