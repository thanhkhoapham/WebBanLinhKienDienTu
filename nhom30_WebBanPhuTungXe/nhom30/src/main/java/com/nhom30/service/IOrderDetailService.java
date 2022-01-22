package com.nhom30.service;

import java.util.List;

import com.nhom30.dto.ChiTietHoaDonDto;
import com.nhom30.entity.ChiTietHoaDon;

public interface IOrderDetailService {
	List<ChiTietHoaDonDto> getAll();
	void deleteChiTietHoaDon(int id);
	void saveChiTiet(ChiTietHoaDon chiTietHoaDon);
}
