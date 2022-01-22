package com.nhom30.controller.home;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nhom30.entity.SanPham;
import com.nhom30.gioHang.GioHang;
import com.nhom30.gioHang.Item;
import com.nhom30.service.IHome_ProductService;
import com.nhom30.service.IProductService;
import com.nhom30.service.IUserService;

@Controller
@RequestMapping("/home")
public class HomeController {
	@Autowired
	private IProductService sanPhamService;
	@Autowired
	private IUserService userService;
	@Autowired
	private IHome_ProductService productService;

	@GetMapping("")
	public String landingPage(ModelMap modelMap) {
		modelMap.addAttribute("listProduct", productService.getAllSP());
		return "/home/home";

	}

//	@GetMapping("")
//	public String showFormHome(ModelMap modelMap) {
//		modelMap.addAttribute("listProduct", productService.getAllSP());
//
//		return "/home/home";
//	}
	@GetMapping("/chi-tiet-gio-hang")
	public String formTest() {
		return "/auth/chiTietSanPham";
	}

	@GetMapping("/them-gio-hang/{id}")
	public String themSanpham(@PathVariable("id") int id, HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		themcart(id, request, response);
		return "redirect:/home/giohang";
	}

	@GetMapping("/giohang")
	public String formGioHang(HttpServletRequest request,ModelMap modelMap) {
		HttpSession session = request.getSession();
		GioHang gioHang = new GioHang();
		Object objGioHang = session.getAttribute("cart"); // Lấy cart từ jsp

		if (objGioHang != null) {
			gioHang = (GioHang) objGioHang;
		} else {
			session.setAttribute("cart", gioHang);
		}
////		UserInfo user = (UserInfo) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//		NguoiDung ng = userService.getNguoiDung(user.getId());
//		modelMap.addAttribute("user", ng);
		modelMap.addAttribute("tong",gioHang.TongTien());
		
		return "/auth/gioHang";
	}
	

	public void themcart(int id, HttpServletRequest request, HttpServletResponse response) throws IOException {
		SanPham sanPham = sanPhamService.getSanPham(id);
		HttpSession session = request.getSession();
		GioHang gioHang = null;
		Object objGioHang = session.getAttribute("cart");

		if (objGioHang != null) {
			gioHang = (GioHang) objGioHang;
		} else {
			gioHang = new GioHang();
			session.setAttribute("cart", gioHang);
		}
		Item item = new Item(sanPham.getMaSp(), sanPham.getTenSp(), sanPham.getHinhAnh(), sanPham.getGiaGoc(), 1);
		gioHang.ThemItem(item);
		session.setAttribute("cart", gioHang);
	}

}
