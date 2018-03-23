package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.s_Role;

public interface RoleDAO {
	public List<s_Role> getRoles();
	public s_Role getRole(int roleId);
	
	public void roleStore(s_Role roleModel);
	public void roleUpdate(s_Role roleModel);
	public void roleDelete(s_Role roleModel);
}
