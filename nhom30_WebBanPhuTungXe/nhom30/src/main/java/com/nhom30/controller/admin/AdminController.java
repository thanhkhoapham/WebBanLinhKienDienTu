package com.nhom30.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nhom30.dto.LoaiSpDto;
import com.nhom30.dto.NguoiDungDto;
import com.nhom30.dto.SanPhamDto;
import com.nhom30.entity.LoaiSp;
import com.nhom30.entity.NguoiDung;
import com.nhom30.entity.SanPham;
import com.nhom30.service.ICategoryService;
import com.nhom30.service.IOrderDetailService;
import com.nhom30.service.IOrderService;
import com.nhom30.service.IProductService;
import com.nhom30.service.IUserService;
import com.nhom30.service.impl.CategoryService;
import com.nhom30.service.impl.OrderDetailService;
import com.nhom30.service.impl.OrderService;
import com.nhom30.service.impl.ProductService;
import com.nhom30.service.impl.UserService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	ICategoryService loaiSpService = new CategoryService();

	@Autowired
	IProductService sanPhamService = new ProductService();

	@Autowired
	IUserService nguoiDungService = new UserService();
	@Autowired
	IOrderService hoaDonService = new OrderService();
	@Autowired
	IOrderDetailService chitietHDService = new OrderDetailService();

	@GetMapping("home")
	public String formAdmin() {
		return "/admin/home";
	}

////======================================= Sản phẩm ======================================
	@RequestMapping(value = "san-pham", method = RequestMethod.GET)
	public String formSp(ModelMap modelMap) {
		modelMap.addAttribute("list", sanPhamService.getAll());
		return "admin/listSanPham";
	}

	@RequestMapping(value = "san-pham/add", method = RequestMethod.GET)
	public String formThemSp(ModelMap modelMap) {
		modelMap.addAttribute("listLSP", loaiSpService.getAll());
		return "admin/formThemSanPham";
	}

	@RequestMapping(value = "san-pham/addSanPham", method = RequestMethod.POST)
	public String addSanPham(@ModelAttribute("sanPham") SanPham sanPham, @RequestParam("loaiSp") int ma) {
		String hinhAnh = "/static/img/" + sanPham.getHinhAnh();
//		System.out.println(loaiSp);
//		,
//		@ModelAttribute("loaiSp") String loaiSp
//		int maloaiSp = sanPhamService.getSanPhamByTen(loaiSp);
		SanPhamDto dto1 = new SanPhamDto(sanPham.getMaSp(), sanPham.getTenSp(), ma, sanPham.getGiaGoc(),
				sanPham.getThuongHieu(), sanPham.getXuatXu(), sanPham.getMoTa(), hinhAnh);
		sanPhamService.addProduct(dto1);
		return "redirect:/admin/san-pham/";
	}

//
	@RequestMapping(value = "san-pham/delete/{id}", method = RequestMethod.GET)
	public String deleteSp(@ModelAttribute("id") int id) {
		sanPhamService.deleteProduct(id);
		return "redirect:/admin/san-pham/";
		// khi submit quay lai trang chu va load lai
	}

//
	@RequestMapping(value = "san-pham/edit/{id}", method = RequestMethod.GET)
	public String formSuaSp(@PathVariable("id") int id, ModelMap map) {
		map.addAttribute("listLSP", loaiSpService.getAll());
		map.addAttribute("sanPhamEdit", sanPhamService.getSanPham(id));
		return "admin/formSuaThongTinSanPham";
	}

	@RequestMapping(value = "san-pham/edit/updateSanPham/{id}", method = RequestMethod.POST)
	public String editSanPham(@PathVariable("id") int id, @ModelAttribute("sanPhamEdit") SanPham sp) {
		String hinhAnh = "/static/img/" + sp.getHinhAnh();
		SanPhamDto dto = new SanPhamDto(id, sp.getTenSp(), sp.getMaLoaiSp(), sp.getGiaGoc(), sp.getThuongHieu(),
				sp.getXuatXu(), sp.getMoTa(), hinhAnh);
		sanPhamService.updateSp(dto);

		// MAc dinh id trong person id, no se hieure id co san trong person
		return "redirect:/admin/san-pham/";
	}

//	====================Loai san pham===========================================
//admin/loai-sp/
	@RequestMapping(value = "loai-sp", method = RequestMethod.GET)
	public String formLoaiSp(ModelMap modelMap) {
		modelMap.addAttribute("list", loaiSpService.getAll());
		return "admin/listLoaiSp";
	}

