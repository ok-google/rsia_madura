package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.t_ReturJual;

@Repository
public class ReturJualAction implements ReturJualDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private int total;
	
	@Override
	public List<t_ReturJual> getReturJuals() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<t_ReturJual> query = current.createQuery("from t_ReturJual", t_ReturJual.class);
		List<t_ReturJual> result = query.getResultList();
		
		return result;
	}

	@Override
	public List<t_ReturJual> getReturJuals(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<t_ReturJual> query = current.createQuery("from t_ReturJual", t_ReturJual.class);
		List<t_ReturJual> result = query.getResultList();
		this.total = result.size();
		result = this.getData(page, limit);
		
		return result;
	}
	
	private List<t_ReturJual> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
    	Query<t_ReturJual> query = current.createQuery("from t_ReturJual", t_ReturJual.class).setFirstResult((page-1)*limit).setMaxResults(limit);
        List<t_ReturJual> Result = query.getResultList();

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
	public t_ReturJual getReturJual(int returJualId) {
		Session current = sessionFactory.	getCurrentSession();
		
		t_ReturJual result = current.get(t_ReturJual.class, returJualId);
		
		return result;
	}

	@Override
	public int returJualStore(t_ReturJual returJualModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.save(returJualModel);
		current.flush();
		
		return returJualModel.getReturJual_id();
	}

	@Override
	public int returJualUpdate(t_ReturJual returJualModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(returJualModel);
		current.flush();
		
		return returJualModel.getReturJual_id();
	}

	@Override
	public int returJualDelete(t_ReturJual returJualModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(returJualModel);
		current.flush();
		
		return returJualModel.getReturJual_id();
	}

}
