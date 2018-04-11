package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.t_OrderDetail;

public interface OrderDetailService {
	public List<t_OrderDetail> getOrderDetails();
	public List<t_OrderDetail> getOrderDetails(int page, int limit);
	public String createLinks(int page, int limit);
	public t_OrderDetail getOrderDetail(int orderDetailId);
	
	public int store(t_OrderDetail orderDetailModel);
	public int update(t_OrderDetail orderDetailModel);
	public int delete(t_OrderDetail orderDetailModel);
}
