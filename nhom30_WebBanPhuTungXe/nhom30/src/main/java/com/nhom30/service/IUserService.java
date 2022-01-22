package com.nhom30.service;

import java.util.List;

import com.nhom30.dto.NguoiDungDto;
import com.nhom30.entity.NguoiDung;

public interface IUserService {
	void dangKi(NguoiDungDto nguoiDungDto);

	void addNguoiDung(NguoiDungDto dto);

	List<NguoiDungDto> getAll();

	void deleteNguoiDung(int id);

	NguoiDung getNguoiDung(int id);

	void updateNguoiDung(NguoiDungDto dto);

}
