package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.OpnameDetaiDAO;
import com.rsia.madura.entity.t_OpnameDetail;

@Service
public class OpnaneDetailServiceAction implements OpnameDetailService {
	@Autowired
	private OpnameDetaiDAO opnameDetailDAO;
	
	@Override
	@Transactional
	public List<t_OpnameDetail> getOpnameDetails() {

		return opnameDetailDAO.getOpnameDetails();
	}

	@Override
	@Transactional
	public List<t_OpnameDetail> getOpnameDetails(int page, int limit) {

		return opnameDetailDAO.getOpnameDetails(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {

		return opnameDetailDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public t_OpnameDetail getOpnameDetail(int opnameDetailId) {

		return opnameDetailDAO.getOpnameDetail(opnameDetailId);
	}

	@Override
	@Transactional
	public int store(t_OpnameDetail opnameDetailModel) {

		return opnameDetailDAO.opnameDetailStore(opnameDetailModel);
	}

	@Override
	@Transactional
	public int update(t_OpnameDetail opnameDetailModel) {

		return opnameDetailDAO.opnameDetailUpdate(opnameDetailModel);
	}

	@Override
	@Transactional
	public int delete(t_OpnameDetail opnameDetailModel) {

		return opnameDetailDAO.opnameDetailDelete(opnameDetailModel);
	}

}
