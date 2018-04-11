package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.m_Perusahaan;

@Repository
public class PerusahaanAction implements PerusahaanDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private int total;
	@Override
	public List<m_Perusahaan> getPerusahaans() {
Session current = sessionFactory.getCurrentSession();
		
		Query<m_Perusahaan> query = current.createQuery("from m_Perusahaan", m_Perusahaan.class);
		List<m_Perusahaan> result = query.getResultList();
		
		return result;
	}

	@Override
	public List<m_Perusahaan> getPerusahaans(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<m_Perusahaan> query = current.createQuery("from m_Perusahaan", m_Perusahaan.class);
		List<m_Perusahaan> barang = query.getResultList();
		this.total = barang.size();
		barang = this.getData(page, limit);
		
		return barang;
	}
	
	private List<m_Perusahaan> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
    	Query<m_Perusahaan> query = current.createQuery("from m_Perusahaan", m_Perusahaan.class).setFirstResult((page-1)*limit).setMaxResults(limit);
        List<m_Perusahaan> Result = query.getResultList();

        return Result;
	}

	@Override
	public String createLinks(int page, int limit) {
		double last       = Math.ceil( (double)this.total / (double)limit );

        int start      = ( ( page - 5 ) > 0 ) ? page - 5 : 1;
        int end        = (int) (( ( page + 5 ) < last ) ? page + 5 : last);

        String html       = "<ul class='pagination'>";

        String first     = ( page == 1 ) ? "disabled" : "";
        html = html + "<li class='page-first' "+ first + "><a href='?limit=" + limit + "&page=" + ( page - 1 ) + "'>&laquo;</a></li>";

        if ( start > 1 ) {
            html   = html + "<li class='page-number'><a href='?limit="+ limit + "&page=1'>1</a></li>";
            html   = html + "<li class='page-number disabled'><span>...</span></li>";
        }

        for ( int i = start ; i <= end; i++ ) {
            String position  = ( page == i ) ? "active" : "";
            html   = html + "<li class='page-number ' " + position + "'><a href='?limit=" + limit + "&page=" + i + "'> "+ i + "</a></li>";
        }

        if ( end < last ) {
            html   = html + "<li class='page-number disabled'><span>...</span></li>";
            html   = html + "<li class='page-number'><a href='?limit=" + limit + "&page=" + (int)last + "'>" + (int)last + "</a></li>";
        }

        String status      = ( page == (int)last ) ? "disabled" : "";
        html       = html + "<li class='page-number " + status + "'><a href='?limit=" + limit + "&page=" + ( page + 1 ) + "'>&raquo;</a></li>";

        html       = html + "</ul>";

        return html;
	}

	@Override
	public m_Perusahaan getPerusahaan(int perusahaanId) {
		Session current = sessionFactory.	getCurrentSession();
		
		m_Perusahaan result = current.get(m_Perusahaan.class, perusahaanId);
		
		return result;
	}

	@Override
	public int perusahaanStore(m_Perusahaan perusahaanModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.save(perusahaanModel);
		current.flush();
		
		return perusahaanModel.getPerusahaan_id();
	}

	@Override
	public int perusahaanUpdate(m_Perusahaan perusahaanModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(perusahaanModel);
		current.flush();
		
		return perusahaanModel.getPerusahaan_id();
	}

	@Override
	public int perusahaanDelete(m_Perusahaan perusahaanModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(perusahaanModel);
		current.flush();
		
		return perusahaanModel.getPerusahaan_id();
	}

}
