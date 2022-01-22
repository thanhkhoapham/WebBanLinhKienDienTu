package com.nhom30.dto;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
//principal
public class UserInfo extends User {
	private int id;
	private String ten;
	private String diaChi;
	private String soDt;
	private static final long serialVersionUID = 1L;

	public UserInfo(String username, String password, Collection<? extends GrantedAuthority> authorities,int id) {
		super(username, password, authorities);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserInfo(String username, String password, Collection<? extends GrantedAuthority> authorities, int id,
			String ten, String diaChi, String soDt) {
		super(username, password, authorities);
		this.id = id;
		this.ten = ten;
		this.diaChi = diaChi;
		this.soDt = soDt;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDt() {
		return soDt;
	}

	public void setSoDt(String soDt) {
		this.soDt = soDt;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
