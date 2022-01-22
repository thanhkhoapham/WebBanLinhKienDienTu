package com.nhom30.reponsitory.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nhom30.entity.ChiTietHoaDon;
import com.nhom30.reponsitory.IOrderDetailResponsitory;

@Repository
@Transactional
public class OrderDetailReponsitory implements IOrderDetailResponsitory {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<ChiTietHoaDon> getAll() {
		Session session = sessionFactory.getCurrentSession();
		Query<ChiTietHoaDon> query = session.createQuery("From ChiTietHoaDon", ChiTietHoaDon.class);
		return query.getResultList();
	}

	@Override
	public void deleteChiTietHoaDon(int id) {
		Session session = sessionFactory.getCurrentSession();
		ChiTietHoaDon chiTietHoaDon = session.find(ChiTietHoaDon.class, id);
		session.remove(chiTietHoaDon);
	}

	@Override
	public void addChiTiet(ChiTietHoaDon chiTietHoaDon) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(chiTietHoaDon);
		
	}

}
