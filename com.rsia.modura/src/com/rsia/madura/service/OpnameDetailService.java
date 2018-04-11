package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.t_OpnameDetail;

public interface OpnameDetailService {
	public List<t_OpnameDetail> getOpnameDetails();
	public List<t_OpnameDetail> getOpnameDetails(int page, int limit);
	public String createLinks(int page, int limit);
	public t_OpnameDetail getOpnameDetail(int opnameDetailId);
	
	public int store(t_OpnameDetail opnameDetailModel);
	public int update(t_OpnameDetail opnameDetailModel);
	public int delete(t_OpnameDetail opnameDetailModel);
}
