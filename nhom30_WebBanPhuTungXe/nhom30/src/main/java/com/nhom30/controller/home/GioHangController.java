package com.nhom30.controller.home;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nhom30.dto.UserInfo;
import com.nhom30.entity.ChiTietHoaDon;
import com.nhom30.entity.ChiTietHoaDon_PK;
import com.nhom30.entity.HoaDon;
import com.nhom30.entity.NguoiDung;
import com.nhom30.gioHang.GioHang;
import com.nhom30.gioHang.Item;
import com.nhom30.reponsitory.IOrderResponsitory;
import com.nhom30.reponsitory.IProductReponsitory;
import com.nhom30.reponsitory.IUserResponsitory;
import com.nhom30.service.ICategoryService;
import com.nhom30.service.IOrderDetailService;
import com.nhom30.service.IOrderService;
import com.nhom30.service.IProductService;
import com.nhom30.service.IUserService;

@Controller
@RequestMapping("giohang")
public class GioHangController {
	@Autowired
	private IProductService sanPhamService;
	@Autowired
	private IUserService userService;
	@Autowired
	private ICategoryService loaiSpService;
	@Autowired
	private IOrderService orderService;
	@Autowired
	private IOrderDetailService chiTietDonHangService;
	@Autowired
	private IUserResponsitory userReponsitory;
	@Autowired
	private IOrderResponsitory orderReponsitory;
	@Autowired
	private IProductReponsitory productReponsitory;

	@GetMapping("/checkout")
	public String CHECKOUT(HttpServletRequest request) {
		HttpSession session = request.getSession();
		GioHang gioHang = new GioHang();
		Object objGioHang = session.getAttribute("cart");
		UserInfo user = (UserInfo) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		NguoiDung ng = userService.getNguoiDung(user.getId());
		HoaDon hoaDon = new HoaDon(new Date(System.currentTimeMillis()), ng.getDiaChi(), user.getId());

		orderService.addHoaDon(hoaDon);
		int idOrder = orderService.getIdLonNhat();
		System.out.println();
//		 SanPham sanPham, HoaDon hoaDon
		if (objGioHang != null) {
			gioHang = (GioHang) objGioHang;
			for (Item item : gioHang.getGioHang()) {
				ChiTietHoaDon chiTietHoaDon = new ChiTietHoaDon(
						new ChiTietHoaDon_PK(idOrder, item.getId()),
						productReponsitory.getSanPham(item.getId()), orderReponsitory.getById(idOrder),
						item.getSoLuong(), item.getDonGia());
				chiTietDonHangService.saveChiTiet(chiTietHoaDon);
			}
		}
		session.removeAttribute("cart");
		return "redirect:/home";
	}
}
