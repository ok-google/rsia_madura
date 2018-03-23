package com.rsia.madura.dao;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.rsia.madura.entity.m_Pegawai;
import com.rsia.madura.entity.getPegawai;

public interface PegawaiDAO {
	public List<getPegawai> getPegawais();
	public m_Pegawai getPegawai(int pegawaiId);
	
	public void pegawaiStore(m_Pegawai pegawaiModel);
	public int getId();
	public void pegawaiUpdate(m_Pegawai pegawaiModel);
	public void pegawaiDelete(m_Pegawai pegawaiModel);
	public String pegawaiUpload(HttpServletRequest request, CommonsMultipartFile pegawaiFoto) throws IOException ;
	
	public Date convertDateToSQLType(Date date) throws Exception;
}
