package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.t_OpnameDetail;

public interface OpnameDetaiDAO {
	public List<t_OpnameDetail> getOpnameDetails();
	public List<t_OpnameDetail> getOpnameDetails(int page, int limit);
	public String createLinks(int page, int limit);
	public t_OpnameDetail getOpnameDetail(int opnameDetailId);
	
	public int opnameDetailStore(t_OpnameDetail opnameDetailModel);
	public int opnameDetailUpdate(t_OpnameDetail opnameDetailModel);
	public int opnameDetailDelete(t_OpnameDetail opnameDetailModel);
}
