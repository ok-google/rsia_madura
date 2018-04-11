package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.StokObatDAO;
import com.rsia.madura.entity.t_StokObat;

@Service
public class StokObatServiceAction implements StokObatService {
	@Autowired
	private StokObatDAO stokObatDAO;
	
	@Override
	@Transactional
	public List<t_StokObat> getStokObats() {
		
		return stokObatDAO.getStokObats();
	}

	@Override
	@Transactional
	public List<t_StokObat> getStokObats(int page, int limit) {

		return stokObatDAO.getStokObats(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {
		
		return stokObatDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public t_StokObat getStokObat(int stokObatId) {
		
		return stokObatDAO.getStokObat(stokObatId);
	}

	@Override
	@Transactional
	public int stokObatStore(t_StokObat stokObatModel) {
		
		return stokObatDAO.stokObatStore(stokObatModel);

	}

	@Override
	@Transactional
	public int stokObatUpdate(t_StokObat stokObatModel) {
		
		return stokObatDAO.stokObatUpdate(stokObatModel);

	}

	@Override
	@Transactional
	public int stokObatDelete(t_StokObat stokObatModel) {
		
		return stokObatDAO.stokObatDelete(stokObatModel);

	}

}
