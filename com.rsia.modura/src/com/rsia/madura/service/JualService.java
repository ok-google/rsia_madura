package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.t_Jual;

public interface JualService {
	public List<t_Jual> getJuals();
	public List<t_Jual> getJuals(int page, int limit);
	public String createLinks(int page, int limit);
	public t_Jual getJual(int jualId);
	
	public int store(t_Jual jualModel);
	public int update(t_Jual jualModel);
	public int delete(t_Jual jualModel);
}
