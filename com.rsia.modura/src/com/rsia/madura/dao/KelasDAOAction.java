package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.m_Kelas;

@Repository
public class KelasDAOAction implements KelasDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<m_Kelas> getKelass() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<m_Kelas> query = current.createQuery("from m_Kelas", m_Kelas.class);
		List<m_Kelas> result = query.getResultList();
		
		return result;
	}

	@Override
	public m_Kelas getKelas(int kelasId) {
		Session current = sessionFactory.getCurrentSession();
		
		m_Kelas result = current.get(m_Kelas.class, kelasId);
		
		return result;
	}

	@Override
	public void kelasStore(m_Kelas kelasModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.save(kelasModel);

	}

	@Override
	public void kelasUpdate(m_Kelas kelasModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(kelasModel);

	}

	@Override
	public void kelasDelete(m_Kelas kelasModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(kelasModel);

	}

}
