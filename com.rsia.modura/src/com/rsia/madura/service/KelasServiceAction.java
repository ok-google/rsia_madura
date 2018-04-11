package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.KelasDAO;
import com.rsia.madura.entity.m_Kelas;

@Service
public class KelasServiceAction implements KelasService {
	@Autowired
	private KelasDAO kelasDAO;
	
	@Override
	@Transactional
	public List<m_Kelas> getKelass() {
		
		return kelasDAO.getKelass();
	}

	@Override
	@Transactional
	public m_Kelas getKelas(int kelasId) {
		
		return kelasDAO.getKelas(kelasId);
	}

	@Override
	@Transactional
	public int store(m_Kelas kelasModel) {
		
		return kelasDAO.kelasStore(kelasModel);

	}

	@Override
	@Transactional
	public int update(m_Kelas kelasModel) {
		
		return kelasDAO.kelasUpdate(kelasModel);
	}

	@Override
	@Transactional
	public int delete(m_Kelas kelasModel) {
		
		return kelasDAO.kelasDelete(kelasModel);

	}

}
