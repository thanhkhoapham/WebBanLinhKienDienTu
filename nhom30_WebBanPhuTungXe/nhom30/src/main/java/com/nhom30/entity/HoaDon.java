package com.nhom30.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HoaDon")
public class HoaDon {
	@Id
	@Column(name = "maHd")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maHd; 
	@Column(name = "ngayLapHoaDon")
	private Date ngayLapHoaDon;

	@Column(name = "noiNhanHang")
	private String noiNhanHang;

	@Column(name = "maKh")
	private int maKh;
//	private double tongTien;

	public HoaDon() {
		super();
	}

	@Override
	public String toString() {
		return "HoaDon [maHd=" + maHd + ", ngayLapHoaDon=" + ngayLapHoaDon + ", noiNhanHang=" + noiNhanHang + ", maKh="
				+ maKh + "]";
	}

	public HoaDon(Date ngayLapHoaDon, String noiNhanHang, int maKh) {
		super();
		this.ngayLapHoaDon = ngayLapHoaDon;
		this.noiNhanHang = noiNhanHang;
		this.maKh = maKh;
	}

	public HoaDon(int maHd) {
		super();
		this.maHd = maHd;
	}

	public HoaDon(int maHd, Date ngayLapHoaDon, String noiNhanHang, int maKh) {
		super();
		this.maHd = maHd;
		this.ngayLapHoaDon = ngayLapHoaDon;
		this.noiNhanHang = noiNhanHang;
		this.maKh = maKh;
	}

	public int getMaHd() {
		return maHd;
	}

	public void setMaHd(int maHd) {
		this.maHd = maHd;
	}

	public Date getNgayLapHoaDon() {
		return ngayLapHoaDon;
	}

	public void setNgayLapHoaDon(Date ngayLapHoaDon) {
		this.ngayLapHoaDon = ngayLapHoaDon;
	}

	public String getNoiNhanHang() {
		return noiNhanHang;
	}

	public void setNoiNhanHang(String noiNhanHang) {
		this.noiNhanHang = noiNhanHang;
	}

	public int getMaKh() {
		return maKh;
	}

	public void setMaKh(int maKh) {
		this.maKh = maKh;
	}

}
