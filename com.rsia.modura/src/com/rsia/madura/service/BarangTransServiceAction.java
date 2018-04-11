package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.BarangTransDAO;
import com.rsia.madura.entity.t_BarangTrans;

@Service
public class BarangTransServiceAction implements BarangTransService {
	@Autowired
	private BarangTransDAO barangTransDAO;
	
	@Override
	@Transactional
	public List<t_BarangTrans> getBarangTranss() {
	
		return barangTransDAO.getBarangTranss();
	}

	@Override
	@Transactional
	public List<t_BarangTrans> getBarangTranss(int page, int limit) {

		return barangTransDAO.getBarangTranss(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {
		
		return barangTransDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public t_BarangTrans getBarangTrans(int barangTransId) {

		return barangTransDAO.getBarangTrans(barangTransId);
	}

	@Override
	@Transactional
	public int store(t_BarangTrans barangTransModel) {
		
		return barangTransDAO.barangTransStore(barangTransModel);
	}

	@Override
	@Transactional
	public int update(t_BarangTrans barangTransModel) {
		
		return barangTransDAO.barangTransUpdate(barangTransModel);
	}

	@Override
	@Transactional
	public int delete(t_BarangTrans barangTransModel) {
		
		return barangTransDAO.barangTransDelete(barangTransModel);
	}

}
