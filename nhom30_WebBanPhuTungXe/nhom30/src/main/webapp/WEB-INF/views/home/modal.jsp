<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<%@ page isELIgnored="false"%>
<div class="container">
	<!-- Trigger the modal with a button -->
	<button type="button" class="btn btn-info btn-lg" data-toggle="modal"
		data-target="#myModal">Tiến hành thanh toán</button>

	<!-- Modal -->
	<div class="modal fade" id="myModal" role="dialog">
		<div class="modal-dialog">

			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Thông tin khách hàng</h4>
					<div class=row>
						<security:authorize access="isAuthenticated()==true">
							<security:authentication property="principal" var="user" />
							<span>Tên khách hàng:${user.ten}</span>
						</security:authorize>
					</div>
				</div>
				<div class="modal-body">
					<%-- 	<p>${user.maKh}</p> --%>

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
											src="<c:url value='${item.urlHinhAnh}' />" alt="product img"></a></td>
									<td class="product-name">${item.tenSanpham}</td>
									<td class="product-price">${item.donGia}</td>
									<td class="product-quantity"><input type="number"
										value="${item.soLuong}"></td>
									<td class="product-subtotal">${item.donGia*item.soLuong}đ
									</td>

								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<div class="modal-footer">
					<a type="button" class="btn btn-primary"
						href="/nhom30/giohang/checkout">Chấp nhận mua hàng</a>
					<button type="button" class="btn btn-primary" data-dismiss="modal">Hủy</button>
				</div>
			</div>

		</div>
	</div>

</div>

