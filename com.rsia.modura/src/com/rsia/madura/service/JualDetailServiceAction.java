package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.JualDetailDAO;
import com.rsia.madura.entity.t_JualDetail;

@Service
public class JualDetailServiceAction implements JualDetailService{
	@Autowired
	private JualDetailDAO jualDetailDAO;
	
	@Override
	@Transactional
	public List<t_JualDetail> getJualDetails() {

		return jualDetailDAO.getJualDetails();
	}

	@Override
	@Transactional
	public List<t_JualDetail> getJualDetails(int page, int limit) {

		return jualDetailDAO.getJualDetails(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {
		
		return jualDetailDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public t_JualDetail getJualDetail(int jualDetailId) {

		return jualDetailDAO.getJualDetail(jualDetailId);
	}

	@Override
	@Transactional
	public int store(t_JualDetail jualDetailModel) {

		return jualDetailDAO.jualDetailStore(jualDetailModel);
	}

	@Override
	@Transactional
	public int update(t_JualDetail jualDetailModel) {

		return jualDetailDAO.jualDetailUpdate(jualDetailModel);
	}

	@Override
	@Transactional
	public int delete(t_JualDetail jualDetailModel) {

		return jualDetailDAO.jualDetailDelete(jualDetailModel);
	}

}
