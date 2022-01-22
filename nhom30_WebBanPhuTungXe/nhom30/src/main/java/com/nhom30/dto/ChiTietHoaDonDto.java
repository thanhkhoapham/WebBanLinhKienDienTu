package com.nhom30.dto;

import com.nhom30.entity.HoaDon;
import com.nhom30.entity.SanPham;

public class ChiTietHoaDonDto {
	private SanPham sanPham;

	private HoaDon hoaDon;

	private int soLuong;

	private double donGia;

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	public HoaDon getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public ChiTietHoaDonDto(SanPham sanPham, HoaDon hoaDon, int soLuong, double donGia) {
		super();
		this.sanPham = sanPham;
		this.hoaDon = hoaDon;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}

	public ChiTietHoaDonDto() {
		super();
	}

	@Override
	public String toString() {
		return "ChiTietHoaDonDto [sanPham=" + sanPham + ", hoaDon=" + hoaDon + ", soLuong=" + soLuong + ", donGia="
				+ donGia + "]";
	}

}
