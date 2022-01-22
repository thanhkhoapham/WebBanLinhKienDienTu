package com.nhom30.service;

import java.util.List;

import com.nhom30.dto.LoaiSpDto;
import com.nhom30.entity.LoaiSp;

public interface ICategoryService {
	List<LoaiSpDto> getAll();

	void addCategory(LoaiSpDto dto);

	List<LoaiSp> getAllLoaiSp(int sort, String direc);

	void deleteLoaiSp(int id);

	LoaiSp getLoaiSp(int id);

	void updateLoaiSp(LoaiSpDto dto);

	List<LoaiSp> searchLoaiSp(String search);
}
