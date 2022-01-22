package com.nhom30.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom30.dto.NguoiDungDto;
import com.nhom30.entity.NguoiDung;
import com.nhom30.reponsitory.IUserResponsitory;
import com.nhom30.service.IUserService;

@Service
public class UserService implements IUserService {
	@Autowired
	private IUserResponsitory userReponsitory;

//this.role = role;
//	this.enabled = enabled;
	@Override
	public void dangKi(NguoiDungDto nguoiDungDto) {
		//nguoidungDto.getPassword() = '123'
		String hased = BCrypt.hashpw(nguoiDungDto.getMatKhau(), BCrypt.gensalt());
		//hased = '@314124123Sdeqwdádf23e12e1eqdsasd'
		NguoiDung nguoiDung = new NguoiDung(nguoiDungDto.getHoTenKh(), nguoiDungDto.getDiaChi(),
				nguoiDungDto.getSoDienThoai(), nguoiDungDto.getGioiTinh(), nguoiDungDto.getEmail(),
				nguoiDungDto.getNgaySinh(), "USER", 1, hased);
		userReponsitory.luuNguoiDung(nguoiDung);

	}

	@Override
	public void addNguoiDung(NguoiDungDto dto) {
//		String hased = BCrypt.hashpw(dto.getMatKhau(), BCrypt.gensalt());
//		NguoiDung nguoiDung = new NguoiDung(dto.getHoTenKh(), dto.getDiaChi(), dto.getSoDienThoai(), dto.getGioiTinh(),
//				dto.getEmail(), dto.getNgaySinh(), "USER", 1, hased);
//		userReponsitory.luuNguoiDung(nguoiDung);
	}

	@Override
	public List<NguoiDungDto> getAll() {
		List<NguoiDungDto> listDtos = new ArrayList<NguoiDungDto>();

		for (NguoiDung nd : userReponsitory.getAll()) {
			String hased = BCrypt.hashpw(nd.getMatKhau(), BCrypt.gensalt());
			listDtos.add(new NguoiDungDto(nd.getMaKh(), nd.getHoTenKh(), nd.getDiaChi(), nd.getSoDienThoai(),
					nd.getGioiTinh(), nd.getEmail(), nd.getNgaySinh(), "USER", 1, hased));
		}
		return listDtos;
	}

	@Override
	public void deleteNguoiDung(int id) {
		userReponsitory.deleteNguoiDung(id);

	}

	@Override
	public NguoiDung getNguoiDung(int id) {
		return userReponsitory.getNguoiDung(id);
	}

	@Override
	public void updateNguoiDung(NguoiDungDto dto) {
		String hased = BCrypt.hashpw(dto.getMatKhau(), BCrypt.gensalt());
		NguoiDung nguoiDung = new NguoiDung(dto.getHoTenKh(), dto.getDiaChi(), dto.getSoDienThoai(), dto.getGioiTinh(),
				dto.getEmail(), dto.getNgaySinh(), "USER", 1, hased);
		userReponsitory.updateNguoiDung(nguoiDung);
	}

}
