package com.nhom30.dto;

public class LoaiSpDto {
	@Override
	public String toString() {
		return "LoaiSpDto [maLoaiSp=" + maLoaiSp + ", tenLoaiSp=" + tenLoaiSp + "]";
	}

	private int maLoaiSp;

	private String tenLoaiSp;

	public int getMaLoaiSp() {
		return maLoaiSp;
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

	public LoaiSpDto(int maLoaiSp, String tenLoaiSp) {
		this.maLoaiSp = maLoaiSp;
		this.tenLoaiSp = tenLoaiSp;
	}

	public LoaiSpDto(String tenLoaiSp) {
		super();
		this.tenLoaiSp = tenLoaiSp;
	}

	public LoaiSpDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
