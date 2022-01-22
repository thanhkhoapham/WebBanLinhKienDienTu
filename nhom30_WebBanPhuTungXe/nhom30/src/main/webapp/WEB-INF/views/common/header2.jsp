<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<section class="top-link clearfix" style="background: #333333;">
	<div class="container">
		<div class="row">
			<ul class="nav navbar-nav topmenu-contact pull-left">
				<li><i class="fa fa-phone"></i><span> Hotline:0339 1778
						60</span></li>
			</ul>
			<ul class="nav navbar-nav navbar-right topmenu  hidden-xs hidden-sm">
				<li class="order-check"><a href="#"><i
						class="fas fa-pencil-alt"></i>Kiểm tra đơn hàng</a></li>
				<li class="order-cart"><a href="/nhom30/home/giohang"><i
						class="fa fa-shopping-cart"></i>Giỏ hàng</a></li>
				<!-- 	<li class="account-login"><a href="/nhom30/auth/login"><i
				class="fas fa-sign-in-alt"></i>Đăng nhập</a></li> -->

				<security:authorize access="isAuthenticated()==false">
					<security:authentication property="principal" var="user" />
					<li class="account-login"><a href="/nhom30/auth/login"><i
							class="fas fa-sign-in-alt"></i>Đăng nhập</a></li>

					<li class="account-register"><a href="/nhom30/auth/register"><i
							class="fa fa-key"></i>Đăng kí</a></li>
				</security:authorize>



				<security:authorize access="isAuthenticated()">
					<security:authentication property="principal" var="user" />
					<li class="account-login"><a href="/nhom30/auth/logout"><i
							class="fas fa-sign-in-alt"></i>Đăng xuất</a></li>
				</security:authorize>

				<sec:authorize access="hasRole('[ADMIN]')">
					<li class="account-login"><a href="/nhom30/auth/logout"><i
							class="fas fa-sign-in-alt"></i>Quản lý </a></li>
				</sec:authorize>

				<security:authorize access="isAuthenticated()">
					<security:authentication property="principal" var="user" />
					<c:choose>
						<c:when test="${user.id=='243' }">
							<li class="account-login"><a href="/nhom30/admin/home"><i
									class="fas fa-sign-in-alt"></i>Quản lý </a></li>
						</c:when>
					</c:choose>

				</security:authorize>

				<!-- <li class="account-login"><a href="/nhom30/admin/home"><i
						class="fas fa-sign-in-alt"></i>Quản lý </a></li> -->
			</ul>
			<div class="show-mobile hidden-lg hidden-md">
				<div class="quick-user">
					<div class="quickaccess-toggle">
						<i class="fa fa-user"></i>
					</div>
					<div class="inner-toggle"></div>
				</div>
				<div class="quick-access">
					<div class="quickaccess-toggle">
						<i class="fas fa-list"></i>
					</div>
					<div class="inner-toggle">
						<ul class="links">
							<li><a id="mobile-wishlist-total" href="#" class="wishlist"><i
									class="far fa-edit"></i> Kiá»m tra ÄÆ¡n hÃ ng</a></li>
							<li><a href="#" class="shoppingcart"><i
									class="fas fa-shopping-cart"></i> Giá» hÃ ng</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>

	</div>
</section>
<section class="header-content clearfix">
	<div class="container">
		<div class="row">
			<div class="col-md-3 col-xs-12 col-sm-12 header-left text-center">
				<div class="logo">
					<a href="#" title=""> <img alt=""
						src="<c:url value='/static/img/logo.png' />"
						class="img-responsive">
					</a>
				</div>
			</div>
			<div class="col-md-8 col-xs-12 col-sm-12 header-right pull-right">


				<div style="float: right" class="search hidden-sm hidden-xs">
					<div class="input-cat form-search clearfix">
						<div class="form-search-controls">
							<input type="text" name="search" id="txtsearch"
								onblur="if(this.value==&#39;&#39;)this.value=&#39;Tìm kiếm...&#39;"
								onfocus="if(this.value==&#39;Tìm kiếm...&#39;)this.value=&#39;&#39;"
								value="Tìm kiếm...">

						</div>
						<button class="btn btn-search" title="Search" type="button"
							id="btnsearch" value="Search">
							<i class="fas fa-search"></i>
						</button>
					</div>
				</div>
				<div class="social-group"></div>
			</div>
		</div>
	</div>
</section>


<section class="navigation-menu clearfix">
	<div class="container">
		<div class="menu-top">
			<div class="row">
				<jsp:include page="../common/navbar.jsp"></jsp:include>
			</div>
		</div>
	</div>

</section>
<script type="text/javascript">
		$(document).ready(function () {
			var str = location.href.toLowerCase();
			$("ul.menu li a").each(function () {
				if (str.indexOf(this.href.toLowerCase()) >= 0) {
					$("ul.menu li").removeClass("active");
					$(this).parent().addClass("active");
				}
			});
		});
	</script>