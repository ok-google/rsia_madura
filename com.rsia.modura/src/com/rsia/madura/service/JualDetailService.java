package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.t_JualDetail;

public interface JualDetailService {
	public List<t_JualDetail> getJualDetails();
	public List<t_JualDetail> getJualDetails(int page, int limit);
	public String createLinks(int page, int limit);
	public t_JualDetail getJualDetail(int jualDetailId);
	
	public int store(t_JualDetail jualDetailModel);
	public int update(t_JualDetail jualDetailModel);
	public int delete(t_JualDetail jualDetailModel);
}
