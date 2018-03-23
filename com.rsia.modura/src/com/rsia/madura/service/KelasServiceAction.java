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
	public void store(m_Kelas kelasModel) {
		
		kelasDAO.kelasStore(kelasModel);

	}

	@Override
	@Transactional
	public void update(m_Kelas kelasModel) {
		
		kelasDAO.kelasUpdate(kelasModel);
	}

	@Override
	@Transactional
	public void delete(m_Kelas kelasModel) {
		
		kelasDAO.kelasDelete(kelasModel);

	}

}
