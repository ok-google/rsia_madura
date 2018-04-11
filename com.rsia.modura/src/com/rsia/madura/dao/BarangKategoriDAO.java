package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.m_BarangKategori;

public interface BarangKategoriDAO {

	public List<m_BarangKategori> getKategoris();
	public List<m_BarangKategori> getKategoris(int page, int limit);
	public String createLinks(int page, int limit);
	public m_BarangKategori getBarangKategori(int kategoriId);
	
	public int kategoriStore(m_BarangKategori kategoriModel);
	public int kategoriUpdate(m_BarangKategori kategoriModel);
	public int kategoriDelete(m_BarangKategori kategoriModel);
	
}
