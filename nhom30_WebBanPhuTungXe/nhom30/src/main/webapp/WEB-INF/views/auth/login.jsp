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
<title>Wed bán linh kiện</title>
<link rel="icon" href="#">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!--CSS-->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
	src="<c:url value='/static/bootstrap/bootstrap.min.js.download' />"
	type="text/javascript"></script>
<script
	src="<c:url value='/static/bootstrap/jquery-ui.min.js.download' />"
	type="text/javascript"></script>
<script
	src="<c:url value='/static/bootstrap/bootstrap/common.js.download' />"
	type="text/javascript"></script>
<script src="<c:url value='/static/bootstrap/fix-height.js.download' />"
	data-img-box=".image-resize" type="text/javascript"></script>
<script src="bootstrap/mycard.js.download" type="text/javascript">
	
</script>
</head>

<body>
	<div class="container-fluid">
		<div class="wrapper page-home">
			<div class="header">
				<jsp:include page="../common/header2.jsp"></jsp:include>

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

							<div class="breadcrumb clearfix">
								<ul>
									<li itemscope="" class="home"><a
										title="Äáº¿n trang chá»§" href="/" itemprop="url"><span
											itemprop="title">Trang chủ</span></a></li>
									<li>&nbsp;&nbsp;<i class="fa fa-angle-double-right"></i></li>
									<li><strong>Đăng nhập</strong></li>
								</ul>
							</div>

							<div class="login-content clearfix ng-scope">
								<h1 class="title">
									<span>Thông tin đăng nhập</span>
								</h1>
								<!-- ngIf: IsError -->
								<!-- ngIf: IsSuccess -->
								<!-- ngIf: InValid -->
								<div
									class="col-md-6 col-md-offset-3 col-xs-12 col-sm-12 col-xs-offset-0 col-sm-offset-0">
									<form action="login" method="post"
										class="form-horizontal ng-pristine ng-valid-email ng-invalid ng-invalid-required">
										<div class="form-group">
											<label for="Email" class="col-sm-4 control-label">Email</label>
											<div class="col-sm-8">
												<input type="email" name="email">
											</div>
										</div>
										<div class="form-group">
											<label for="Password" class="col-sm-4 control-label">Mật
												khẩu</label>
											<div class="col-sm-8">
												<input type="password" name="password">
											</div>
										</div>

										<div class="form-group">
											<div class="col-sm-offset-4 col-sm-8">
												<button type="submit" class="btn btn-default">Đăng
													nhập</button>

											</div>

										</div>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="footer">
				<div class="footer-content clearfix">
					<div class="container">
						<jsp:include page="../common/footer.jsp"></jsp:include>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>