package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.m_JenisBarang;

@Repository
public class JenisBarangAction implements JenisBarangDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<m_JenisBarang> getJenisBarangs() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<m_JenisBarang> gajiQuery = current.createQuery("from m_JenisBarang", m_JenisBarang.class);
		List<m_JenisBarang> result = gajiQuery.getResultList();
		
		return result;
		
	}

	@Override
	public m_JenisBarang getJenisBarang(int jenisBarangId) {
		Session current = sessionFactory.getCurrentSession();
		
		m_JenisBarang result = current.get(m_JenisBarang.class, jenisBarangId);
		
		return result;
	}

	@Override
	public void jenisBarangStore(m_JenisBarang jenisBarangModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.save(jenisBarangModel);
		
	}

	@Override
	public void jenisBarangUpdate(m_JenisBarang jenisBarangModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(jenisBarangModel);
		
	}

	@Override
	public void jenisBarangDelete(m_JenisBarang jenisBarangModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(jenisBarangModel);
		
	}
}
