package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.m_Obat;

public interface ObatService {
	public List<m_Obat> getObats();
	public List<m_Obat> getObats(int page, int limit);
	public String createLinks(int page, int limit);
	public m_Obat getObat(int obatId);
	
	public void store(m_Obat obatModel);
	public void update(m_Obat obatModel);
	public void delete(m_Obat obatModel);
}
