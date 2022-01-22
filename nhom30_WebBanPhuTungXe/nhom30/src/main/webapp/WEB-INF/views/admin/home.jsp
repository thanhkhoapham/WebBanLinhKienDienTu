<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en" class=" ">
<head>
<jsp:include page="../common/admin-linkCss.jsp"></jsp:include>
<body class="nav-md">
	<div class="container body">
		<div class="main_container">
			<!-- navigation -->
			<jsp:include page="../common/admin-navbar.jsp"></jsp:include>
			<jsp:include page="../common/admin-top-navbar.jsp"></jsp:include>
			<!--navigation -->

			<!-- page content -->
			<div class="right_col" role="main" style="min-height: 728px;">
				<!-- top tiles -->
				<div class="background">
					<h2>Helloooo</h2>
				</div>
				<!-- /top tiles -->
				<br>
			</div>
			<!-- /page content -->


			<!-- footer content -->
			<footer>
				<jsp:include page="../common/admin-footer.jsp"></jsp:include>
			</footer>
			<!-- /footer content -->
		</div>
	</div>
</body>
</html>