package com.nhom30.service;

import java.util.List;

import com.nhom30.dto.HoaDonDto;
import com.nhom30.entity.HoaDon;

public interface IOrderService {
	List<HoaDonDto> getAll();
	void deleteHoaDon(int id);
	int getIdLonNhat();
	void addHoaDon(HoaDon hd);
}
