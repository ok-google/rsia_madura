package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.JenisBarangDAO;
import com.rsia.madura.entity.m_JenisBarang;

@Service
public class JenisBarangServiceAction implements JenisBarangService{
	@Autowired
	private JenisBarangDAO jenisBarangDAO;
	
	@Override
	@Transactional
	public List<m_JenisBarang> getJenisBarangs() {
		
		return jenisBarangDAO.getJenisBarangs();
	}

	@Override
	@Transactional
	public m_JenisBarang getJenisBarang(int jenisBarangId) {
		
		return jenisBarangDAO.getJenisBarang(jenisBarangId);
	}

	@Override
	@Transactional
	public int store(m_JenisBarang jenisBarangModel) {
		
		return jenisBarangDAO.jenisBarangStore(jenisBarangModel);
		
	}

	@Override
	@Transactional
	public int update(m_JenisBarang jenisBarangModel) {
		
		return jenisBarangDAO.jenisBarangUpdate(jenisBarangModel);
	}

	@Override
	@Transactional
	public int delete(m_JenisBarang jenisBarangModel) {
		
		return jenisBarangDAO.jenisBarangDelete(jenisBarangModel);
	}

}
