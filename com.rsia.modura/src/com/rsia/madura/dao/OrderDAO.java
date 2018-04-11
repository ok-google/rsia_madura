package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.t_Order;

public interface OrderDAO {
	public List<t_Order> getOrders();
	public List<t_Order> getOrders(int page, int limit);
	public String createLinks(int page, int limit);
	public t_Order getOrder(int orderId);
	
	public int orderStore(t_Order orderModel);
	public int orderUpdate(t_Order orderModel);
	public int orderDelete(t_Order orderModel);
}
