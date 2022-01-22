package com.nhom30.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "LoaiSp")
public class LoaiSp {
	@Id
	@Column(name = "maLoaiSp")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maLoaiSp;

	@Column(name = "tenLoaiSp")
	private String tenLoaiSp;

	@OneToMany(mappedBy = "loaiSp", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<SanPham> sanPhams;

	public LoaiSp() {
		super();
	}

	public int getMaLoaiSp() {
		return maLoaiSp;
	}

	public LoaiSp(int maLoaiSp) {
		super();
		this.maLoaiSp = maLoaiSp;
	}

	public void setMaLoaiSp(int maLoaiSp) {
		this.maLoaiSp = maLoaiSp;
	}

	public String getTenLoaiSp() {
		return tenLoaiSp;
	}

	public void setTenLoaiSp(String tenLoaiSp) {
		this.tenLoaiSp = tenLoaiSp;
	}

	public List<SanPham> getSanPhams() {
		return sanPhams;
	}

	public void setSanPhams(List<SanPham> sanPhams) {
		this.sanPhams = sanPhams;
	}

	public LoaiSp(String tenLoaiSp) {
		super();
		this.tenLoaiSp = tenLoaiSp;
	}

	public LoaiSp(int maLoaiSp, String tenLoaiSp, List<SanPham> sanPhams) {
		super();
		this.maLoaiSp = maLoaiSp;
		this.tenLoaiSp = tenLoaiSp;
		this.sanPhams = sanPhams;
	}

	public LoaiSp(int maLoaiSp, String tenLoaiSp) {
		this.maLoaiSp = maLoaiSp;
		this.tenLoaiSp = tenLoaiSp;
	}

	@Override
	public String toString() {
		return "LoaiSp [maLoaiSp=" + maLoaiSp + ", tenLoaiSp=" + tenLoaiSp + "]";
	}

}
