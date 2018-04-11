package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.t_Terima;

public interface TerimaDAO {
	public List<t_Terima> getTerimas();
	public List<t_Terima> getTerimas(int page, int limit);
	public String createLinks(int page, int limit);
	public t_Terima getTerima(int terimaId);
	
	public int terimaStore(t_Terima terimaModel);
	public int terimaUpdate(t_Terima terimaModel);
	public int terimaDelete(t_Terima terimaModel);
}
