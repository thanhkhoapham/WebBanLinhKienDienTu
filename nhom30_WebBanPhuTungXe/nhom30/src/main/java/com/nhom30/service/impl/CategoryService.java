package com.nhom30.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom30.dto.LoaiSpDto;
import com.nhom30.entity.LoaiSp;
import com.nhom30.reponsitory.ICategoryRepository;
import com.nhom30.service.ICategoryService;

@Service
@Transactional
public class CategoryService implements ICategoryService {
	@Autowired
	private ICategoryRepository categoryReponsitory;

	@Override
	public List<LoaiSpDto> getAll() {
		List<LoaiSpDto> listDtos = new ArrayList<LoaiSpDto>();
		for (LoaiSp loaiSp : categoryReponsitory.getAll()) {
			listDtos.add(new LoaiSpDto(loaiSp.getMaLoaiSp(), loaiSp.getTenLoaiSp()));
		}
		return listDtos;
	}

	@Override
	public void addCategory(LoaiSpDto dto) {
		LoaiSp loaiSp = new LoaiSp(dto.getTenLoaiSp());
		categoryReponsitory.addCategory(loaiSp);
	}

	@Override
	public List<LoaiSp> getAllLoaiSp(int sort, String direc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteLoaiSp(int id) {
		categoryReponsitory.deleteLoaiSp(id);

	}

	@Override
	public LoaiSp getLoaiSp(int id) {
		return categoryReponsitory.getLoaiSp(id);
	}

	@Override
	public void updateLoaiSp(LoaiSpDto dto) {
		LoaiSp loaiSp = new LoaiSp(dto.getTenLoaiSp());
		loaiSp.setMaLoaiSp(dto.getMaLoaiSp());
		categoryReponsitory.updateLoaiSp(loaiSp);

	}

	@Override
	public List<LoaiSp> searchLoaiSp(String search) {
		// TODO Auto-generated method stub
		return null;
	}

}
