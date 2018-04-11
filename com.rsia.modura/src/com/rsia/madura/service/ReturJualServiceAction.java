package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.ReturJualDAO;
import com.rsia.madura.entity.t_ReturJual;

@Service
public class ReturJualServiceAction implements ReturJualService {
	@Autowired
	private ReturJualDAO returJualDAO;
	
	@Override
	@Transactional
	public List<t_ReturJual> getReturJuals() {
		
		return returJualDAO.getReturJuals();
	}

	@Override
	@Transactional
	public List<t_ReturJual> getReturJuals(int page, int limit) {
		
		return returJualDAO.getReturJuals(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {
		
		return returJualDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public t_ReturJual getReturJual(int returJualId) {
		
		return returJualDAO.getReturJual(returJualId);
	}

	@Override
	@Transactional
	public int store(t_ReturJual returJualModel) {
		
		return returJualDAO.returJualStore(returJualModel);
	}

	@Override
	@Transactional
	public int update(t_ReturJual returJualModel) {
		
		return returJualDAO.returJualUpdate(returJualModel);
	}

	@Override
	@Transactional
	public int delete(t_ReturJual returJualModel) {
		
		return returJualDAO.returJualDelete(returJualModel);
	}

}
