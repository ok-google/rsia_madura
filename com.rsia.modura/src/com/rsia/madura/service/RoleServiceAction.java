package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.RoleDAO;
import com.rsia.madura.entity.s_Role;

@Service
public class RoleServiceAction implements RoleService {
	@Autowired
	private RoleDAO roleDAO;
	
	@Override
	@Transactional
	public List<s_Role> getRoles() {
		
		return roleDAO.getRoles();
	}

	@Override
	@Transactional
	public s_Role getRole(int roleId) {
		
		return roleDAO.getRole(roleId);
	}

	@Override
	@Transactional
	public void store(s_Role roleModel) {
		
		roleDAO.roleStore(roleModel);

	}

	@Override
	@Transactional
	public void update(s_Role roleModel) {
		
		roleDAO.roleUpdate(roleModel);

	}

	@Override
	@Transactional
	public void delete(s_Role roleModel) {
		
		roleDAO.roleDelete(roleModel);

	}

}
