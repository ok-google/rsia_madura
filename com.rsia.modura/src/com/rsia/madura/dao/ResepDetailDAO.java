package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.t_ResepDetail;

public interface ResepDetailDAO {
	public List<t_ResepDetail> getResepDetails();
	public List<t_ResepDetail> getResepDetails(int page, int limit);
	public String createLinks(int page, int limit);
	public t_ResepDetail getResepDetail(int resepDetailId);
	
	public int resepDetailStore(t_ResepDetail resepDetailModel);
	public int resepDetailUpdate(t_ResepDetail resepDetailModel);
	public int resepDetailDelete(t_ResepDetail resepDetailModel);
}
