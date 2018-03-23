package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.m_PaketObat;

public interface PaketObatDAO {
	public List<m_PaketObat> getPaketObats();
	public List<m_PaketObat> getPaketObats(int page, int limit);
	public String createLinks(int page, int limit);
	public m_PaketObat getPaketObat(int paketObatId);
	
	public void paketObatStore(m_PaketObat paketObatModel);
	public void paketObatUpdate(m_PaketObat paketObatModel);
	public void paketObatDelete(m_PaketObat paketObatModel);
}
