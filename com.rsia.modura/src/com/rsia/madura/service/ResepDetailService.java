package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.t_ResepDetail;

public interface ResepDetailService {
	public List<t_ResepDetail> getResepDetails();
	public List<t_ResepDetail> getResepDetails(int page, int limit);
	public String createLinks(int page, int limit);
	public t_ResepDetail getResepDetail(int resepDetailId);
	
	public int store(t_ResepDetail resepDetailModel);
	public int update(t_ResepDetail resepDetailModel);
	public int delete(t_ResepDetail resepDetailModel);
}
