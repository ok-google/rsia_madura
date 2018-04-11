package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.m_BarangDetail;

public interface BarangDetService {

	public List<m_BarangDetail> getBarangDetails();
	public List<m_BarangDetail> getBarangDetails(int page, int limit);
	public String createLinks(int page, int limit);
	public m_BarangDetail getBarangDetail(int bardet_id);
	
	public int bardetStore(m_BarangDetail bardetModel);
	public int bardetUpdate(m_BarangDetail bardetModel);
	public int bardetDelete(m_BarangDetail bardetModel);
	
}
