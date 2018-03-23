package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.m_BarangHJ;


@Repository
public class BarangHJAction implements BarangHJDAO {

	@Autowired
	private SessionFactory sessionFactory;
	public int total;
	
	@Override
	public List<m_BarangHJ> getBarangHJs() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<m_BarangHJ> query = current.createQuery("from m_BarangHJ", m_BarangHJ.class);
		
		List<m_BarangHJ> baranghj = query.getResultList();
		return baranghj;
	}
	
	@Override
	public List<m_BarangHJ> getBarangHJs(int page, int limit){
		Session current = sessionFactory.getCurrentSession();
		Query<m_BarangHJ> query = current.createQuery("from m_BarangHJ", m_BarangHJ.class);
		List<m_BarangHJ> baranghj = query.getResultList();
		this.total = baranghj.size();
		baranghj = this.getData(page, limit);
		
		return baranghj;
	}

	private List<m_BarangHJ> getData(int page, int limit) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
    	Query<m_BarangHJ> query = current.createQuery("from m_BarangHJ", m_BarangHJ.class).setFirstResult((page-1)*limit).setMaxResults(limit);
        List<m_BarangHJ> Result = query.getResultList();

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
	public void baranghjStore(m_BarangHJ baranghjModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.save(baranghjModel);
		
	}
	
	@Override
	public m_BarangHJ getbarangHJ(int IDBarangHJ) {
		Session current = sessionFactory.getCurrentSession();
		
		m_BarangHJ result = current.get(m_BarangHJ.class, IDBarangHJ);
		
		return result;
	}
	
	@Override
	public void barangHJUpdate(m_BarangHJ baranghjModel) {
		
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(baranghjModel);
		
	}
	
	@Override
	public void BarangHJDelete(m_BarangHJ baranghjModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(baranghjModel);
	}
}
