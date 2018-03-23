package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.t_StokObat;

public interface StokObatDAO {
	public List<t_StokObat> getStokObats();
	public List<t_StokObat> getStokObats(int page, int limit);
	public String createLinks(int page, int limit);
	public t_StokObat getStokObat(int stokObatId);
	
	public void stokObatStore(t_StokObat stokObatModel);
	public void stokObatUpdate(t_StokObat stokObatModel);
	public void stokObatDelete(t_StokObat stokObatModel);
}
