package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.t_TerimaDetail;

public interface TerimaDetailService {
	public List<t_TerimaDetail> getTerimaDetails();
	public List<t_TerimaDetail> getTerimaDetails(int page, int limit);
	public String createLinks(int page, int limit);
	public t_TerimaDetail getTerimaDetail(int terimaDetailId);
	
	public int store(t_TerimaDetail terimaDetailModel);
	public int update(t_TerimaDetail terimaDetailModel);
	public int delete(t_TerimaDetail terimaDetailModel);
}
