package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.s_Role;

public interface RoleDAO {
	public List<s_Role> getRoles();
	public s_Role getRole(int roleId);
	
	public int roleStore(s_Role roleModel);
	public int roleUpdate(s_Role roleModel);
	public int roleDelete(s_Role roleModel);
}
