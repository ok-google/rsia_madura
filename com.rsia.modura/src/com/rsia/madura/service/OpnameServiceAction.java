package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.OpnameDAO;
import com.rsia.madura.entity.t_Opname;

@Service
public class OpnameServiceAction implements OpnameService {
	@Autowired
	private OpnameDAO opnameDAO;
	
	@Override
	@Transactional
	public List<t_Opname> getOpnames() {

		return opnameDAO.getOpnames();
	}

	@Override
	@Transactional
	public List<t_Opname> getOpnames(int page, int limit) {

		return opnameDAO.getOpnames(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {

		return opnameDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public t_Opname getOpname(int opnameId) {

		return opnameDAO.getOpname(opnameId);
	}

	@Override
	@Transactional
	public int store(t_Opname opnameModel) {

		return opnameDAO.opnameStore(opnameModel);
	}

	@Override
	@Transactional
	public int update(t_Opname opnameModel) {

		return opnameDAO.opnameUpdate(opnameModel);
	}

	@Override
	@Transactional
	public int delete(t_Opname opnameModel) {

		return opnameDAO.opnameDelete(opnameModel);
	}

}
