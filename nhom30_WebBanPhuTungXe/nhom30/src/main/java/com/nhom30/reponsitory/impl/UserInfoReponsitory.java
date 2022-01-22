package com.nhom30.reponsitory.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nhom30.entity.NguoiDung;
import com.nhom30.reponsitory.IUserInfoReponsitory;

@Repository
@Transactional
public class UserInfoReponsitory implements IUserInfoReponsitory {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public NguoiDung findUserInfo(String email) {
		Session session = sessionFactory.getCurrentSession();
//		NguoiDung nguoiDung = session.find(NguoiDung.class, 1);
//		System.out.println(nguoiDung);
		Query<NguoiDung> query = session.createQuery("from NguoiDung where  email = '" + email + "'", NguoiDung.class);
		List<NguoiDung> result = query.getResultList();
		NguoiDung nguoiDung = null;
		for (NguoiDung nd : result) {
			return nd;

		}
//		System.out.println(nguoiDung);
		return nguoiDung;
	}

	@Override
	public String getUserRole(String email) {
		System.out.println("vo role");
		Session session = sessionFactory.getCurrentSession();
		Query<NguoiDung> query = session.createQuery("from NguoiDung where  email = '" + email + "'", NguoiDung.class);
		List<NguoiDung> result = query.getResultList();
		if (result.size() > 0) {
			System.out.println(result.get(0).getRole());
			return result.get(0).getRole();

		}
		System.out.println("ra role");
		return null;
	}

}
