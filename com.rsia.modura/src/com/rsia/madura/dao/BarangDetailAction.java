package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.m_BarangDetail;;

@Repository
public class BarangDetailAction implements BarangDetailDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	public int total;
	
	@Override
	public List<m_BarangDetail> getBarangDetails() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<m_BarangDetail> barang = current.createQuery("from m_barangdet", m_BarangDetail.class);
		List<m_BarangDetail> result = barang.getResultList();
		
		return result;
	}
	
	@Override
	public List<m_BarangDetail> getBarangDetails(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<m_BarangDetail> query = current.createQuery("from m_barangdet", m_BarangDetail.class);
		List<m_BarangDetail> barangdetail = query.getResultList();
		this.total = barangdetail.size();
		barangdetail = this.getData(page, limit);
		
		return barangdetail;
	}

	private List<m_BarangDetail> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
    	Query<m_BarangDetail> query = current.createQuery("from m_barangdetail", m_BarangDetail.class).setFirstResult((page-1)*limit).setMaxResults(limit);
        List<m_BarangDetail> Result = query.getResultList();

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
	public m_BarangDetail getBarangDetail(int barangdet_id) {
		Session current = sessionFactory.getCurrentSession();
		
		m_BarangDetail result = current.get(m_BarangDetail.class, barangdet_id);
		
		return result;
	}
	
	@Override
	public void barangdetailStore(m_BarangDetail barangdetailModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.save(barangdetailModel);
		
	}

	@Override
	public void barangdetailUpdate(m_BarangDetail barangdetailModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(barangdetailModel);
		
	}

	@Override
	public void barangdetailDelete(m_BarangDetail barangdetailModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(barangdetailModel);
		
	}

}
