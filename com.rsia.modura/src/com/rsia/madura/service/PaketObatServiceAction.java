package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.PaketObatDAO;
import com.rsia.madura.entity.m_PaketObat;

@Service
public class PaketObatServiceAction implements PaketObatService {
	@Autowired
	private PaketObatDAO paketObatDAO;
	
	@Override
	@Transactional
	public List<m_PaketObat> getPaketObats() {
		
		return paketObatDAO.getPaketObats();
	}

	@Override
	@Transactional
	public List<m_PaketObat> getPaketObats(int page, int limit) {
		
		return paketObatDAO.getPaketObats(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {

		return paketObatDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public m_PaketObat getPaketObat(int paketObatId) {
		
		return paketObatDAO.getPaketObat(paketObatId);
	}

	@Override
	@Transactional
	public void store(m_PaketObat paketObatModel) {
		
		paketObatDAO.paketObatStore(paketObatModel);

	}

	@Override
	@Transactional
	public void update(m_PaketObat paketObatModel) {
		
		paketObatDAO.paketObatUpdate(paketObatModel);

	}

	@Override
	@Transactional
	public void delete(m_PaketObat paketObatModel) {
		
		paketObatDAO.paketObatDelete(paketObatModel);
	}

}
