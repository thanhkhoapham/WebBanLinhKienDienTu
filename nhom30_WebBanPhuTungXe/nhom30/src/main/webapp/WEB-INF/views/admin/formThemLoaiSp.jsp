<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
			<!-- page content -->
			<div class="right_col" role="main" style="min-height: 707px;">
				<div class="">
					<div class="page-title"><h1>Thêm mới sản phẩm</h1></div>
					<div style="padding-top: 5em" class="row">
						<div class="col-md-12 col-sm-12 ">
							<div class="x_panel">
								<div class="x_content">
									<br />

									<!-- -------------------------------------------------------Form -->
									<form action="addLoaiSp" method="post" id="demo-form2"
										data-parsley-validate class="form-horizontal form-label-left">



										<div class="item form-group">
											<label class="col-form-label col-md-3 col-sm-3 label-align"
												for="">Tên loại sản phẩm:<span
												class="required">*</span>
											</label>
											<div class="col-md-6 col-sm-6 ">
												<input type="text" name="tenLoaiSp" id=""
													required="required" class="form-control ">
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
	<script
		src="<c:url value='/static/css/bootstrap.bundle.min.js' />"></script>
	<!-- FastClick -->
	<script
		src="<c:url value='/static/css/bootstrap.bundle.min.js' />"></script>
	<!-- NProgress -->
	<script src="<c:url value='/static/css/nprogress.js' />"></script>
	<!-- iCheck -->
	<script src="<c:url value='/static/css/icheck.min.js' />"></script>
	<!-- Datatables -->
	<script
		src="<c:url value='/static/css/jquery.dataTables.min.js' />"></script>
	<script
		src="<c:url value='/static/css/dataTables.bootstrap.min.js' />"></script>
	<script
		src="<c:url value='/static/css/dataTables.buttons.min.js' />"></script>
	<script
		src="<c:url value='/static/css/buttons.bootstrap.min.js' />"></script>
	<script
		src="<c:url value='/static/css/buttons.flash.min.js' />"></script>
	<script
		src="<c:url value='/static/css/buttons.html5.min.js' />"></script>
	<script
		src="<c:url value='/static/css/buttons.print.min.js' />"></script>
	<script
		src="<c:url value='/static/css/dataTables.fixedHeader.min.js' />"></script>
	<script
		src="<c:url value='/static/css/dataTables.keyTable.min.js' />"></script>
	<script
		src="<c:url value='/static/css/dataTables.responsive.min.js' />"></script>
	<script
		src="<c:url value='/static/css/responsive.bootstrap.js' />"></script>
	<script
		src="<c:url value='/static/css/dataTables.scroller.min.js' />"></script>
	<script src="<c:url value='/static/css/jszip.min.js' />"></script>
	<script src="<c:url value='/static/css/pdfmake.min.js' />"></script>
	<script src="<c:url value='/static/css/vfs_fonts.js' />"></script>

	<!-- Custom Theme Scripts -->
	<script src="<c:url value='/static/css/custom.min.js' />"></script>
</body>
</html>