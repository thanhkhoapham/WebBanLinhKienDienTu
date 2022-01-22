package com.nhom30.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "NguoiDung")
public class NguoiDung {
	@Id
	@Column(name = "maKh")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maKh;

	@Column(name = "hoTenKh")
	private String hoTenKh;

	@Column(name = "diaChi")
	private String diaChi;

	@Column(name = "soDienThoai")
	private String soDienThoai;

	@Column(name = "gioiTinh")
	private String gioiTinh;

	@Column(name = "email")
	private String email;

	@Column(name = "ngaySinh")
	private String ngaySinh;

	@Column(name = "role")
	private String role;
	
	@Column(name = "enabel")
	private int enabled;
	
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "Kh_maHd")
	private List<HoaDon> hoaDons;
	
	@Column(name = "matKhau")
	private String matKhau;

	
	public NguoiDung(int maKh, String hoTenKh, String diaChi, String soDienThoai, String gioiTinh, String email,
			String ngaySinh, String role, String matKhau) {
		super();
		this.maKh = maKh;
		this.hoTenKh = hoTenKh;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.gioiTinh = gioiTinh;
		this.email = email;
		this.ngaySinh = ngaySinh;
		this.role = role;
		this.matKhau = matKhau;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public NguoiDung() {
		super();
	}
	

	public int getMaKh() {
		return maKh;
	}


	public void setMaKh(int maKh) {
		this.maKh = maKh;
	}


	public int getEnabled() {
		return enabled;
	}


	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}


	public String getHoTenKh() {
		return hoTenKh;
	}


	public void setHoTenKh(String hoTenKh) {
		this.hoTenKh = hoTenKh;
	}


	public String getDiaChi() {
		return diaChi;
	}


	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}


	public String getSoDienThoai() {
		return soDienThoai;
	}


	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}


	public String getGioiTinh() {
		return gioiTinh;
	}


	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNgaySinh() {
		return ngaySinh;
	}


	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}


	public List<HoaDon> getHoaDons() {
		return hoaDons;
	}


	public void setHoaDons(List<HoaDon> hoaDons) {
		this.hoaDons = hoaDons;
	}


	public String getMatKhau() {
		return matKhau;
	}


	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}


	public NguoiDung(String hoTenKh, String diaChi, String soDienThoai, String gioiTinh, String email,
			String ngaySinh, String matKhau) {
		this.hoTenKh = hoTenKh;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.gioiTinh = gioiTinh;
		this.email = email;
		this.ngaySinh = ngaySinh;
		this.matKhau = matKhau;
	}


	@Override
	public String toString() {
		return "NguoiDung [maKh=" + maKh + ", hoTenKh=" + hoTenKh + ", diaChi=" + diaChi + ", soDienThoai="
				+ soDienThoai + ", gioiTinh=" + gioiTinh + ", email=" + email + ", ngaySinh=" + ngaySinh + ", matKhau="
				+ matKhau + "]";
	}


	public NguoiDung(String hoTenKh, String diaChi, String soDienThoai, String gioiTinh, String email, String ngaySinh,
			String role, int enabled, List<HoaDon> hoaDons, String matKhau) {
		super();
		this.hoTenKh = hoTenKh;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.gioiTinh = gioiTinh;
		this.email = email;
		this.ngaySinh = ngaySinh;
		this.role = role;
		this.enabled = enabled;
		this.hoaDons = hoaDons;
		this.matKhau = matKhau;
	}


	public NguoiDung(  String hoTenKh, String diaChi, String soDienThoai, String gioiTinh, String email,
			String ngaySinh, String role, int enabled, String matKhau) {
		super();
 
		this.hoTenKh = hoTenKh;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.gioiTinh = gioiTinh;
		this.email = email;
		this.ngaySinh = ngaySinh;
		this.role = role;
		this.enabled = enabled;
		this.matKhau = matKhau;
	}
	

}
