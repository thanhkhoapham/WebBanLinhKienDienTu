<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<%@ page isELIgnored="false"%>
<div class="col-md-3 left_col">
	<div class="left_col scroll-view">
		<div class="navbar nav_title" style="border: 0;">
			<a href="/nhom30/admin/nguoi-dung/" class="site_title"><i
				class="fa fa-paw"></i> <span>Nhóm 30</span></a>
		</div>

		<div class="clearfix"></div>

		<!-- menu profile quick info -->
		<div class="profile clearfix">
			<div class="profile_pic">
				<img src="<c:url value='/static/img/img.jpg' />" alt="..."
					class="img-circle profile_img">
			</div>
			<div class="profile_info">
				<span>Welcome</span>
				<h2>Admin</h2>
			</div>
		</div>
		<!-- /menu profile quick info -->
		<br>
		<!-- sidebar menu -->
		<div id="sidebar-menu" class="main_menu_side hidden-print main_menu"
			style="font-size: 1rem;">

			<div class="menu_section">
				<h3>Danh mục</h3>
				<ul class="nav side-menu">
					<li><a href="/nhom30/admin/san-pham/"><i
							class="fa fa-cogs"></i>Sản phẩm</a></li>
					<li><a href="/nhom30/admin/nguoi-dung/"><i
							class="fa fa-address-card"></i>Quản lý khách hàng</a></li>
					<li><a href="/nhom30/admin/hoa-don/"><i
							class="fa fa-money"></i>Quản lý hóa đơn</a></li>
					<li><a href="/nhom30/admin/loai-sp/"><i
							class="	fa fa-sitemap"></i>Quản lý loại sản phẩm</a></li>
				</ul>
			</div>

		</div>
		<!-- /sidebar menu -->

		<!-- /menu footer buttons -->

		<!-- /menu footer buttons -->
	</div>
</div>