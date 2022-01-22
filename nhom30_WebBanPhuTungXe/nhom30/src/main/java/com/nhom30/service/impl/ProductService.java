package com.nhom30.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom30.dto.SanPhamDto;
import com.nhom30.entity.LoaiSp;
import com.nhom30.entity.SanPham;
import com.nhom30.reponsitory.IProductReponsitory;
import com.nhom30.service.IProductService;

@Service
@Transactional
public class ProductService implements IProductService {

	@Autowired
	private IProductReponsitory productResponsitory;

	@Override
	public List<SanPhamDto> getAll() {
		List<SanPhamDto> sanPhamDtos = new ArrayList<SanPhamDto>();
		for (SanPham sanpham : productResponsitory.getAll()) {
			sanPhamDtos.add(
					new SanPhamDto(sanpham.getMaSp(), sanpham.getTenSp(), sanpham.getMaLoaiSp(), sanpham.getGiaGoc(),
							sanpham.getThuongHieu(), sanpham.getXuatXu(), sanpham.getMoTa(), sanpham.getHinhAnh()));
		}
		return sanPhamDtos;
	}

	@Override
	public void addProduct(SanPhamDto dto) {
		SanPham sanPham = new SanPham(dto.getTenSp(), dto.getMaLoaiSp(), dto.getGiaGoc(), dto.getThuongHieu(),
				dto.getXuatXu(), dto.getMoTa(), dto.getHinhAnh());
		productResponsitory.addProduct(sanPham);
	}

	@Override
	public void deleteProduct(int id) {
		productResponsitory.deleteSp(id);

	}

	@Override
	public SanPham getSanPham(int id) {
		return productResponsitory.getSanPham(id);
	}

	@Override
	public int getSanPhamByTen(String ten) {
		return productResponsitory.getSanPhamByTen(ten);
	}

//	LoaiSp loaiSp = new LoaiSp(dto.getTenLoaiSp());
//	loaiSp.setMaLoaiSp(dto.getMaLoaiSp());
//	categoryReponsitory.updateLoaiSp(loaiSp);
	@Override
	public void updateSp(SanPhamDto dto) {
		SanPham sanPham = new SanPham(dto.getTenSp(), dto.getMaLoaiSp(), dto.getGiaGoc(), dto.getThuongHieu(),
				dto.getXuatXu(), dto.getMoTa(), dto.getHinhAnh());
		sanPham.setMaSp(dto.getMaSp());
		productResponsitory.updateSp(sanPham);
	}
}
