package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.m_PaketObat;

public interface PaketObatService {
	public List<m_PaketObat> getPaketObats();
	public List<m_PaketObat> getPaketObats(int page, int limit);
	public String createLinks(int page, int limit);
	public m_PaketObat getPaketObat(int paketObatId);
	
	public int store(m_PaketObat paketObatModel);
	public int update(m_PaketObat paketObatModel);
	public int delete(m_PaketObat paketObatModel);
}
