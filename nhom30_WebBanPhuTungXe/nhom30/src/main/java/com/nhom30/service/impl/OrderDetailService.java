package com.nhom30.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom30.dto.ChiTietHoaDonDto;
import com.nhom30.entity.ChiTietHoaDon;
import com.nhom30.entity.HoaDon;
import com.nhom30.entity.SanPham;
import com.nhom30.reponsitory.IOrderDetailResponsitory;
import com.nhom30.service.IOrderDetailService;

@Service
@Transactional
public class OrderDetailService implements IOrderDetailService {
	@Autowired
	private IOrderDetailResponsitory orderdetailResponsitory;

	@Override
	public List<ChiTietHoaDonDto> getAll() {
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<ChiTietHoaDonDto> list = new ArrayList<ChiTietHoaDonDto>();
		for (ChiTietHoaDon ct : orderdetailResponsitory.getAll()) {
			list.add(new ChiTietHoaDonDto(new SanPham(ct.getSanPham().getMaSp()), new HoaDon(ct.getHoaDon().getMaHd()),
					ct.getSoLuong(), ct.getDonGia()));
		}
		return list;
	}

	@Override
	public void deleteChiTietHoaDon(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveChiTiet(ChiTietHoaDon chiTietHoaDon) {
		orderdetailResponsitory.addChiTiet(chiTietHoaDon);

	}

}
