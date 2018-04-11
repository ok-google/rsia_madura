package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.m_BarangHJ;

public interface BarangHJDAO {

	public List<m_BarangHJ> getBarangHJs();

	public List<m_BarangHJ> getBarangHJs(int page, int limit);

	public String createLinks(int page, int limit);

	public int baranghjStore(m_BarangHJ baranghjModel);

	public m_BarangHJ getbarangHJ(int IDBarangHJ);

	public int barangHJUpdate(m_BarangHJ baranghjModel);

	public int BarangHJDelete(m_BarangHJ baranghjModel);

}
