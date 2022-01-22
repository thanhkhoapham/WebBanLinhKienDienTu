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
<title>Wed bàn hàng online</title>
<link rel="icon" href="#">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!--CSS-->
<link href="<c:url value='/static/bootstrap/bootstrap.min.css' />"
	rel="stylesheet">
<link rel="stylesheet" type="text/css" href="/static/bootstrap/all.css">
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
	src="<c:url value='/static/bootstrap/bootstrap.min.js' />"></script>
<script
	src="<c:url value='/static/bootstrap/jquery-ui.min.js' />"
	type="text/javascript"></script>
<script src="<c:url value='/static/bootstrap/common.js' />"
	type="text/javascript"></script>
<script src="<c:url value='/static/bootstrap/fix-height.js' />"
	data-img-box=".image-resize" type="text/javascript"></script>
<script src="<c:url value='/static/bootstrap/mycard.js' />"></script>

<!-- Slide -->
<link href="<c:url value='/static/bootstrap/owl.carousel.css' />"
	rel="stylesheet" type="text/css">
<link href="<c:url value='/static/bootstrap/owl.theme.default.css' />"
	rel="stylesheet" type="text/css">

<script src="<c:url value='/static/bootstrap/jquery.min.js' />">
	
</script>
<script
	src="<c:url value='/static/bootstrap/owl.carousel.js' />"></script>
<link href="<c:url value='/static/bootstrap/owl.carousel.css' />"
	rel="stylesheet" type="text/css">
<link href="<c:url value='/static/bootstrap/owl.theme.default.css' />"
	type="text/css">

<script src="<c:url value='/static/bootstrap/jquery.min.js' />"></script>
<script src="<c:url value='/static/bootstrap/owl.carousel.js' />"></script>

</head>

<body>
	<div class="wrapper page-home">
		<div class="header">
			<jsp:include page="../common/header2.jsp"></jsp:include>

		</div>

		<div class="container">
			<div class="adv">
				<jsp:include page="../common/adv.jsp"></jsp:include>
			</div>


			<div class="main">
				<div class="container">
					<div class="row">
						<!-- <div class="col-md-4"></div> -->
						<div class="col-md-12">
							<section class="product-content clearfix">
								<h1 class="title clearfix">
									<span>Sản phẩm</span>
								</h1>

								<div class="product-block product-grid row clearfix">
									<c:forEach items="${listProduct}" var="item">
										<div
											class="col-md-3 col-sm-3 col-xs-12 product-resize product-item-box fixheight"
											style="height: 420px;">
											<div class="product-item">
												<div class="image image-resize" style="height: 185px;">
													<a href="#" title="${item.tenSp}"> <img
														src="<c:url value='${item.hinhAnh}' />"
														class="img-responsive">
													</a> <a class="hover-image" href="#"> <img
														src="<c:url value='${item.hinhAnh}' />"
														class="img-responsive">
													</a>
													<div class="view-more clearfix">
														<a href="#" class="btn-quickview">Hello Chí Trung</a>
													</div>
												</div>
												<div class="right-block">
													<h2 class="name">
														<a href="#" title="">${item.tenSp}</a>
													</h2>
													<div class="ratings clearfix">
														<div class="rating-box">
															<div class="rating"></div>
														</div>
													</div>
													<div class="price">
														<span class="price-new">${item.giaGoc}&nbsp;₫</span>
													</div>
													<div class="row">
														<div class="col-12">
															
														</div>
													</div>
												</div>
											</div>
											<a class="btn btn-primary" href="/nhom30/home/them-gio-hang/${item.maSp}">Thêm vào giỏ hàng Kim Thoa</a>
										</div>
									</c:forEach>
								</div>


							</section>

						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="footer">
			<jsp:include page="../common/footer.jsp"></jsp:include>
		</div>


	</div>

</body>
</html>