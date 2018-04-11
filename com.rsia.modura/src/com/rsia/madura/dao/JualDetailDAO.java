package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.t_JualDetail;

public interface JualDetailDAO {
	public List<t_JualDetail> getJualDetails();
	public List<t_JualDetail> getJualDetails(int page, int limit);
	public String createLinks(int page, int limit);
	public t_JualDetail getJualDetail(int jualDetailId);
	
	public int jualDetailStore(t_JualDetail jualDetailModel);
	public int jualDetailUpdate(t_JualDetail jualDetailModel);
	public int jualDetailDelete(t_JualDetail jualDetailModel);
}
