package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.t_BarangTrans;

public interface BarangTransService {
	public List<t_BarangTrans> getBarangTranss();
	public List<t_BarangTrans> getBarangTranss(int page, int limit);
	public String createLinks(int page, int limit);
	public t_BarangTrans getBarangTrans(int barangTransId);
	
	public int store(t_BarangTrans barangTransModel);
	public int update(t_BarangTrans barangTransModel);
	public int delete(t_BarangTrans barangTransModel);
}
