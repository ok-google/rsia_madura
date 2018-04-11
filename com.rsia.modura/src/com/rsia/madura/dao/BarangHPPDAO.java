package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.m_BarangHPP;


public interface BarangHPPDAO {

	public List<m_BarangHPP> getBaranghpps();
	public List<m_BarangHPP> getBaranghpps(int page, int limit);
	public String createLinks(int page, int limit);
	public m_BarangHPP getBarangHPP(int IdBarangHPP);
	
	public int baranghppStore(m_BarangHPP baranghppModel);
	public int baranghppUpdate(m_BarangHPP baranghppModel);
	public int baranghppDelete(m_BarangHPP baranghppModel);
}
