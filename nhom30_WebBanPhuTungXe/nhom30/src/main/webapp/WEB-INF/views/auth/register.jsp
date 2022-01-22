<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<!-- saved from url=(0050)file:///D:/WebBanLinhKienDienTu/html/trangchu.html -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- Meta, title, CSS, favicons, etc. -->

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="icon" href="#" type="image/ico">

<style type="text/css">
@charset "UTF-8";

[ng\:cloak], [ng-cloak], [data-ng-cloak], [x-ng-cloak], .ng-cloak,
	.x-ng-cloak, .ng-hide:not(.ng-hide-animate) {
	display: none !important;
}

ng\:form {
	display: block;
}

.ng-animate-shim {
	visibility: hidden;
}

.ng-anchor {
	position: absolute;
}
</style>
<title>Wed bán linh kiện</title>
<link rel="icon" href="#">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta property="fb:app_id" content="227481454296289">
<!--CSS-->
<link href="<c:url value='/static/bootstrap/bootstrap.min.css' />"
	rel="stylesheet">
<link href="<c:url value='/static/bootstrap/all.css' />"
	rel="stylesheet" type="text/css">
<link href="<c:url value='/static/bootstrap/jquery-ui.min.css' />"
	rel="stylesheet" type="text/css">
<link href="<c:url value='/static/bootstrap/common.css' />"
	rel="stylesheet" type="text/css">
<link href="<c:url value='/static/bootstrap/animate.css' />"
	rel="stylesheet" type="text/css">
<link href="<c:url value='/static/bootstrap/style.css' />"
	rel="stylesheet" type="text/css">
<link href="<c:url value='/static/bootstrap/responsive.css' />"
	rel="stylesheet" type="text/css">


<!--Javascript-->
<script
	src="<c:url value='/static/bootstrap/bootstrap.min.js.download' /></script>
<script
	src="<c:url value='/static/bootstrap/jquery-ui.min.js.download' />"
	type="text/javascript"></script>
<script
	src="<c:url value='/static/bootstrap/bootstrap/common.js.download' />"
	type="text/javascript"></script>
<script src="<c:url value='/static/bootstrap/fix-height.js.download' />"
	data-img-box=".image-resize" type="text/javascript"></script>
<script src="bootstrap/mycard.js.download"></script>




</head>

<body>
	<div class="wrapper page-home">
		<div class="header">	
			<jsp:include page="../common/header2.jsp"></jsp:include>
			
				</div>

			</section>
			<script type="text/javascript">
		$(document).ready(function () {
			var str = location.href.toLowerCase();
			$("
	ul.menu li a").each(function () {
				if
	(str.indexOf(this.href.toLowerCase())>= 0) {
					$("ul.menu li").removeClass("active");
					$(this).parent().addClass("active");
				}
			});
		});
	</script>

