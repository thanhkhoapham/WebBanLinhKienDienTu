package com.nhom30.reponsitory;

import java.util.List;

import com.nhom30.entity.SanPham;

public interface IProductReponsitory {
	List<SanPham> getAll();

	void addProduct(SanPham sanPham);

	void deleteSp(int id);

	SanPham getSanPham(int id);

	int getSanPhamByTen(String ten);

	void updateSp(SanPham sp);
}
