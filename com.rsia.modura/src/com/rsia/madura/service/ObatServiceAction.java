package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.ObatDAO;
import com.rsia.madura.entity.m_Obat;

@Service
public class ObatServiceAction implements ObatService {
	@Autowired
	private ObatDAO obatDAO;
	
	@Override
	@Transactional
	public List<m_Obat> getObats() {
		
		return obatDAO.getObats();
	}

	@Override
	@Transactional
	public List<m_Obat> getObats(int page, int limit) {
		
		return obatDAO.getObats(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {
		
		return obatDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public m_Obat getObat(int obatId) {
		
		return obatDAO.getObat(obatId);
	}

	@Override
	@Transactional
	public int store(m_Obat obatModel) {

		return obatDAO.obatStore(obatModel);

	}

	@Override
	@Transactional
	public int update(m_Obat obatModel) {
		
		return obatDAO.obatUpdate(obatModel);
	}

	@Override
	@Transactional
	public int delete(m_Obat obatModel) {
		return obatDAO.obatDelete(obatModel);

	}

}
