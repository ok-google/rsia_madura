package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.SatuanDAO;
import com.rsia.madura.entity.m_Satuan;

@Service
public class SatuanServiceAction implements SatuanService {
	@Autowired
	private SatuanDAO satuanDAO;
	
	@Override
	@Transactional
	public List<m_Satuan> getSatuans() {
		
		return satuanDAO.getSatuans();
	}

	@Override
	@Transactional
	public m_Satuan getSatuan(int satuanId) {
		
		return satuanDAO.getSatuan(satuanId);
	}

	@Override
	@Transactional
	public void store(m_Satuan satuanModel) {
		
		satuanDAO.satuanStore(satuanModel);
		
	}

	@Override
	@Transactional
	public void update(m_Satuan satuanModel) {
		
		satuanDAO.satuanUpdate(satuanModel);
	}

	@Override
	@Transactional
	public void delete(m_Satuan satuanModel) {
		
		satuanDAO.satuanDelete(satuanModel);
	}

}
