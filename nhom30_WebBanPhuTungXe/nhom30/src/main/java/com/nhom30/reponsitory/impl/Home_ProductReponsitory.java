package com.nhom30.reponsitory.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nhom30.entity.SanPham;
import com.nhom30.reponsitory.IHome_ProductReponsitory;

@Repository
@Transactional
public class Home_ProductReponsitory implements IHome_ProductReponsitory {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<SanPham> getAllProduct() {
		Session session = sessionFactory.getCurrentSession();
		Query<SanPham> query = session.createQuery("From SanPham", SanPham.class);
		return query.getResultList();
	}

}
