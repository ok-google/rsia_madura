package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.OrderDAO;
import com.rsia.madura.entity.t_Order;

@Service
public class OrderServiceAction implements OrderService {
	@Autowired
	private OrderDAO orderDAO;
	
	@Override
	@Transactional
	public List<t_Order> getOrders() {
		
		return orderDAO.getOrders();
	}

	@Override
	@Transactional
	public List<t_Order> getOrders(int page, int limit) {
		
		return orderDAO.getOrders(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {
		
		return orderDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public t_Order getOrder(int orderId) {
		
		return orderDAO.getOrder(orderId);
	}

	@Override
	@Transactional
	public int store(t_Order orderModel) {

		return orderDAO.orderStore(orderModel);
	}

	@Override
	@Transactional
	public int update(t_Order orderModel) {

		return orderDAO.orderUpdate(orderModel);
	}

	@Override
	@Transactional
	public int delete(t_Order orderModel) {
	
		return orderDAO.orderDelete(orderModel);
	}

}
