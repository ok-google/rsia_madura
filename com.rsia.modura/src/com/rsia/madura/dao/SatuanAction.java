package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.m_Satuan;

@Repository
public class SatuanAction implements SatuanDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<m_Satuan> getSatuans() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<m_Satuan> query = current.createQuery("from m_Satuan", m_Satuan.class);
		List<m_Satuan> result = query.getResultList();
		
		return result;
	}

	@Override
	public m_Satuan getSatuan(int satuanId) {
		Session current = sessionFactory.getCurrentSession();
		
		m_Satuan result = current.get(m_Satuan.class, satuanId);
		
		return result;
	}

	@Override
	public void satuanStore(m_Satuan satuanModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.save(satuanModel);

	}

	@Override
	public void satuanUpdate(m_Satuan satuanModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(satuanModel);

	}

	@Override
	public void satuanDelete(m_Satuan satuanModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(satuanModel);

	}

}
