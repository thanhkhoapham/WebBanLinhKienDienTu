package com.nhom30.reponsitory.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nhom30.entity.LoaiSp;
import com.nhom30.entity.SanPham;
import com.nhom30.reponsitory.IProductReponsitory;

@Repository
@Transactional
public class ProductReponsitory implements IProductReponsitory {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<SanPham> getAll() {
		Session session = sessionFactory.getCurrentSession();
		Query<SanPham> query = session.createQuery("From SanPham", SanPham.class);
		return query.getResultList();
	}

	@Override
	public void addProduct(SanPham sanPham) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(sanPham);

	}

	@Override
	public void deleteSp(int id) {
		Session session = sessionFactory.getCurrentSession();
		SanPham sp = session.find(SanPham.class, id);
		session.remove(sp);
	}

	@Override
	public SanPham getSanPham(int id) {
		return sessionFactory.getCurrentSession().find(SanPham.class, id);
	}

	@Override
	public int getSanPhamByTen(String ten) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "select S.maLoaiSp from LoaiSp S where tenLoaiSp = '" + ten + "'";
		int ma = session.createQuery(hql, Integer.class).getFirstResult();
		return ma;
	}

	@Override
	public void updateSp(SanPham sp) {
		Session session = sessionFactory.getCurrentSession();
		SanPham sp1 = session.find(SanPham.class, sp.getMaSp());
		sp1.setMaSp(sp.getMaSp());
		sp1.setGiaGoc(sp.getGiaGoc());
		sp1.setHinhAnh(sp.getHinhAnh());
		sp1.setMaLoaiSp(sp.getMaLoaiSp());
		sp1.setMoTa(sp.getMoTa());
		sp1.setThuongHieu(sp.getThuongHieu());
		sp1.setXuatXu(sp.getXuatXu());
		session.saveOrUpdate(sp1);

	}

}
