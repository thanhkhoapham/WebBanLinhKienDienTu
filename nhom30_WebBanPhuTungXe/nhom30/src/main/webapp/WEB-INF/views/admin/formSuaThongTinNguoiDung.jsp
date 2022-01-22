<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html lang="en" class=" ">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- Meta, title, CSS, favicons, etc. -->

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="icon" href="#" type="image/ico">

<title>Nhóm 30</title>

<!-- Bootstrap -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="<c:url value='/static/css/bootstrap.min.css' />"
	rel="stylesheet">
<!-- Font Awesome -->
<link href="<c:url value='/static/css/font-awesome.min.css' />"
	rel="stylesheet">
<!-- NProgress -->
<link href="<c:url value='/static/css/nprogress.css' />"
	rel="stylesheet">
<!-- iCheck -->
<link href="<c:url value='/static/css/green.css' />" rel="stylesheet">

<!-- bootstrap-progressbar -->
<link
	href="<c:url value='/static/css/bootstrap-progressbar-3.3.4.min.css' />"
	rel="stylesheet">
<!-- JQVMap -->
<link href="<c:url value='/static/css/jqvmap.min.css' />"
	rel="stylesheet">
<!-- bootstrap-daterangepicker -->
<link href="../bootstrap/daterangepicker.css" rel="stylesheet">

<!-- Custom Theme Style -->
<link href="<c:url value='/static/css/custom.min.css' />"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>

