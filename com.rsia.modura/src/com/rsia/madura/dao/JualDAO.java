package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.t_Jual;

public interface JualDAO {
	public List<t_Jual> getJuals();
	public List<t_Jual> getJuals(int page, int limit);
	public String createLinks(int page, int limit);
	public t_Jual getJual(int jualId);
	
	public int jualStore(t_Jual jualModel);
	public int jualUpdate(t_Jual jualModel);
	public int jualDelete(t_Jual jualModel);
}
