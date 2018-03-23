package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.m_Kelas;

public interface KelasService {
	public List<m_Kelas> getKelass();
	public m_Kelas getKelas(int kelasId);
	
	public void store(m_Kelas kelasModel);
	public void update(m_Kelas kelasModel);
	public void delete(m_Kelas kelasModel);
}
