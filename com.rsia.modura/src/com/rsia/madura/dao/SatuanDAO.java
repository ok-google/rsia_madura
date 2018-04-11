package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.m_Satuan;

public interface SatuanDAO {
	public List<m_Satuan> getSatuans();
	public m_Satuan getSatuan(int satuanId);
	
	public int satuanStore(m_Satuan satuanModel);
	public int satuanUpdate(m_Satuan satuanModel);
	public int satuanDelete(m_Satuan satuanModel);
}
