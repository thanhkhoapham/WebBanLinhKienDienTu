package com.nhom30.reponsitory;

import java.util.List;

import com.nhom30.entity.NguoiDung;

public interface IUserResponsitory {
	List<NguoiDung> getAll();

	void luuNguoiDung(NguoiDung nguoiDung);

	void addNguoiDung(NguoiDung nguoiDung);

	void deleteNguoiDung(int id);

	NguoiDung getNguoiDung(int id);

	void updateNguoiDung(NguoiDung nguoiDung);
}
