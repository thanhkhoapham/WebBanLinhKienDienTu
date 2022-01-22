package com.nhom30.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom30.dto.HoaDonDto;
import com.nhom30.entity.HoaDon;
import com.nhom30.reponsitory.IOrderResponsitory;
import com.nhom30.service.IOrderService;

@Service
@Transactional
public class OrderService implements IOrderService {
	@Autowired
	private IOrderResponsitory orderResponsitory;

	@Override
	public List<HoaDonDto> getAll() {
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<HoaDonDto> list = new ArrayList<HoaDonDto>();
		for (HoaDon hoaDon : orderResponsitory.getAll()) {
			list.add(new HoaDonDto(hoaDon.getMaHd(), (hoaDon.getNgayLapHoaDon()), hoaDon.getNoiNhanHang(),
					hoaDon.getMaKh()));
		}
		return list;
	}

	@Override
	public void deleteHoaDon(int id) {
		orderResponsitory.deleteHoaDon(id);

	}

	@Override
	public int getIdLonNhat() {
		return orderResponsitory.getLonNhon();

	}

	@Override
	public void addHoaDon(HoaDon hd) {
		orderResponsitory.addHoaDon(hd);

	}

}
