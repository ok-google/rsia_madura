package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.m_BarangKategori;

public interface BarangKategoriService {

	public List<m_BarangKategori> getKategoris();
	public List<m_BarangKategori> getKategoris(int page, int limit);
	public m_BarangKategori getBarangKategori(int kategoriId);
	
	public String createLinks(int page, int limit);
	public int store(m_BarangKategori kategoriModel);
	public int update(m_BarangKategori kategoriModel);
	public int delete(m_BarangKategori kategoriModel);
}
