package com.nhom30.dto;

import java.util.Date;

public class HoaDonDto {
	private int maHd;

	private Date ngayLapHoaDon;

	private String noiNhanHang;

	private int maKh;

	public int getMaHd() {
		return maHd;
	}

	public void setMaHd(int maHd) {
		this.maHd = maHd;
	}

	public Date getNgayLapHoaDon() {
		return ngayLapHoaDon;
	}

	public HoaDonDto(int maHd) {
		super();
		this.maHd = maHd;
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

	public HoaDonDto(int maHd, Date ngayLapHoaDon, String noiNhanHang, int maKh) {
		super();
		this.maHd = maHd;
		this.ngayLapHoaDon = ngayLapHoaDon;
		this.noiNhanHang = noiNhanHang;
		this.maKh = maKh;
	}

	public HoaDonDto() {
		super();
	}

	public HoaDonDto(Date ngayLapHoaDon, String noiNhanHang, int maKh) {
		super();
		this.ngayLapHoaDon = ngayLapHoaDon;
		this.noiNhanHang = noiNhanHang;
		this.maKh = maKh;
	}

	@Override
	public String toString() {
		return "HoaDonDto [maHd=" + maHd + ", ngayLapHoaDon=" + ngayLapHoaDon + ", noiNhanHang=" + noiNhanHang
				+ ", maKh=" + maKh + "]";
	}

}
