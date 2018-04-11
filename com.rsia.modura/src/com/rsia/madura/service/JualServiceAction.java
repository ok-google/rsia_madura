package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.JualDAO;
import com.rsia.madura.entity.t_Jual;

@Service
public class JualServiceAction implements JualService {
	@Autowired
	private JualDAO jualDAO;
	
	@Override
	@Transactional
	public List<t_Jual> getJuals() {
		
		return jualDAO.getJuals();
	}

	@Override
	@Transactional
	public List<t_Jual> getJuals(int page, int limit) {
		
		return jualDAO.getJuals(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {
		
		return jualDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public t_Jual getJual(int jualId) {
		
		return jualDAO.getJual(jualId);
	}

	@Override
	@Transactional
	public int store(t_Jual jualModel) {
		
		return jualDAO.jualStore(jualModel);
	}

	@Override
	@Transactional
	public int update(t_Jual jualModel) {
		
		return jualDAO.jualUpdate(jualModel);
	}

	@Override
	@Transactional
	public int delete(t_Jual jualModel) {

		return jualDAO.jualDelete(jualModel);
	}

}
