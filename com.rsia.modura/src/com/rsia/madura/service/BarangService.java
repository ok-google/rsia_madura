package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.m_Barang;

public interface BarangService {
	public List<m_Barang> getBarangs();
	public List<m_Barang> getBarangs(int page, int limit);
	public String createLinks(int page, int limit);
	public m_Barang getBarang(int barangId);
	
	public int store(m_Barang barangModel);
	public int update(m_Barang barangModel);
	public int delete(m_Barang barangModel);
}
