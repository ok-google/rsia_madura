package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.t_BarangTrans;

public interface BarangTransDAO {
	public List<t_BarangTrans> getBarangTranss();
	public List<t_BarangTrans> getBarangTranss(int page, int limit);
	public String createLinks(int page, int limit);
	public t_BarangTrans getBarangTrans(int barangTransId);
	
	public int barangTransStore(t_BarangTrans barangTransModel);
	public int barangTransUpdate(t_BarangTrans barangTransModel);
	public int barangTransDelete(t_BarangTrans barangTransModel);
}
