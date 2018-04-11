package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.m_PaketObat;

@Repository
public class PaketObatAction implements PaketObatDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private int total;
	
	@Override
	public List<m_PaketObat> getPaketObats() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<m_PaketObat> query = current.createQuery("from m_PaketObat", m_PaketObat.class);
		List<m_PaketObat> result = query.getResultList();
		
		return result;
	}

	@Override
	public List<m_PaketObat> getPaketObats(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<m_PaketObat> query = current.createQuery("from m_PaketObat", m_PaketObat.class);
		List<m_PaketObat> result = query.getResultList();
		this.total = result.size();
		result = this.getData(page, limit);
		
		return result;
	}
	
	private List<m_PaketObat> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
    	Query<m_PaketObat> query = current.createQuery("from m_PaketObat", m_PaketObat.class).setFirstResult((page-1)*limit).setMaxResults(limit);
        List<m_PaketObat> Result = query.getResultList();

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
	public m_PaketObat getPaketObat(int paketObatId) {
		Session current = sessionFactory.getCurrentSession();
		
		m_PaketObat result = current.get(m_PaketObat.class, paketObatId);
		
		return result;
	}

	@Override
	public int paketObatStore(m_PaketObat paketObatModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.save(paketObatModel);
		current.flush();
		
		return paketObatModel.getPaketBarang_id();
		
	}

	@Override
	public int paketObatUpdate(m_PaketObat paketObatModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(paketObatModel);
		current.flush();
		
		return paketObatModel.getPaketBarang_id();
		
	}

	@Override
	public int paketObatDelete(m_PaketObat paketObatModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(paketObatModel);
		current.flush();
		
		return paketObatModel.getPaketBarang_id();
		
	}

}
