package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.entity.m_Barang;
import com.rsia.madura.dao.BarangDAO;

@Service
public class BarangServiceAction implements BarangService {
	@Autowired
	private BarangDAO barangDAO;

	@Override
	@Transactional
	public List<m_Barang> getBarangs() {
		return barangDAO.getBarangs();
	}

	@Override
	@Transactional
	public List<m_Barang> getBarangs(int page, int limit) {
		
		return barangDAO.getBarangs(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {
		
		return barangDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public m_Barang getBarang(int barangId) {

		return barangDAO.getBarang(barangId);
	}

	@Override
	@Transactional
	public int store(m_Barang barangModel) {
		// TODO Auto-generated method stub
		return barangDAO.barangStore(barangModel);
	}

	@Override
	@Transactional
	public int update(m_Barang barangModel) {
		// TODO Auto-generated method stub
		return barangDAO.barangUpdate(barangModel);
	}

	@Override
	@Transactional
	public int delete(m_Barang barangModel) {
		// TODO Auto-generated method stub
		return barangDAO.barangDelete(barangModel);
	}
	
	

}
