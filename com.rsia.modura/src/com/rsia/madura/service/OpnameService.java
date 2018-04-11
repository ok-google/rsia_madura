package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.t_Opname;

public interface OpnameService {
	public List<t_Opname> getOpnames();
	public List<t_Opname> getOpnames(int page, int limit);
	public String createLinks(int page, int limit);
	public t_Opname getOpname(int opnameId);
	
	public int store(t_Opname opnameModel);
	public int update(t_Opname opnameModel);
	public int delete(t_Opname opnameModel);
}
