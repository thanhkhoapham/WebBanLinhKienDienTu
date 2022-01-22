package com.nhom30.reponsitory;

import java.util.List;

import com.nhom30.entity.ChiTietHoaDon;

public interface IOrderDetailResponsitory {
	List<ChiTietHoaDon> getAll();

	void deleteChiTietHoaDon(int id);
	void addChiTiet(ChiTietHoaDon chiTietHoaDon);
}
