package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.ResepDAO;
import com.rsia.madura.entity.t_Resep;

@Service
public class ResepServiceAction implements ResepService {
	@Autowired
	private ResepDAO resepDAO;
	
	@Override
	@Transactional
	public List<t_Resep> getReseps() {

		return resepDAO.getReseps();
	}

	@Override
	@Transactional
	public List<t_Resep> getReseps(int page, int limit) {

		return resepDAO.getReseps(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {

		return resepDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public t_Resep getResep(int resepId) {

		return resepDAO.getResep(resepId);
	}

	@Override
	@Transactional
	public int store(t_Resep resepModel) {

		return resepDAO.resepStore(resepModel);
	}

	@Override
	@Transactional
	public int update(t_Resep resepModel) {

		return resepDAO.resepUpdate(resepModel);
	}

	@Override
	@Transactional
	public int delete(t_Resep resepModel) {

		return resepDAO.resepDelete(resepModel);
	}

}
