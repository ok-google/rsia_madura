package com.rsia.madura.service;

import java.sql.Date;
import java.util.List;

import com.rsia.madura.entity.t_Gaji;
import com.rsia.madura.entity.getGaji;

public interface GajiService {
	public List<getGaji> getGajis();
	public t_Gaji getGaji(int gajiId);
	public getGaji getReport(int gajiId);
	public void getTotal(t_Gaji gajiModel);
	
	public void store(t_Gaji gajiModel);
	public void update(t_Gaji gajiModel);
	public void delete(t_Gaji gajiModel);
	public Date convertDateToSQLType(Date date) throws Exception;
}
