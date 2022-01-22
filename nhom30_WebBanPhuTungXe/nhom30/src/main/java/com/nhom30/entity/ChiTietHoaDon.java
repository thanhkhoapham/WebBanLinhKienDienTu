package com.nhom30.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

/**
 * @EmbeddedId OrderDeatilsKey id;
 * 
 * @ManyToOne(cascade = CascadeType.ALL, fetch =
 *                    FetchType.LAZY) @MapsId("productID")
 * @JoinColumn(name = "product_ID") Product product;
 * 
 * @ManyToOne(cascade = CascadeType.ALL, fetch =
 *                    FetchType.LAZY) @MapsId("orderID")
 * @JoinColumn(name = "order_ID", insertable = false, updatable = false) Order
 *                  order;
 * 
 */
@Entity
@Table(name = "ChiTietHoaDon")
public class ChiTietHoaDon {
	@EmbeddedId
	ChiTietHoaDon_PK id;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@MapsId("maSp")
	@JoinColumn(name = "sanPham_id")
	private SanPham sanPham;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@MapsId("maHd")
	@JoinColumn(name = "hoaDon_id", insertable = false, updatable = false)
	private HoaDon hoaDon;

	@Column(name = "soLuong")
	private int soLuong;

	@Column(name = "donGia")
	private double donGia;

	public ChiTietHoaDon() {
		super();
	}

	public ChiTietHoaDon_PK getId() {
		return id;
	}

	public void setId(ChiTietHoaDon_PK id) {
		this.id = id;
	}

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

	public ChiTietHoaDon(SanPham sanPham, HoaDon hoaDon, int soLuong, double donGia) {
		super();
		this.sanPham = sanPham;
		this.hoaDon = hoaDon;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}

	@Override
	public String toString() {
		return "ChiTietHoaDon [id=" + id + ", sanPham=" + sanPham + ", hoaDon=" + hoaDon + ", soLuong=" + soLuong
				+ ", donGia=" + donGia + "]";
	}

	public ChiTietHoaDon(ChiTietHoaDon_PK id, SanPham sanPham, HoaDon hoaDon, int soLuong, double donGia) {
		this.id = id;
		this.sanPham = sanPham;
		this.hoaDon = hoaDon;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}

	 

	public ChiTietHoaDon(ChiTietHoaDon_PK id, int soLuong, double donGia) {
		super();
		this.id = id;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}

}
