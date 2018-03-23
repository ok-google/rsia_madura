package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.m_Satuan;

public interface SatuanDAO {
	public List<m_Satuan> getSatuans();
	public m_Satuan getSatuan(int satuanId);
	
	public void satuanStore(m_Satuan satuanModel);
	public void satuanUpdate(m_Satuan satuanModel);
	public void satuanDelete(m_Satuan satuanModel);
}
