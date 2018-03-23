package com.rsia.madura.dao;

import java.sql.Date;
import java.util.List;

import com.rsia.madura.entity.t_Gaji;
import com.rsia.madura.entity.getGaji;

public interface GajiDAO {
	public List<getGaji> getGajis();
	public t_Gaji getGaji(int gajiId);
	public getGaji getReport(int gajiId);
	public void getTotal(t_Gaji gajiModel);
	
	public void gajiStore(t_Gaji gajiModel);
	public void gajiUpdate(t_Gaji gajiModel);
	public void gajiDelete(t_Gaji gajiModel);
	public Date convertDateToSQLType(Date date) throws Exception;
}
