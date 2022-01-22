package com.nhom30.gioHang;

public class Item {
	private int id;
	private String tenSanpham;
	private String urlHinhAnh;
	private double donGia;
	private int soLuong;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenSanpham() {
		return tenSanpham;
	}

	public void setTenSanpham(String tenSanpham) {
		this.tenSanpham = tenSanpham;
	}

	public String getUrlHinhAnh() {
		return urlHinhAnh;
	}

	public void setUrlHinhAnh(String urlHinhAnh) {
		this.urlHinhAnh = urlHinhAnh;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(Double donGia) {
		this.donGia = donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public Item(int id, String tenSanpham, String urlHinhAnh, Double donGia, int soLuong) { 
		this.id = id;
		this.tenSanpham = tenSanpham;
		this.urlHinhAnh = urlHinhAnh;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}

	public Item() { 
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", tenSanpham=" + tenSanpham + ", urlHinhAnh=" + urlHinhAnh + ", donGia=" + donGia
				+ ", soLuong=" + soLuong + ", soLuongConTrongKho=";
	}

}
