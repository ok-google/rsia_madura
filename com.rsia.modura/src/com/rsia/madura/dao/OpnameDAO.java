package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.t_Opname;

public interface OpnameDAO {
	public List<t_Opname> getOpnames();
	public List<t_Opname> getOpnames(int page, int limit);
	public String createLinks(int page, int limit);
	public t_Opname getOpname(int opnameId);
	
	public int opnameStore(t_Opname opnameModel);
	public int opnameUpdate(t_Opname opnameModel);
	public int opnameDelete(t_Opname opnameModel);
}
