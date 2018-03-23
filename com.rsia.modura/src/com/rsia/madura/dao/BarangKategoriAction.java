package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.m_BarangKategori;

@Repository
public class BarangKategoriAction implements BarangKategoriDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public int total;
	
	@Override
	public List<m_BarangKategori> getKategoris() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<m_BarangKategori> query = current.createQuery("from m_BarangKategori", m_BarangKategori.class);
		
		List<m_BarangKategori> kategori = query.getResultList();
		return kategori;
	}

	@Override
	public List<m_BarangKategori> getKategoris(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<m_BarangKategori> query = current.createQuery("from m_BarangKategori", m_BarangKategori.class);
		List<m_BarangKategori> kategori = query.getResultList();
		this.total = kategori.size();
		kategori = this.getData(page, limit);
		
		return kategori;
	}

	private List<m_BarangKategori> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
    	Query<m_BarangKategori> query = current.createQuery("from m_BarangKategori", m_BarangKategori.class).setFirstResult((page-1)*limit).setMaxResults(limit);
        List<m_BarangKategori> Result = query.getResultList();

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
	public m_BarangKategori getBarangKategori(int kategoriId) {
		Session current = sessionFactory.getCurrentSession();
		
		m_BarangKategori result = current.get(m_BarangKategori.class, kategoriId);
		
		return result;
	}

	@Override
	public void kategoriStore(m_BarangKategori kategoriModel) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		
		current.save(kategoriModel);
	}

	@Override
	public void kategoriUpdate(m_BarangKategori kategoriModel) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(kategoriModel);
	}

	@Override
	public void kategoriDelete(m_BarangKategori kategoriModel) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(kategoriModel);
	}

}
