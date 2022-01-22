package com.nhom30.reponsitory;

import java.util.List;

import com.nhom30.entity.LoaiSp;

public interface ICategoryRepository {
	List<LoaiSp> getAll();

	void addCategory(LoaiSp loaiSp);

	List<LoaiSp> getAllLoaiSp(int sort, String direc);

	void deleteLoaiSp(int id);

	LoaiSp getLoaiSp(int id);

	void updateLoaiSp(LoaiSp loaiSp);

	List<LoaiSp> searchLoaiSp(String search);
}
