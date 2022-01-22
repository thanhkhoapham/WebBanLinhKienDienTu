package com.nhom30.reponsitory.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nhom30.entity.NguoiDung;
import com.nhom30.reponsitory.IUserResponsitory;

@Repository
@Transactional
public class UserReponsitory implements IUserResponsitory {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void luuNguoiDung(NguoiDung nguoiDung) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(nguoiDung);
	}

	@Override
	public void addNguoiDung(NguoiDung nguoiDung) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(nguoiDung);
	}

	@Override
	public List<NguoiDung> getAll() {
		Session session = sessionFactory.getCurrentSession();
		Query<NguoiDung> query = session.createQuery("From NguoiDung", NguoiDung.class);
		return query.getResultList();
	}

	@Override
	public void deleteNguoiDung(int id) {
		Session session = sessionFactory.getCurrentSession();
		NguoiDung nguoiDung = session.find(NguoiDung.class, id);
		session.remove(nguoiDung);

	}

	@Override
	public NguoiDung getNguoiDung(int id) {
		return sessionFactory.getCurrentSession().find(NguoiDung.class, id);
	}

	@Override
	public void updateNguoiDung(NguoiDung nguoiDung) {
		Session session = sessionFactory.getCurrentSession();
		NguoiDung nguoiDung2 = session.find(NguoiDung.class, nguoiDung.getMaKh());
		nguoiDung2.setMaKh(nguoiDung.getMaKh());
		nguoiDung2.setDiaChi(nguoiDung.getDiaChi());
		nguoiDung2.setEmail(nguoiDung.getEmail());
		nguoiDung2.setEnabled(nguoiDung.getEnabled());
		nguoiDung2.setGioiTinh(nguoiDung.getGioiTinh());
		nguoiDung2.setHoTenKh(nguoiDung.getHoTenKh());
		nguoiDung2.setMatKhau(nguoiDung.getMatKhau());
		nguoiDung2.setNgaySinh(nguoiDung.getMatKhau());
		nguoiDung2.setRole(nguoiDung.getMatKhau());
		nguoiDung2.setSoDienThoai(nguoiDung.getSoDienThoai());
		session.saveOrUpdate(nguoiDung2);
	}

}