<body class="nav-md">
	<div class="container body">
		<div class="main_container">
			<!-- navigation -->
			<jsp:include page="../common/admin-navbar.jsp"></jsp:include>
			<jsp:include page="../common/admin-top-navbar.jsp"></jsp:include>
			<!--navigation -->

			<!-- top navigation -->
			<div class="top_nav">
				<div class="nav_menu">
					<div class="nav toggle">
						<a id="menu_toggle"><i class="fa fa-bars"></i></a>
					</div>
					<nav class="nav navbar-nav">
						<ul class=" navbar-right">
							<li class="nav-item dropdown open" style="padding-left: 15px;">
								<a href="javascript:;" class="user-profile dropdown-toggle"
								aria-haspopup="true" id="navbarDropdown" data-toggle="dropdown"
								aria-expanded="false"> <img src="../bootstrap/img.jpg"
									alt="">ADMIN
							</a>
								<div class="dropdown-menu dropdown-usermenu pull-right"
									aria-labelledby="navbarDropdown">
									<a class="dropdown-item" href="javascript:;"> Profile</a> <a
										class="dropdown-item" href="#"><i
										class="fa fa-sign-out pull-right"></i> Log Out</a>
								</div>
							</li>


						</ul>
					</nav>
				</div>
			</div>
			<!-- /top navigation -->

			<!-- page content -->
			<div class="right_col" role="main" style="min-height: 707px;">
				<div class="">
					<div class="page-title">Danh sách người dùng</div>
					<div style="padding-top: 1.5em" class="row">
						<div class="col-md-12 col-sm-12 ">
							<div class="x_panel">
								<div class="x_content">
									<br />

									<!-- -------------------------------------------------------Form -->
									<form action="update-NguoiDung/${nguoiDungEdit.maKh}"
										method="post" id="demo-form2" data-parsley-validate
										class="form-horizontal form-label-left">

										<div class="item form-group">
											<label class="col-form-label col-md-3 col-sm-3 label-align"
												for="hoTenKh">Họ tên:<span class="required">*</span>
											</label>
											<div class="col-md-6 col-sm-6 ">
												<input value="${nguoiDungEdit.hoTenKh}" type="text"
													name="hoTenKh" id="first-name" required="required"
													class="form-control ">
											</div>
										</div>
										<div class="item form-group">
											<label class="col-form-label col-md-3 col-sm-3 label-align"
												for="last-name">Email: <span class="required">*</span>
											</label>
											<div class="col-md-6 col-sm-6 ">
												<input readonly type="text" id="last-name" name="email"
													required="required" value="${nguoiDungEdit.email}"
													class="form-control">
											</div>
										</div>
										<div class="item form-group">
											<div class="col-md-6 col-sm-6 ">
												<input value="${nguoiDungEdit.matKhau}" type="hidden" id=""
													name="matKhau" required="required" class="form-control">
											</div>
										</div>
										<div class="item form-group">
											<label class="col-form-label col-md-3 col-sm-3 label-align"
												for="last-name">Địa chỉ: <span class="required">*</span>
											</label>
											<div class="col-md-6 col-sm-6 ">
												<input type="text" value="${nguoiDungEdit.diaChi}"
													id="last-name" name="diaChi" required="required"
													class="form-control">
											</div>
										</div>
										<div class="item form-group">
											<label class="col-form-label col-md-3 col-sm-3 label-align"
												for="last-name">Số điện thoại: <span
												class="required">*</span>
											</label>
											<div class="col-md-6 col-sm-6 ">
												<input value="${nguoiDungEdit.soDienThoai}" type="text"
													id="last-name" name="soDienThoai" required="required"
													class="form-control">
											</div>
										</div>
										<div class="item form-group">
											<label class="col-form-label col-md-3 col-sm-3 label-align">Giới
												tính</label> <select class="col-md-6 col-sm-6"
												id="inlineFormCustomSelectPref">
												<option selected="selected"
													value="${nguoiDungEdit.gioiTinh}">${nguoiDungEdit.gioiTinh}</option>
												<option value="Nam">Nam</option>
												<option value="Nữ">Nữ</option>
											</select>
										</div>
										<div class="item form-group">
											<label class="col-form-label col-md-3 col-sm-3 label-align">Ngày
												sinh <span class="required">*</span>
											</label>
											<div class="col-md-6 col-sm-6 ">
												<input id="birthday" class="date-picker form-control"
													type="text" required="required" type="text"
													onfocus="this.type='date'" onmouseover="this.type='date'"
													onclick="this.type='date'" onblur="this.type='text'"
													onmouseout="timeFunctionLong(this)"
													value="${nguoiDungEdit.ngaySinh}" name="ngaySinh">
												<script>
													function timeFunctionLong(
															input) {
														setTimeout(
																function() {
																	input.type = 'text';
																}, 60000);
													}
												</script>
											</div>
										</div>
										<div class="ln_solid"></div>
										<div class="col-md-6 col-sm-6 offset-md-3">
											<button class="btn btn-primary" type="reset">Làm lại</button>
											<button type="submit" class="btn btn-success">Gửi</button>
										</div>
									</form>
								</div>
							</div>
						</div>
					</div>


				</div>
			</div>
			<!-- /page content -->

			<!-- footer content -->
			<footer>
				<jsp:include page="../common/admin-footer.jsp"></jsp:include>
			</footer>
			<!-- /footer content -->
		</div>
	</div>


	<!-- jQuery -->
	<script src="<c:url value='/static/css/jquery.min.js' />"></script>
	<!-- Bootstrap -->
	<script src="<c:url value='/static/css/bootstrap.bundle.min.js' />"></script>
	<!-- FastClick -->
	<script src="<c:url value='/static/css/bootstrap.bundle.min.js' />"></script>
	<!-- NProgress -->
	<script src="<c:url value='/static/css/nprogress.js' />"></script>
	<!-- iCheck -->
	<script src="<c:url value='/static/css/icheck.min.js' />"></script>
	<!-- Datatables -->
	<script src="<c:url value='/static/css/jquery.dataTables.min.js' />"></script>
	<script src="<c:url value='/static/css/dataTables.bootstrap.min.js' />"></script>
	<script src="<c:url value='/static/css/dataTables.buttons.min.js' />"></script>
	<script src="<c:url value='/static/css/buttons.bootstrap.min.js' />"></script>
	<script src="<c:url value='/static/css/buttons.flash.min.js' />"></script>
	<script src="<c:url value='/static/css/buttons.html5.min.js' />"></script>
	<script src="<c:url value='/static/css/buttons.print.min.js' />"></script>
	<script
		src="<c:url value='/static/css/dataTables.fixedHeader.min.js' />"></script>
	<script src="<c:url value='/static/css/dataTables.keyTable.min.js' />"></script>
	<script
		src="<c:url value='/static/css/dataTables.responsive.min.js' />"></script>
	<script src="<c:url value='/static/css/responsive.bootstrap.js' />"></script>
	<script src="<c:url value='/static/css/dataTables.scroller.min.js' />"></script>
	<script src="<c:url value='/static/css/jszip.min.js' />"></script>
	<script src="<c:url value='/static/css/pdfmake.min.js' />"></script>
	<script src="<c:url value='/static/css/vfs_fonts.js' />"></script>

	<!-- Custom Theme Scripts -->
	<script src="<c:url value='/static/css/custom.min.js' />"></script>
</body>
</html>