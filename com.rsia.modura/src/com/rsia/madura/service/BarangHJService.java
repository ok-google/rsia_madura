package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.m_BarangHJ;

public interface BarangHJService {

	public List<m_BarangHJ> getBarangHJs();

	public List<m_BarangHJ> getBarangHJs(int page, int limit);

	public String createLinks(int page, int limit);

	public m_BarangHJ getBarangHJ(int IDBarangHJ);

	public int store(m_BarangHJ baranghjModel);

	public int update(m_BarangHJ baranghjModel);

	public int delete(m_BarangHJ baranghjModel);

}
