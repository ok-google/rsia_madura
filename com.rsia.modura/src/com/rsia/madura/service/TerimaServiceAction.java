package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.TerimaDAO;
import com.rsia.madura.entity.t_Terima;

@Service
public class TerimaServiceAction implements TerimaService {
	@Autowired
	private TerimaDAO terimaDAO;
	
	@Override
	@Transactional
	public List<t_Terima> getTerimas() {

		return terimaDAO.getTerimas();
	}

	@Override
	@Transactional
	public List<t_Terima> getTerimas(int page, int limit) {

		return terimaDAO.getTerimas(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {

		return terimaDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public t_Terima getTerima(int terimaId) {

		return terimaDAO.getTerima(terimaId);
	}

	@Override
	@Transactional
	public int store(t_Terima terimaModel) {

		return terimaDAO.terimaStore(terimaModel);
	}

	@Override
	@Transactional
	public int update(t_Terima terimaModel) {

		return terimaDAO.terimaUpdate(terimaModel);
	}

	@Override
	public int delete(t_Terima terimaModel) {

		return terimaDAO.terimaDelete(terimaModel);
	}

}
