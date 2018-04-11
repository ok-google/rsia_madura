package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.t_Resep;

public interface ResepService {
	public List<t_Resep> getReseps();
	public List<t_Resep> getReseps(int page, int limit);
	public String createLinks(int page, int limit);
	public t_Resep getResep(int resepId);
	
	public int store(t_Resep resepModel);
	public int update(t_Resep resepModel);
	public int delete(t_Resep resepModel);
}
