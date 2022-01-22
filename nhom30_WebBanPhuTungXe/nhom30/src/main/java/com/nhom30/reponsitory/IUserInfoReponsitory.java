package com.nhom30.reponsitory;

import com.nhom30.entity.NguoiDung;

public interface IUserInfoReponsitory {
	 NguoiDung findUserInfo(String email);
	 String getUserRole(String email);
	 
}
