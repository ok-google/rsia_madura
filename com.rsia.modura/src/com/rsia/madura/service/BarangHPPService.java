package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.m_BarangHPP;

public interface BarangHPPService {

	public List<m_BarangHPP> getBarangHPPs();
	public List<m_BarangHPP> getBarangHPPs(int page, int limit);
	public m_BarangHPP getBarangHPP(int IdBarangHPP);
	
	public String createLinks(int page, int limit);
	public void store(m_BarangHPP baranghppModel);
	public void update(m_BarangHPP baranghppModel);
	public void delete(m_BarangHPP baranghppModel);
}
