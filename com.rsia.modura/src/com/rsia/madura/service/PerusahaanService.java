package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.m_Perusahaan;

public interface PerusahaanService {
	public List<m_Perusahaan> getPerusahaans();
	public List<m_Perusahaan> getPerusahaans(int page, int limit);
	public String createLinks(int page, int limit);
	public m_Perusahaan getPerusahaan(int perusahaanId);
	
	public int store(m_Perusahaan perusahaanModel);
	public int update(m_Perusahaan perusahaanModel);
	public int delete(m_Perusahaan perusahaanModel);
}
