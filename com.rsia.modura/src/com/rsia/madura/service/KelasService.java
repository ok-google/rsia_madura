package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.m_Kelas;

public interface KelasService {
	public List<m_Kelas> getKelass();
	public m_Kelas getKelas(int kelasId);
	
	public int store(m_Kelas kelasModel);
	public int update(m_Kelas kelasModel);
	public int delete(m_Kelas kelasModel);
}
