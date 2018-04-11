package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.OrderDetailDAO;
import com.rsia.madura.entity.t_OrderDetail;

@Service
public class OrderDetailServiceAction implements OrderDetailService {
	@Autowired
	private OrderDetailDAO orderDetailDAO;
	
	@Override
	@Transactional
	public List<t_OrderDetail> getOrderDetails() {

		return orderDetailDAO.getOrderDetails();
	}

	@Override
	@Transactional
	public List<t_OrderDetail> getOrderDetails(int page, int limit) {
		
		return orderDetailDAO.getOrderDetails(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {

		return orderDetailDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public t_OrderDetail getOrderDetail(int orderDetailId) {
		
		return orderDetailDAO.getOrderDetail(orderDetailId);
	}

	@Override
	@Transactional
	public int store(t_OrderDetail orderDetailModel) {

		return orderDetailDAO.orderDetailStore(orderDetailModel);
	}

	@Override
	@Transactional
	public int update(t_OrderDetail orderDetailModel) {

		return orderDetailDAO.orderDetailUpdate(orderDetailModel);
	}

	@Override
	@Transactional
	public int delete(t_OrderDetail orderDetailModel) {

		return orderDetailDAO.orderDetailDelete(orderDetailModel);
	}

}
