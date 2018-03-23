package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.m_PaketObat;

public interface PaketObatService {
	public List<m_PaketObat> getPaketObats();
	public List<m_PaketObat> getPaketObats(int page, int limit);
	public String createLinks(int page, int limit);
	public m_PaketObat getPaketObat(int paketObatId);
	
	public void store(m_PaketObat paketObatModel);
	public void update(m_PaketObat paketObatModel);
	public void delete(m_PaketObat paketObatModel);
}
