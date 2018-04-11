package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.m_Perusahaan;

public interface PerusahaanDAO {
	public List<m_Perusahaan> getPerusahaans();
	public List<m_Perusahaan> getPerusahaans(int page, int limit);
	public String createLinks(int page, int limit);
	public m_Perusahaan getPerusahaan(int perusahaanId);
	
	public int perusahaanStore(m_Perusahaan perusahaanModel);
	public int perusahaanUpdate(m_Perusahaan perusahaanModel);
	public int perusahaanDelete(m_Perusahaan perusahaanModel);
}
