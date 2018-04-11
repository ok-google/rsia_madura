package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.t_TerimaDetail;

public interface TerimaDetailDAO {
	public List<t_TerimaDetail> getTerimaDetails();
	public List<t_TerimaDetail> getTerimaDetails(int page, int limit);
	public String createLinks(int page, int limit);
	public t_TerimaDetail getTerimaDetail(int terimaDetailId);
	
	public int terimaDetailStore(t_TerimaDetail terimaDetailModel);
	public int terimaDetailUpdate(t_TerimaDetail terimaDetailModel);
	public int terimaDetailDelete(t_TerimaDetail terimaDetailModel);
}
