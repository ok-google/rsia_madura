package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.m_Kelas;

public interface KelasDAO {
	public List<m_Kelas> getKelass();
	public m_Kelas getKelas(int kelasId);
	
	public int kelasStore(m_Kelas kelasModel);
	public int kelasUpdate(m_Kelas kelasModel);
	public int kelasDelete(m_Kelas kelasModel);
}
