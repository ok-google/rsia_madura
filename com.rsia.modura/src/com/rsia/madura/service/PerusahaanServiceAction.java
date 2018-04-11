package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.PerusahaanDAO;
import com.rsia.madura.entity.m_Perusahaan;

@Service
public class PerusahaanServiceAction implements PerusahaanService {
	@Autowired
	private PerusahaanDAO perusahaanDAO;
	
	@Override
	@Transactional
	public List<m_Perusahaan> getPerusahaans() {
		
		return perusahaanDAO.getPerusahaans();
	}

	@Override
	@Transactional
	public List<m_Perusahaan> getPerusahaans(int page, int limit) {
		
		return perusahaanDAO.getPerusahaans(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {
		
		return perusahaanDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public m_Perusahaan getPerusahaan(int perusahaanId) {
		
		return perusahaanDAO.getPerusahaan(perusahaanId);
	}

	@Override
	@Transactional
	public int store(m_Perusahaan perusahaanModel) {

		return perusahaanDAO.perusahaanStore(perusahaanModel);
	}

	@Override
	@Transactional
	public int update(m_Perusahaan perusahaanModel) {

		return perusahaanDAO.perusahaanUpdate(perusahaanModel);
	}

	@Override
	@Transactional
	public int delete(m_Perusahaan perusahaanModel) {

		return perusahaanDAO.perusahaanDelete(perusahaanModel);
	}

}
