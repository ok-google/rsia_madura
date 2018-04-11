package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.t_Terima;

public interface TerimaService {
	public List<t_Terima> getTerimas();
	public List<t_Terima> getTerimas(int page, int limit);
	public String createLinks(int page, int limit);
	public t_Terima getTerima(int terimaId);
	
	public int store(t_Terima terimaModel);
	public int update(t_Terima terimaModel);
	public int delete(t_Terima terimaModel);
}
