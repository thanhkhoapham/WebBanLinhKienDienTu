package com.nhom30.dto;

public class SanPhamDto {

	private int maSp;

	private String tenSp;

	private int maLoaiSp;

	private double giaGoc;

	private String thuongHieu;

	private String xuatXu;

	private String moTa;

	private String hinhAnh;

	public int getMaSp() {
		return maSp;
	}

	public SanPhamDto(int maSp) {
		super();
		this.maSp = maSp;
	}

	public SanPhamDto(String tenSp) {
		super();
		this.tenSp = tenSp;
	}

	public SanPhamDto(int maSp, String tenSp) {
		super();
		this.maSp = maSp;
		this.tenSp = tenSp;
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

	public SanPhamDto(int maSp, String tenSp, int maLoaiSp, double giaGoc, String thuongHieu, String xuatXu,
			String moTa, String hinhAnh) {
		super();
		this.maSp = maSp;
		this.tenSp = tenSp;
		this.maLoaiSp = maLoaiSp;
		this.giaGoc = giaGoc;
		this.thuongHieu = thuongHieu;
		this.xuatXu = xuatXu;
		this.moTa = moTa;
		this.hinhAnh = hinhAnh;
	}

	public SanPhamDto() {
		super();
	}

	@Override
	public String toString() {
		return "SanPhamDto [maSp=" + maSp + ", tenSp=" + tenSp + ", maLoaiSp=" + maLoaiSp + ", giaGoc=" + giaGoc
				+ ", thuongHieu=" + thuongHieu + ", xuatXu=" + xuatXu + ", moTa=" + moTa + ", hinhAnh=" + hinhAnh + "]";
	}

}
