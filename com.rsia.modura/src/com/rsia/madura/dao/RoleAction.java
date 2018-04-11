package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.s_Role;

@Repository
public class RoleAction implements RoleDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<s_Role> getRoles() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<s_Role> query = current.createQuery("from s_Role where roleAktif = 'Y'", s_Role.class);
		List<s_Role> result = query.getResultList();
		
		return result;
	}

	@Override
	public s_Role getRole(int roleId) {
		Session current = sessionFactory.getCurrentSession();
		
		s_Role result = current.get(s_Role.class, roleId);
		
		return result;
	}


	@Override
	public int roleStore(s_Role roleModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.save(roleModel);
		current.flush();
		
		return roleModel.getRole_id();

	}

	@Override
	public int roleUpdate(s_Role roleModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(roleModel);
		current.flush();
		
		return roleModel.getRole_id();

	}

	@Override
	public int roleDelete(s_Role roleModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(roleModel);
		current.flush();
		
		return roleModel.getRole_id();

	}

}
