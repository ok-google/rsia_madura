package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.m_JenisBarang;

public interface JenisBarangDAO {
	public List<m_JenisBarang> getJenisBarangs();
	public m_JenisBarang getJenisBarang(int jenisBarangId);
	
	public int jenisBarangStore(m_JenisBarang jenisBarangModel);
	public int jenisBarangUpdate(m_JenisBarang jenisBarangModel);
	public int jenisBarangDelete(m_JenisBarang jenisBarangModel);
}
