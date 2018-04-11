package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.t_ReturJual;

public interface ReturJualDAO {
	public List<t_ReturJual> getReturJuals();
	public List<t_ReturJual> getReturJuals(int page, int limit);
	public String createLinks(int page, int limit);
	public t_ReturJual getReturJual(int returJualId);
	
	public int returJualStore(t_ReturJual returJualModel);
	public int returJualUpdate(t_ReturJual returJualModel);
	public int returJualDelete(t_ReturJual returJualModel);
}
