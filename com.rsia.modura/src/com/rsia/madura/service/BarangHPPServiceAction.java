package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.entity.m_BarangHPP;
import com.rsia.madura.dao.BarangHPPDAO;

@Service
public class BarangHPPServiceAction implements BarangHPPService {

	@Autowired
	private BarangHPPDAO baranghppDAO;
	
	@Override
	@Transactional
	public List<m_BarangHPP> getBarangHPPs() {
		// TODO Auto-generated method stub
		return baranghppDAO.getBaranghpps();
	}

	@Override
	@Transactional
	public List<m_BarangHPP> getBarangHPPs(int page, int limit) {
		// TODO Auto-generated method stub
		return baranghppDAO.getBaranghpps(page, limit);
	}

	@Override
	@Transactional
	public m_BarangHPP getBarangHPP(int IdBarangHPP) {
		// TODO Auto-generated method stub
		return baranghppDAO.getBarangHPP(IdBarangHPP);
	}

	@Override
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		return baranghppDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public int store(m_BarangHPP baranghppModel) {
		// TODO Auto-generated method stub
		return baranghppDAO.baranghppStore(baranghppModel);
		
	}

	@Override
	@Transactional
	public int update(m_BarangHPP baranghppModel) {
		// TODO Auto-generated method stub
		return baranghppDAO.baranghppUpdate(baranghppModel);
	}

	@Override
	@Transactional
	public int delete(m_BarangHPP baranghppModel) {
		// TODO Auto-generated method stub
		return baranghppDAO.baranghppDelete(baranghppModel);
	}

}
