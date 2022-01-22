package com.nhom30.dto;

public class NguoiDungDto {
	private int maKh;

	private String hoTenKh;

	private String diaChi;

	private String soDienThoai;

	private String gioiTinh;

	private String email;

	private String ngaySinh;

	private String role;

	private int enabled;

	private String matKhau;

	public int getMaKh() {
		return maKh;
	}

	public void setMaKh(int maKh) {
		this.maKh = maKh;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public NguoiDungDto(String hoTenKh, String diaChi, String soDienThoai, String gioiTinh, String email,
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

	public NguoiDungDto(int maKh, String hoTenKh, String diaChi, String soDienThoai, String gioiTinh, String email,
			String ngaySinh, String role, int enabled, String matKhau) {
		super();
		this.maKh = maKh;
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

	public NguoiDungDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "NguoiDungDto [maKh=" + maKh + ", hoTenKh=" + hoTenKh + ", diaChi=" + diaChi + ", soDienThoai="
				+ soDienThoai + ", gioiTinh=" + gioiTinh + ", email=" + email + ", ngaySinh=" + ngaySinh + ", role="
				+ role + ", enabled=" + enabled + ", matKhau=" + matKhau + "]";
	}

	 

}
