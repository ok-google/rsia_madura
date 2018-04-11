package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.t_Resep;

public interface ResepDAO {
	public List<t_Resep> getReseps();
	public List<t_Resep> getReseps(int page, int limit);
	public String createLinks(int page, int limit);
	public t_Resep getResep(int resepId);
	
	public int resepStore(t_Resep resepModel);
	public int resepUpdate(t_Resep resepModel);
	public int resepDelete(t_Resep resepModel);
}
