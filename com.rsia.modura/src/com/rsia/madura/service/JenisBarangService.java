package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.m_JenisBarang;

public interface JenisBarangService {
	public List<m_JenisBarang> getJenisBarangs();
	public m_JenisBarang getJenisBarang(int jenisBarangId);
	
	public void store(m_JenisBarang jenisBarangModel);
	public void update(m_JenisBarang jenisBarangModel);
	public void delete(m_JenisBarang jenisBarangModel);
}
