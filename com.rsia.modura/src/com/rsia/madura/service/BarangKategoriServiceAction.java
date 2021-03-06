package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.entity.m_BarangKategori;
import com.rsia.madura.dao.BarangKategoriDAO;

@Service
public class BarangKategoriServiceAction implements BarangKategoriService {
	@Autowired
	private BarangKategoriDAO barangKategoriDAO; 
	
	
	@Override
	@Transactional
	public List<m_BarangKategori> getKategoris() {
		return barangKategoriDAO.getKategoris();
	}

	@Override
	@Transactional
	public List<m_BarangKategori> getKategoris(int page, int limit) {
		return barangKategoriDAO.getKategoris(page, limit);
	}

	@Override
	@Transactional
	public m_BarangKategori getBarangKategori(int kategoriId) {
		return barangKategoriDAO.getBarangKategori(kategoriId);
	}

	@Override
	public String createLinks(int page, int limit) {
		return barangKategoriDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public int store(m_BarangKategori kategoriModel) {
		
		return barangKategoriDAO.kategoriStore(kategoriModel);

	}

	@Override
	@Transactional
	public int update(m_BarangKategori kategoriModel) {
		
		return barangKategoriDAO.kategoriUpdate(kategoriModel);

	}

	@Override
	@Transactional
	public int delete(m_BarangKategori kategoriModel) {
		
		return barangKategoriDAO.kategoriDelete(kategoriModel);

	}

}
