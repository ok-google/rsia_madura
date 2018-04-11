package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.t_Order;

public interface OrderService {
	public List<t_Order> getOrders();
	public List<t_Order> getOrders(int page, int limit);
	public String createLinks(int page, int limit);
	public t_Order getOrder(int orderId);
	
	public int store(t_Order orderModel);
	public int update(t_Order orderModel);
	public int delete(t_Order orderModel);
}