</div>
<div class="main">
	<div class="container">
		<div class="row">
			<div class="col-md-3">
				<div class="menu-account">
					<h3>
						<span> Tài khoản </span>
					</h3>
					<ul>
						<li><a href="#"><i class="fa fa-sign-in"></i>Đăng nhập</a></li>
						<li><a href="#"><i class="fa fa-key"></i>Đăng ký</a></li>
					</ul>
				</div>
			</div>
			<div class="col-md-9">

				<div class="col-md-9">
					<div class="breadcrumb clearfix">
						<ul>
							<li itemscope="" class="home"><a title="Đến trang chủ"
								href="file:///D:/WebBanLinhKienDienTu/html/trangchu.html"
								itemprop="url"><span itemprop="title">Trang chủ</span></a></li>
							<li>&nbsp;&nbsp;<i class="fa fa-angle-double-right"></i></li>
							<li><strong>Đăng ký tài khoản</strong></li>
						</ul>
					</div>


					<div class="register-content clearfix ng-scope">
						<h1 class="title">
							<span>Đăng ký tài khoản</span>
						</h1>

						<div
							class="col-md-8 col-md-offset-2 col-xs-12 col-sm-12 col-xs-offset-0 col-sm-offset-0">
							<form
								class="form-horizontal ng-pristine ng-invalid ng-invalid-required ng-valid-email"
								method="post" action="/nhom30/auth/register">
								<h2>
									<span>Thông tin tài khoản</span>
								</h2>

								<div class="form-group">
									<label for="Email" class="col-sm-3 control-label">Email<span
										class="warning">(*)</span></label>
									<div class="col-sm-9">
										<input type="email" name="email"
											class="form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required"
											required>
									</div>
								</div>
								<div class="form-group">
									<label for="Password" class="col-sm-3 control-label">Mật
										khẩu<span class="warning">(*)</span>
									</label>
									<div class="col-sm-9">
										<input type="password" name="matKhau"
											class="form-control ng-pristine ng-untouched ng-invalid ng-invalid-required"
											required>
									</div>
								</div>
								<div class="form-group">
									<label for="RePassword" class="col-sm-3 control-label">Nhập
										lại mật khẩu<span class="warning">(*)</span>
									</label>
									<div class="col-sm-9">
										<input type="password"
											class="form-control ng-pristine ng-untouched ng-valid">
									</div>
								</div>
								<h2>Thông tin cá nhân</h2>
								<div class="form-group">
									<label for="Name" class="col-sm-3 control-label">Họ tên<span
										class="warning">(*)</span></label>
									<div class="col-sm-9">
										<input type="text" name="hoTenKh"
											class="form-control ng-pristine ng-untouched ng-invalid ng-invalid-required"
											required>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">Giới tính</label>
									<div class="col-sm-9">
										<select class="form-control ng-pristine ng-untouched ng-valid"
											name="gioiTinh">
											<option value="Nữ" label="Nữ" selected="selected">Nữ</option>
											<option value="Nam" label="Nam">Nam</option>
										</select>
									</div>
								</div>
								<div class="item form-group">
									<label class="col-sm-3 control-label label-align">Ngày
										sinh <span class="required">*</span>
									</label>
									<div class="col-md-6 col-sm-6 ">
										<input id="birthday" class="date-picker form-control"
											name="ngaySinh" placeholder="dd-mm-yyyy" type="text"
											required="required" type="text" onfocus="this.type='date'"
											onmouseover="this.type='date'" onclick="this.type='date'"
											onblur="this.type='text'" onmouseout="timeFunctionLong(this)"
											name="ngaySinh">
										<script>
												function timeFunctionLong(input) {
													setTimeout(function() {
														input.type = 'text';
													}, 60000);
												}
											</script>
									</div>
								</div>
								<div class="form-group">
									<label for="" class="col-sm-3 control-label">Điện thoại</label>
									<div class="col-sm-9">
										<input type="text" name="soDienThoai"
											class="form-control ng-pristine ng-untouched ng-valid">
									</div>
								</div>

								<div class="form-group">
									<label for="" class="col-sm-3 control-label">Địa chỉ</label>
									<div class="col-sm-9">
										<input type="text" name="diaChi"
											class="form-control ng-pristine ng-untouched ng-valid">
									</div>
								</div>



								<div class="form-group">
									<div class="col-sm-offset-4 col-sm-8">
										<button type="submit" class="btn btn-default">Đăng ký</button>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<div class="footer">
	<div class="footer-content clearfix">
		<div class="container">
			<div class="row">
				<div class="footer-box col-md-3 col-sm-12 col-xs-12">
					<div class="item">
						<h3>
							<span>Giới thiệu</span>
						</h3>
					</div>
					<ul>
						<li><a href="#"> Vá» chÃºng tÃ´i </a></li>
						<li><a href="#"> Tá»ng quan vá» cÃ´ng ty </a></li>
						<li><a href="#"> ChÆ°Æ¡ng trÃ¬nh khuyáº¿n mÃ£i </a></li>
						<li><a href="#"> Cáº©m nan mua sáº¯m </a></li>
					</ul>
				</div>
				<div class="footer-box col-md-3 col-sm-12 col-xs-12">
					<div class="item">
						<h3>
							<span>LiÃªn há» - Há»£p tÃ¡c</span>
						</h3>
					</div>
					<ul>
						<li><a href="#"> DÃ nh cho doanh nghiá»p </a></li>
						<li><a href="#"> LiÃªn há» </a></li>
						<li><a href="#"> Tuyá»n dá»¥ng </a></li>
					</ul>
				</div>
				<div class="footer-box box-address col-md-3 col-sm-12 col-xs-12">
					<div class="item">
						<h3>ThÃ´ng tin cÃ´ng ty</h3>
						<div class="box-address-content">
							<b>CÃNG TY TNHH PHÃT TRIá»N CÃNG NGHá» ONLINE</b>
							<p>
								<i class="fa fa-map-marker"></i> 123 Nguyá»n VÄn Báº£o, Q.GÃ²
								Váº¥p, Tp.HCM
							</p>
							<p>
								<i class="fa fa-envelope"></i> <a href="#">thanhkhoapham01@gmail.com</a>
							</p>
							<p>
								<i class="fa fa-phone"></i> Phone: (03) 39 17 78 60
							</p>
						</div>
					</div>
				</div>
				<div class="footer-box box-social col-md-3 col-sm-12 col-xs-12">
					<div class="item">
						<h3>Facebook</h3>
						<div class="social-icon">
							<ul>
								<li><a target="_blank"><i class="fab fa-google-plus-g"></i></a></li>
								<li><a href="#" target="_blank"><i
										class="fab fa-facebook-f"></i></a></li>
								<li><a href="#"><i class="fab fa-youtube"></i></a></li>
								<li><a target="_blank"><i class="fab fa-twitter"></i></a></li>
							</ul>
						</div>
					</div>

				</div>
				<div class="footer-box box-letter col-md-3 col-sm-12 col-xs-12 hide">
					<div class="item">
						<h3>ÄÄng kÃ½ nháº­n tin</h3>
						<div class="letter-title">
							<span>Há»p thÆ°</span><i class="icon-title"></i>
						</div>
						<div class="letter-content">
							<div class="new-paper">
								<div class="input-box">
									<input type="text" name="email" id="txtNewsletter"
										class="input-text form-control" value=""
										placeholder="Your Emain Address">
								</div>
								<div class="button text-center">
									<a class="btn btn-primary">Nháº­n tin</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>


</div>
</body>
</html>