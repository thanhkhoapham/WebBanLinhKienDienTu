package com.nhom30.reponsitory.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nhom30.entity.HoaDon;
import com.nhom30.reponsitory.IOrderResponsitory;

@Repository
@Transactional
public class OrderReponsitory implements IOrderResponsitory {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<HoaDon> getAll() {

		Session session = sessionFactory.getCurrentSession();
		Query<HoaDon> query = session.createQuery("From HoaDon", HoaDon.class);
		return query.getResultList();
	}

	@Override
	public void deleteHoaDon(int id) {
		Session session = sessionFactory.getCurrentSession();
		HoaDon hd = session.find(HoaDon.class, id);
		session.remove(hd);
	}

	@Override
	public int getLonNhon() {
		Session session = sessionFactory.getCurrentSession();
		List<HoaDon> list = session.createNativeQuery("select top 1 *from HoaDon order by maHd desc ", HoaDon.class)
				.getResultList();
		return list.get(0).getMaHd();
	}

	@Override
	public void addHoaDon(HoaDon hoaDon) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(hoaDon);

	}

	@Override
	public HoaDon getById(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.find(HoaDon.class, id);
	}

}
