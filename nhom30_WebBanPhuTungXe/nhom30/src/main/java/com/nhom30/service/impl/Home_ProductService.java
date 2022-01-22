package com.nhom30.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom30.dto.SanPhamDto;
import com.nhom30.entity.SanPham;
import com.nhom30.reponsitory.IHome_ProductReponsitory;
import com.nhom30.service.IHome_ProductService;

@Service
public class Home_ProductService implements IHome_ProductService {
	@Autowired
	private IHome_ProductReponsitory productReponsitory;

	@Override
	public List<SanPhamDto> getAllSP() {
		List<SanPhamDto> dto = new ArrayList<SanPhamDto>();
		for (SanPham sp : productReponsitory.getAllProduct()) {
			dto.add(new SanPhamDto(sp.getMaSp(), sp.getTenSp(), sp.getMaLoaiSp(), sp.getGiaGoc(),
					sp.getThuongHieu(), sp.getXuatXu(), sp.getMoTa(), sp.getHinhAnh()));
		}
		return dto;
	}

}
