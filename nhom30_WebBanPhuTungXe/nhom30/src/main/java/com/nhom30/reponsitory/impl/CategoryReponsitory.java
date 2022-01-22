package com.nhom30.reponsitory.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nhom30.entity.LoaiSp;
import com.nhom30.reponsitory.ICategoryRepository;

@Repository
@Transactional
public class CategoryReponsitory implements ICategoryRepository {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<LoaiSp> getAll() {

		Session session = sessionFactory.getCurrentSession();
		Query<LoaiSp> query = session.createQuery("From LoaiSp", LoaiSp.class);
		return query.getResultList();
	}

	@Override
	public void addCategory(LoaiSp loaiSp) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(loaiSp);
	}

	@Override
	public List<LoaiSp> getAllLoaiSp(int sort, String direc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteLoaiSp(int id) {
		Session session = sessionFactory.getCurrentSession();
		LoaiSp loaiSp = session.find(LoaiSp.class, id);
		session.remove(loaiSp);
	}

	@Override
	public void updateLoaiSp(LoaiSp loaiSp) {
		Session session = sessionFactory.getCurrentSession();
		LoaiSp sp = session.find(LoaiSp.class, loaiSp.getMaLoaiSp());
		sp.setMaLoaiSp(loaiSp.getMaLoaiSp());
		sp.setTenLoaiSp(loaiSp.getTenLoaiSp());
		session.saveOrUpdate(sp);
	}

	@Override
	public LoaiSp getLoaiSp(int id) {
		return sessionFactory.getCurrentSession().find(LoaiSp.class, id);
	}

	@Override
	public List<LoaiSp> searchLoaiSp(String search) {
		// TODO Auto-generated method stub
		return null;
	}

}
