package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.m_Kelas;

public interface KelasDAO {
	public List<m_Kelas> getKelass();
	public m_Kelas getKelas(int kelasId);
	
	public void kelasStore(m_Kelas kelasModel);
	public void kelasUpdate(m_Kelas kelasModel);
	public void kelasDelete(m_Kelas kelasModel);
}
