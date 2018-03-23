package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.rsia.madura.entity.m_Barang;

@Repository
public class BarangAction implements BarangDAO {

	@Autowired
	private SessionFactory sessionFactory;
	public int total;

	@Override
	public List<m_Barang> getBarangs() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<m_Barang> query = current.createQuery("from m_Barang", m_Barang.class);
		List<m_Barang> barang = query.getResultList();
		
		return barang;
	}

	@Override
	public List<m_Barang> getBarangs(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<m_Barang> query = current.createQuery("from m_Barang", m_Barang.class);
		List<m_Barang> barang = query.getResultList();
		this.total = barang.size();
		barang = this.getData(page, limit);
		
		return barang;
	}

	private List<m_Barang> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
    	Query<m_Barang> query = current.createQuery("from m_Barang", m_Barang.class).setFirstResult((page-1)*limit).setMaxResults(limit);
        List<m_Barang> Result = query.getResultList();

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
	public m_Barang getBarang(int barangId) {
		Session current = sessionFactory.getCurrentSession();
		
		m_Barang result = current.get(m_Barang.class, barangId);
		
		return result;
	}

	@Override
	public void barangStore(m_Barang barangModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.save(barangModel);
		
	}

	@Override
	public void barangUpdate(m_Barang barangModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(barangModel);
		
	}

	@Override
	public void barangDelete(m_Barang barangModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(barangModel);
		
	}
}
