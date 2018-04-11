package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.m_Satuan;

public interface SatuanService {
	public List<m_Satuan> getSatuans();
	public m_Satuan getSatuan(int satuanId);
	
	public int store(m_Satuan satuanModel);
	public int update(m_Satuan satuanModel);
	public int delete(m_Satuan satuanModel);
}
