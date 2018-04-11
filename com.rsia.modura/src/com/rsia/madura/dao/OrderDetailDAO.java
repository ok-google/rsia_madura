package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.t_OrderDetail;

public interface OrderDetailDAO {
	public List<t_OrderDetail> getOrderDetails();
	public List<t_OrderDetail> getOrderDetails(int page, int limit);
	public String createLinks(int page, int limit);
	public t_OrderDetail getOrderDetail(int orderDetailId);
	
	public int orderDetailStore(t_OrderDetail orderDetailModel);
	public int orderDetailUpdate(t_OrderDetail orderDetailModel);
	public int orderDetailDelete(t_OrderDetail orderDetailModel);
}
