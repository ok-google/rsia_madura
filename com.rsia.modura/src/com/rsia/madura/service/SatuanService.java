package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.m_Satuan;

public interface SatuanService {
	public List<m_Satuan> getSatuans();
	public m_Satuan getSatuan(int satuanId);
	
	public void store(m_Satuan satuanModel);
	public void update(m_Satuan satuanModel);
	public void delete(m_Satuan satuanModel);
}
