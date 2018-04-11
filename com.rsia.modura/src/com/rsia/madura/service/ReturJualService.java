package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.t_ReturJual;

public interface ReturJualService {
	public List<t_ReturJual> getReturJuals();
	public List<t_ReturJual> getReturJuals(int page, int limit);
	public String createLinks(int page, int limit);
	public t_ReturJual getReturJual(int returJualId);
	
	public int store(t_ReturJual returJualModel);
	public int update(t_ReturJual returJualModel);
	public int delete(t_ReturJual returJualModel);
}
