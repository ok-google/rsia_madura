package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.PaketDAO;
import com.rsia.madura.entity.m_Paket;

@Service
public class PaketServiceAction implements PaketService {
	@Autowired
	private PaketDAO paketDAO;
	
	@Override
	@Transactional
	public List<m_Paket> getPakets() {
		
		return paketDAO.getPakets();
	}

	@Override
	@Transactional
	public List<m_Paket> getPakets(int page, int limit) {
		
		return paketDAO.getPakets(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {
		
		return paketDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public m_Paket getPaket(int paketId) {
		
		return paketDAO.getPaket(paketId);
	}

	@Override
	@Transactional
	public int store(m_Paket paketModel) {
		return paketDAO.paketStore(paketModel);

	}

	@Override
	@Transactional
	public int update(m_Paket paketModel) {
		return paketDAO.paketUpdate(paketModel);

	}

	@Override
	@Transactional
	public int delete(m_Paket paketModel) {
		return paketDAO.paketDelete(paketModel);

	}

}
