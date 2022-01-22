package com.nhom30.controller.auth;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nhom30.dto.NguoiDungDto;
import com.nhom30.service.IUserService;

@Controller
@RequestMapping("/auth")
public class AuthController {
	@Autowired
	private IUserService userService;

	@GetMapping("login")
	public String formAuthLogin() {
		return "/auth/login";
	}

	@GetMapping("register")
	public String showFormDangKi() {
//		NguoiDungDto dto = new NguoiDungDto("tuan pham khoa", "Hoang hoa tham", "016685995", "nu",
//				"phamkhoa@gmail.com", "11/08/1999", "ADMIN", 1, "123456");
//		userService.dangKi(dto);
		return "/auth/register";
	}
	@PostMapping("register")
	public String dangKi(@ModelAttribute("nguoiDungDto") NguoiDungDto nguoiDungDto) {
//		NguoiDungDto dto = new NguoiDungDto("tuan pham khoa", "Hoang hoa tham", "016685995", "nu",
//				"phamtuankhai@gmail.com", "11/08/1999", "ADMIN", 1, "123456");
		userService.dangKi(nguoiDungDto);
		return "/auth/login";
	}
	@GetMapping("logout")
	public String logout(HttpServletRequest request, HttpServletResponse response) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication != null) {
			new SecurityContextLogoutHandler().logout(request, response, authentication);
		}
		return "redirect:/home";
	}
	

}
