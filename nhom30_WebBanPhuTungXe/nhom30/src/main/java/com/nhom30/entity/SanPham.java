package com.nhom30.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SanPham")
public class SanPham {
	@Id
	@Column(name = "maSp")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maSp;

	@Column(name = "tenSp")
	private String tenSp;

	@Column(name = "maLoaiSp")
	private int maLoaiSp;

	@Column(name = "giaGoc")
	private double giaGoc;

	@Column(name = "thuongHieu")
	private String thuongHieu;

	@Column(name = "xuatXu")
	private String xuatXu;

	@Column(name = "moTa")
	private String moTa;

	@Column(name = "hinhAnh")
	private String hinhAnh;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "maLoaiSp", insertable = false, updatable = false)
	private LoaiSp loaiSp;

	public SanPham(int maSp) {
		super();
		this.maSp = maSp;
	}

	public SanPham(int maSp, String tenSp) {
		super();
		this.maSp = maSp;
		this.tenSp = tenSp;
	}

	public SanPham(String tenSp) {
		super();
		this.tenSp = tenSp;
	}

	public SanPham() {
		super();
	}

	public SanPham(String tenSp, int maLoaiSp, double giaGoc, String thuongHieu, String xuatXu, String moTa,
			String hinhAnh) {
		super();
		this.tenSp = tenSp;
		this.maLoaiSp = maLoaiSp;
		this.giaGoc = giaGoc;
		this.thuongHieu = thuongHieu;
		this.xuatXu = xuatXu;
		this.moTa = moTa;
		this.hinhAnh = hinhAnh;
	}

	public SanPham(int maSp, String tenSp, int maLoaiSp, double giaGoc, String thuongHieu, String xuatXu, String moTa,
			String hinhAnh, LoaiSp loaiSp) {
		super();
		this.maSp = maSp;
		this.tenSp = tenSp;
		this.maLoaiSp = maLoaiSp;
		this.giaGoc = giaGoc;
		this.thuongHieu = thuongHieu;
		this.xuatXu = xuatXu;
		this.moTa = moTa;
		this.hinhAnh = hinhAnh;
		this.loaiSp = loaiSp;
	}

	public int getMaSp() {
		return maSp;
	}

	public void setMaSp(int maSp) {
		this.maSp = maSp;
	}

	public String getTenSp() {
		return tenSp;
	}

	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}

	public int getMaLoaiSp() {
		return maLoaiSp;
	}

	public void setMaLoaiSp(int maLoaiSp) {
		this.maLoaiSp = maLoaiSp;
	}

	public double getGiaGoc() {
		return giaGoc;
	}

	public void setGiaGoc(double giaGoc) {
		this.giaGoc = giaGoc;
	}

	public String getThuongHieu() {
		return thuongHieu;
	}

	public void setThuongHieu(String thuongHieu) {
		this.thuongHieu = thuongHieu;
	}

	public String getXuatXu() {
		return xuatXu;
	}

	public void setXuatXu(String xuatXu) {
		this.xuatXu = xuatXu;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	public LoaiSp getLoaiSp() {
		return loaiSp;
	}

	public void setLoaiSp(LoaiSp loaiSp) {
		this.loaiSp = loaiSp;
	}

 
	@Override
	public String toString() {
		return "SanPham [maSp=" + maSp + ", tenSp=" + tenSp + ", maLoaiSp=" + maLoaiSp + ", giaGoc=" + giaGoc
				+ ", thuongHieu=" + thuongHieu + ", xuatXu=" + xuatXu + ", moTa=" + moTa + ", hinhAnh=" + hinhAnh
				+ ", loaiSp=" + loaiSp + "]";
	}

}
