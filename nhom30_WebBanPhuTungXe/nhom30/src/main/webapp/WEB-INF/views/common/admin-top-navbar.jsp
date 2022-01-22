<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<div class="top_nav">
	<div class="nav_menu">
		<ul class=" navbar-right">
			<li class="nav-item dropdown open" style="padding-left: 15px;">

				<security:authorize access="isAuthenticated()">
					<security:authentication property="principal" var="user" />
					<li class="account-login"><a class="btn btn-primary"
						href="/nhom30/auth/logout"><i
							style="font-size: 20px; color: lightblue; text-shadow: 2px 2px 10px;"
							class="fa fa-sign-out pull-right"></i></a></li>
				</security:authorize>


			</li>
		</ul>
	</div>
</div>