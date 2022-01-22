package com.nhom30.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.nhom30.dto.UserInfo;
import com.nhom30.entity.NguoiDung;
import com.nhom30.reponsitory.IUserInfoReponsitory;

@Service
public class UserInfoService implements UserDetailsService {
	@Autowired
	private IUserInfoReponsitory userInfoRepository;

//spper(ussername,pass,ath)
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		NguoiDung nguoiDung = userInfoRepository.findUserInfo(email);
		System.out.println(nguoiDung);
		if (nguoiDung == null) {
			throw new UsernameNotFoundException("Email không tồn tại !!!");
		}
		String role = "";
		role = userInfoRepository.getUserRole(email);
		System.out.println(role);

		List<GrantedAuthority> listGrantedAuthorities = new ArrayList<GrantedAuthority>();
		if (!role.equalsIgnoreCase("")) {
			listGrantedAuthorities.add(new SimpleGrantedAuthority(role));
		}
		// userinfo là 1 lớp kế thừa user(spring security)
//		int id,
//		String ten, String diaChi, String soDt
		UserInfo userInfo = new UserInfo(email, nguoiDung.getMatKhau(), listGrantedAuthorities, nguoiDung.getMaKh(),
				nguoiDung.getHoTenKh(), nguoiDung.getDiaChi(), nguoiDung.getSoDienThoai());

		return userInfo;
	}

}
