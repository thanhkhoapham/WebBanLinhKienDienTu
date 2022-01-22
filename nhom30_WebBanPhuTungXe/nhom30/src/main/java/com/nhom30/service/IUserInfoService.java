package com.nhom30.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface IUserInfoService {
	UserDetails loadUserByUsername(String email);
}
