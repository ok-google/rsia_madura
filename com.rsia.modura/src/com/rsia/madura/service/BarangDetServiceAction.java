package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.entity.m_BarangDetail;
import com.rsia.madura.dao.BarangDetailDao;

@Service
public class BarangDetServiceAction implements BarangDetService {
	@Autowired
	public BarangDetailDao bardetDAO;
	
	@Override
	@Transactional
	public List<m_BarangDetail> getBarangDetails() {
		
		return bardetDAO.getBarangDetails();
	}
	
	@Override
	@Transactional
	public List<m_BarangDetail> getBarangDetails(int page, int limit) {
		
		return bardetDAO.getBarangDetails(page, limit);
	}
	
	@Override
	public String createLinks(int page, int limit) {
		
		return bardetDAO.createLinks(page, limit);
	}

	@Override
	public m_BarangDetail getBarangDetail(int bardet_id) {
		// TODO Auto-generated method stub
		return bardetDAO.getBarangDetail(bardet_id);
	}

	@Override
	@Transactional
	public void bardetStore(m_BarangDetail bardetModel) {
		// TODO Auto-generated method stub
		bardetDAO.barangdetailStore(bardetModel);
	}

	@Override
	@Transactional
	public void bardetUpdate(m_BarangDetail bardetModel) {
		// TODO Auto-generated method stub
		bardetDAO.barangdetailUpdate(bardetModel);
	}

	@Override
	@Transactional
	public void bardetDelete(m_BarangDetail bardetModel) {
		// TODO Auto-generated method stub
		bardetDAO.barangdetailDelete(bardetModel);
	}
	
	}
