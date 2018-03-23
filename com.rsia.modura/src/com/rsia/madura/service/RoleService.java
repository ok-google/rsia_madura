package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.s_Role;

public interface RoleService {
	public List<s_Role> getRoles();
	public s_Role getRole(int roleId);
	
	public void store(s_Role roleModel);
	public void update(s_Role roleModel);
	public void delete(s_Role roleModel);
}
