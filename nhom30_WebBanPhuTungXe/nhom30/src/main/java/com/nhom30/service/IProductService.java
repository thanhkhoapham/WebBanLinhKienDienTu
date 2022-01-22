package com.nhom30.service;

import java.util.List;

import com.nhom30.dto.SanPhamDto;
import com.nhom30.entity.SanPham;

public interface IProductService {
	List<SanPhamDto> getAll();

	void addProduct(SanPhamDto dto);

	void deleteProduct(int id);

	SanPham getSanPham(int id);

	int getSanPhamByTen(String ten);

	void updateSp(SanPhamDto dto);
}
