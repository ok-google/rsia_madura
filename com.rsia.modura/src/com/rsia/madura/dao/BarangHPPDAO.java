package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.m_BarangHPP;


public interface BarangHPPDAO {

	public List<m_BarangHPP> getBaranghpps();
	public List<m_BarangHPP> getBaranghpps(int page, int limit);
	public String createLinks(int page, int limit);
	public m_BarangHPP getBarangHPP(int IdBarangHPP);
	
	public void baranghppStore(m_BarangHPP baranghppModel);
	public void baranghppUpdate(m_BarangHPP baranghppModel);
	public void baranghppDelete(m_BarangHPP baranghppModel);
}
