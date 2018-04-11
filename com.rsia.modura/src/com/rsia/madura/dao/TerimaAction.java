package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.t_Terima;

@Repository
public class TerimaAction implements TerimaDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private int total;
	
	@Override
	public List<t_Terima> getTerimas() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<t_Terima> query = current.createQuery("from t_Terima", t_Terima.class);
		List<t_Terima> result = query.getResultList();
		
		return result;
	}

	@Override
	public List<t_Terima> getTerimas(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<t_Terima> query = current.createQuery("from t_Terima", t_Terima.class);
		List<t_Terima> result = query.getResultList();
		this.total = result.size();
		result = this.getData(page, limit);
		
		return result;
	}
	
	private List<t_Terima> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
    	Query<t_Terima> query = current.createQuery("from t_Terima", t_Terima.class).setFirstResult((page-1)*limit).setMaxResults(limit);
        List<t_Terima> Result = query.getResultList();

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
	public t_Terima getTerima(int terimaId) {
		Session current = sessionFactory.	getCurrentSession();
		
		t_Terima result = current.get(t_Terima.class, terimaId);
		
		return result;
	}

	@Override
	public int terimaStore(t_Terima terimaModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.save(terimaModel);
		current.flush();
		
		return terimaModel.getTerima_id();
	}

	@Override
	public int terimaUpdate(t_Terima terimaModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(terimaModel);
		current.flush();
		
		return terimaModel.getTerima_id();
	}

	@Override
	public int terimaDelete(t_Terima terimaModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(terimaModel);
		current.flush();
		
		return terimaModel.getTerima_id();
	}

}
