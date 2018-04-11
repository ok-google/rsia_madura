package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.m_BarangDetail;

public interface BarangDetailDao {

	public List<m_BarangDetail> getBarangDetails();
	public List<m_BarangDetail> getBarangDetails(int page, int limit);
	public String createLinks(int page, int limit);
	public m_BarangDetail getBarangDetail(int barangdet_id);

	public int barangdetailStore(m_BarangDetail barangdetailModel);
	public int barangdetailUpdate(m_BarangDetail barangdetailModel);
	public int barangdetailDelete(m_BarangDetail barangdetailModel);
	

}