//loai-sp/add
	@RequestMapping(value = "loai-sp/add", method = RequestMethod.GET)
	public String formAddLoaiSp(ModelMap map) {
		map.addAttribute("listLSP", loaiSpService.getAll());
		return "admin/formThemLoaiSp";
	}

	@RequestMapping(value = "loai-sp/addLoaiSp", method = RequestMethod.POST)
	public String addLoaiSp(@ModelAttribute("loaiSp") LoaiSp loaiSp) {
		LoaiSpDto dto = new LoaiSpDto(loaiSp.getMaLoaiSp(), loaiSp.getTenLoaiSp());
		loaiSpService.addCategory(dto);
		return "redirect:/admin/loai-sp/";
	}

	@RequestMapping(value = "loai-sp/edit/{maLoaiSp}", method = RequestMethod.GET)
	public String formUpdateLoaiSp(@PathVariable("maLoaiSp") int id, ModelMap modelMap) {
//	modelMap.addAttribute("personId", personId);
		modelMap.addAttribute("loaiSpEdit", loaiSpService.getLoaiSp(id));
		return "admin/formSuaLoaiSp";
	}

	@RequestMapping(value = "loai-sp/edit/update-LoaiSp/{maLoaiSp}", method = RequestMethod.POST)
	public String editLoaiSp(@PathVariable("maLoaiSp") int id, @ModelAttribute("loaiSpEdit") LoaiSp loaiSp) {
		LoaiSpDto dto = new LoaiSpDto(id, loaiSp.getTenLoaiSp());
		loaiSpService.updateLoaiSp(dto);

		// MAc dinh id trong person id, no se hieure id co san trong person
		return "redirect:/admin/loai-sp/";
	}

	@RequestMapping(value = "loai-sp/delete/{id}", method = RequestMethod.GET)
	public String deleteLoaiSp(@ModelAttribute("id") int id) {
		loaiSpService.deleteLoaiSp(id);
		return "redirect:/admin/loai-sp/";
		// khi submit quay lai trang chu va load lai
	}

//========================================Nguoi dung - khach hang==================================
	@RequestMapping(value = "nguoi-dung", method = RequestMethod.GET)
	public String formPerson(ModelMap modelMap) {
		modelMap.addAttribute("list", nguoiDungService.getAll());
		return "admin/listNguoiDung";
	}

	@RequestMapping(value = "nguoi-dung/delete/{id}", method = RequestMethod.GET)
	public String deletePerson(@ModelAttribute("id") int id) {
		nguoiDungService.deleteNguoiDung(id);
		return "redirect:/admin/nguoi-dung/";
		// khi submit quay lai trang chu va load lai
	}

	@RequestMapping(value = "nguoi-dung/edit/{maKh}", method = RequestMethod.GET)
	public String formUpdatePerson(@PathVariable("maKh") int id, ModelMap modelMap) {
//		modelMap.addAttribute("personId", personId);
		modelMap.addAttribute("nguoiDungEdit", nguoiDungService.getNguoiDung(id));
		return "admin/formSuaThongTinNguoiDung";
	}

////	nguoi-dung/edit/update-NguoiDung/6
	@RequestMapping(value = "nguoi-dung/edit/update-NguoiDung/{maKh}", method = RequestMethod.POST)
	public String editPerson(@PathVariable("maKh") int id, @ModelAttribute("nguoiDungEdit") NguoiDung nguoiDung) {
		System.out.println(nguoiDung);
		NguoiDungDto dto = new NguoiDungDto(id, nguoiDung.getHoTenKh(), nguoiDung.getDiaChi(),
				nguoiDung.getSoDienThoai(), nguoiDung.getGioiTinh(), nguoiDung.getEmail(), nguoiDung.getNgaySinh(),
				nguoiDung.getRole(), 1, nguoiDung.getMatKhau());
		System.out.println(dto);
		nguoiDungService.updateNguoiDung(dto);
		// MAc dinh id trong person id, no se hieure id co san trong person
		return "redirect:/admin/nguoi-dung/";
	}

//=================================================Hóa đơn
	@RequestMapping(value = "hoa-don", method = RequestMethod.GET)
	public String formHoaDon(ModelMap modelMap) {
		modelMap.addAttribute("list", hoaDonService.getAll());
		return "admin/listHoaDon";
	}

	@RequestMapping(value = "/hoa-don/delete/{id}", method = RequestMethod.GET)
	public String deleteHoaDon(@ModelAttribute("id") int id) {
		hoaDonService.deleteHoaDon(id);
		return "redirect:/admin/hoa-don/";
		// khi submit quay lai trang chu va load lai
	}

	@RequestMapping(value = "hoa-don/view/{id}", method = RequestMethod.GET)
	public String formChiTietHoaDon(@PathVariable("id") int id, ModelMap modelMap) {
//		modelMap.addAttribute("personId", personId);
		modelMap.addAttribute("list", chitietHDService.getAll());
		return "admin/listChiTietHoaDon";
	}
//	===================================================Chi tiết hóa đơn

}
