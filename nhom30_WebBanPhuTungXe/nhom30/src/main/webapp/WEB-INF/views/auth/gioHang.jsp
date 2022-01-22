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


<!-- Owl Carousel fremwork main css -->
<link rel="stylesheet"
	href="<c:url value='/static/bootsrapGioHang/owl.carousel.min.css' />">
<link rel="stylesheet"
	href="<c:url value='/static/bootsrapGioHang/owl.theme.default.min.css' />">
<!-- This core.css file contents all plugings css file. -->
<link rel="stylesheet"
	href="<c:url value='/static/bootsrapGioHang/core.css' />">
<!-- Theme shortcodes/elements style -->
<link rel="stylesheet"
	href="<c:url value='/static/bootsrapGioHang/shortcodes.css' />">
<!-- Theme main style -->
<link rel="stylesheet"
	href="<c:url value='/static/bootsrapGioHang/style.css' />">
<!-- Responsive css -->
<link rel="stylesheet"
	href="<c:url value='/static/bootsrapGioHang/responsive.css' />">
<!-- User style -->
<link rel="stylesheet"
	href="<c:url value='/static/bootsrapGioHang/custom.css' />">
<script
	src="./Mathematics and Statistics __ Educan Education HTML Template_files/jquery-1.12.0.min.js.download"></script>
<!-- Bootstrap framework js -->
<script src="<c:url value='/static/bootsrapGioHang/bootstrap.min.js' />"></script>
<!-- All js plugins included in this file. -->
<script src="<c:url value='/static/bootsrapGioHang/plugins.js' />">
	
</script>
<script src="<c:url value='/static/bootsrapGioHang/slick.min.js' />">
	
</script>
<!-- Owl Carousel Min Js. -->
<script
	src="<c:url value='/static/bootsrapGioHang/owl.carousel.min.js' />">
	
</script>
<!-- Waypoints Min Js. -->
<script src="<c:url value='/static/bootsrapGioHang/waypoints.min.js' />">
	
</script>
<!-- Main js file that contents all jQuery plugins activation. -->
<script src="<c:url value='/static/bootsrapGioHang/main.js' />">
	
</script>


<!--Javascript-->
<script
	src="<c:url value='/static/bootstrap/bootstrap.min.js.download' />">
	
</script>
<script
	src="<c:url value='/static/bootstrap/jquery-ui.min.js.download' />"
	type="text/javascript"></script>
<script src="<c:url value='/static/bootstrap/common.js.download' />"
	type="text/javascript"></script>
<script src="<c:url value='/static/bootstrap/fix-height.js.download' />"
	data-img-box=".image-resize" type="text/javascript"></script>
<script src="<c:url value='/static/bootstrap/mycard.js.download' />"></script>

<!-- Slide -->
<link href="<c:url value='/static/bootstrap/owl.carousel.css' />"
	rel="stylesheet" type="text/css">
<link href="<c:url value='/static/bootstrap/owl.theme.default.css' />"
	rel="stylesheet" type="text/css">

<script src="<c:url value='/static/bootstrap/jquery.min.js.download' />">
	
</script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script
	src="<c:url value='/static/bootstrap/owl.carousel.js.download' />"></script>
<link href="<c:url value='/static/bootstrap/owl.carousel.css' />"
	rel="stylesheet" type="text/css">

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
				<div class="wrapper">
					<div class="cart-main-area ptb--80">
						<div class="container">
							<div class="row">
								<div class="col-md-12 col-sm-12 col-xs-12">
									<form action="#">
										<div class="table-content table-responsive">
											<table>
												<thead>
													<tr>
														<th class="product-thumbnail">Hinh ảnh</th>
														<th class="product-name">Tên sản phẩm</th>
														<th class="product-price">Giá</th>
														<th class="product-quantity">Số lượng</th>
														<th class="product-subtotal">Tổng</th>
														<th class="product-remove">Xóa</th>
													</tr>
												</thead>
												<tbody>
													<c:forEach items="${cart.getGioHang()}" var="item">
														<tr>
															<td class="product-thumbnail"><a href="#"><img
																	width="100px" height="100px"
																	src="<c:url value='${item.urlHinhAnh}' />"
																	alt="product img"></a></td>
															<td class="product-name">${item.tenSanpham}</td>
															<td class="product-price">${item.donGia}</td>
															<td class="product-quantity"><input type="number"
																value="${item.soLuong}"></td>
															<td class="product-subtotal">${item.donGia*item.soLuong}đ
															</td>
															<td class="product-remove"><a href="#">X</a></td>
														</tr>
													</c:forEach>
												</tbody>
											</table>
										</div>
										<div class="row">
											<div class="col-md-8 col-sm-7 col-xs-12">
												<div class="buttons-cart">

													<a href="/nhom30/home">Tiếp tục mua hàng</a>
												</div>

											</div>
											<div class="col-md-4 col-sm-5 col-xs-12">
												<div class="cart_totals">

													<table>
														<tbody>


															<tr class="order-total">
																<th>Tổng: </th>
																<td><strong><span class="amount">${tong}
																	</span></strong></td>
															</tr>
														</tbody>
													</table>
													 
												</div>
											</div>
										</div>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>

			</div>
			<jsp:include page="../home/modal.jsp"></jsp:include>
		</div>
		<div class="footer">
			<jsp:include page="../common/footer.jsp"></jsp:include>
		</div>


	</div>

</body>
</html>