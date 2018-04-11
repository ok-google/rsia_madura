package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.m_Obat;

@Repository
public class ObatAction implements ObatDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private int total;
	
	@Override
	public List<m_Obat> getObats() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<m_Obat> query = current.createQuery("from m_Obat", m_Obat.class);
		List<m_Obat> result = query.getResultList();
		
		return result;
	}

	@Override
	public List<m_Obat> getObats(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<m_Obat> query = current.createQuery("from m_Obat", m_Obat.class);
		List<m_Obat> result = query.getResultList();
		this.total = result.size();
		result = this.getData(page, limit);
		
		return result;
	}
	
	private List<m_Obat> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
    	Query<m_Obat> query = current.createQuery("from m_Obat", m_Obat.class).setFirstResult((page-1)*limit).setMaxResults(limit);
        List<m_Obat> Result = query.getResultList();

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
	public m_Obat getObat(int obatId) {
		Session current = sessionFactory.getCurrentSession();
		
		m_Obat result = current.get(m_Obat.class, obatId);
		
		return result;
	}

	@Override
	public int obatStore(m_Obat obatModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.save(obatModel);
		current.flush();
		
		return obatModel.getObat_id();

	}

	@Override
	public int obatUpdate(m_Obat obatModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(obatModel);
		current.flush();
		
		return obatModel.getObat_id();

	}

	@Override
	public int obatDelete(m_Obat obatModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(obatModel);
		current.flush();
		
		return obatModel.getObat_id();

	}

}
