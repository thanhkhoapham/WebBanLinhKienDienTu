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

			<!-- page content -->
			<div class="right_col" role="main" style="min-height: 707px;">
				<div class="">
					<div class="page-title">Danh sách loại sản phẩm</div>


					<div style="padding-top: 1.5em" class="row">
						<div class="col-md-12 col-sm-12 ">
							<div class="x_panel">
								<div class="x_title"></div>
								<div class="x_content">
									<div class="row">
										<div class="col-sm-12">
											<div class="card-box table-responsive">

												<div id="datatable_wrapper"
													class="dataTables_wrapper container-fluid dt-bootstrap no-footer">
													<div class="row">
														<div class="col-sm-12">
															<div id="datatable_wrapper"
																class="dataTables_wrapper container-fluid dt-bootstrap no-footer">
																<div class="row">
																	<div class="col-sm-6">
																		<a href="add" class="btn btn-primary" role="button">Thêm</a>
																	</div>
																	<div class="col-sm-6">
																		<div id="datatable_filter" class="dataTables_filter">
																			<label style="float: right">Search:<input
																				type="search" class="form-control input-sm"
																				placeholder="" aria-controls="datatable">
																			</label>
																		</div>
																	</div>
																</div>
																<div class="row">
																	<div class="col-sm-12">
																		<table id="datatable"
																			class="table table-striped table-bordered dataTable no-footer"
																			style="width: 100%;" role="grid"
																			aria-describedby="datatable_info">
																			<thead>
																				<tr role="row">
																					<th class="sorting_asc" tabindex="0"
																						aria-controls="datatable" rowspan="1" colspan="1"
																						style="width: 20px;">STT</th>
																					<th class="sorting" tabindex="0"
																						aria-controls="datatable" rowspan="1" colspan="1"
																						style="width: 250px;">Tên loại sản phẩm</th>
																					<th class="sorting" tabindex="0"
																						aria-controls="datatable" rowspan="1" colspan="1"
																						style="width: 30px;">Thao tác</th>
																				</tr>
																			</thead>
																			<tbody>
																				<c:forEach items="${list}" var="loaiSp"
																					varStatus="lop">
																					<tr role="row" class="odd">
																						<td>${lop.index+1}</td>
																						<td>${loaiSp.tenLoaiSp}</td>
																						<td><a style="font-size: 1.5em; color: red"
																							href="delete/${loaiSp.maLoaiSp}"><i
																								class="fa fa-close"></i></a>&nbsp;&nbsp;&nbsp;&nbsp;
																							<a style="font-size: 1.5em; color: blue"
																							href="edit/${loaiSp.maLoaiSp}"><i
																								class="fa fa-refresh fa-spin"></i></a></td>
																					</tr>
																				</c:forEach>
																			</tbody>
																		</table>
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
							</div>
						</div>
					</div>
				</div>
				<!-- /page content -->

				<!-- footer content -->
				<div class=footer>
					<jsp:include page="../common/admin-footer.jsp"></jsp:include>
				</div>
				<!-- /footer content -->
			</div>
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