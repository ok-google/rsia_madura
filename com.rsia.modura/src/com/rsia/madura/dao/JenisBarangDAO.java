package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.m_JenisBarang;

public interface JenisBarangDAO {
	public List<m_JenisBarang> getJenisBarangs();
	public m_JenisBarang getJenisBarang(int jenisBarangId);
	
	public void jenisBarangStore(m_JenisBarang jenisBarangModel);
	public void jenisBarangUpdate(m_JenisBarang jenisBarangModel);
	public void jenisBarangDelete(m_JenisBarang jenisBarangModel);
}
