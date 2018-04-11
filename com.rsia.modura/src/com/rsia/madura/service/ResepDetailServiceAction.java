package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.ResepDetailDAO;
import com.rsia.madura.entity.t_ResepDetail;

@Service
public class ResepDetailServiceAction implements ResepDetailService {
	@Autowired
	private ResepDetailDAO resepDetailDAO;
	
	@Override
	@Transactional
	public List<t_ResepDetail> getResepDetails() {

		return resepDetailDAO.getResepDetails();
	}

	@Override
	@Transactional
	public List<t_ResepDetail> getResepDetails(int page, int limit) {

		return resepDetailDAO.getResepDetails(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {

		return resepDetailDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public t_ResepDetail getResepDetail(int resepDetailId) {

		return resepDetailDAO.getResepDetail(resepDetailId);
	}

	@Override
	@Transactional
	public int store(t_ResepDetail resepDetailModel) {

		return resepDetailDAO.resepDetailStore(resepDetailModel);
	}

	@Override
	@Transactional
	public int update(t_ResepDetail resepDetailModel) {

		return resepDetailDAO.resepDetailUpdate(resepDetailModel);
	}

	@Override
	@Transactional
	public int delete(t_ResepDetail resepDetailModel) {

		return resepDetailDAO.resepDetailDelete(resepDetailModel);
	}

}
