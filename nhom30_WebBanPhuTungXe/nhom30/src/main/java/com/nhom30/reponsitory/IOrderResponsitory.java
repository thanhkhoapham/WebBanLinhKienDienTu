package com.nhom30.reponsitory;

import java.util.List;

import com.nhom30.entity.HoaDon;

public interface IOrderResponsitory {
	List<HoaDon> getAll();

	void deleteHoaDon(int id);
	int getLonNhon();
	void addHoaDon(HoaDon hoaDon);
	HoaDon getById(int id);
	
	
}
