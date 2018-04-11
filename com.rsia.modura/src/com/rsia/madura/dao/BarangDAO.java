package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.m_Barang;

public interface BarangDAO {

	public List<m_Barang> getBarangs();
	public List<m_Barang> getBarangs(int page, int limit);
	public String createLinks(int page, int limit);
	public m_Barang getBarang(int barangId);
	
	public int barangStore(m_Barang barangModel);
	public int barangUpdate(m_Barang barangModel);
	public int barangDelete(m_Barang barangModel);

}
