package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.t_Opname;

@Repository
public class OpnameAction implements OpnameDAO{
	@Autowired
	private SessionFactory sessionFactory;
	private int total;
	
	@Override
	public List<t_Opname> getOpnames() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<t_Opname> query = current.createQuery("from t_Opname", t_Opname.class);
		List<t_Opname> result = query.getResultList();
		
		return result;
	}

	@Override
	public List<t_Opname> getOpnames(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<t_Opname> query = current.createQuery("from t_Opname", t_Opname.class);
		List<t_Opname> result = query.getResultList();
		this.total = result.size();
		result = this.getData(page, limit);
		
		return result;
	}
	
	private List<t_Opname> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
    	Query<t_Opname> query = current.createQuery("from t_Opname", t_Opname.class).setFirstResult((page-1)*limit).setMaxResults(limit);
        List<t_Opname> Result = query.getResultList();

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
	public t_Opname getOpname(int opnameId) {
		Session current = sessionFactory.	getCurrentSession();
		
		t_Opname result = current.get(t_Opname.class, opnameId);
		
		return result;
	}

	@Override
	public int opnameStore(t_Opname opnameModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.save(opnameModel);
		current.flush();
		
		return opnameModel.getOpname_id();
	}

	@Override
	public int opnameUpdate(t_Opname opnameModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(opnameModel);
		current.flush();
		
		return opnameModel.getOpname_id();
	}

	@Override
	public int opnameDelete(t_Opname opnameModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(opnameModel);
		current.flush();
		
		return opnameModel.getOpname_id();
	}

}
