<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<%@ page isELIgnored="false"%>



<div class="container">
	<div class="row">

		<div class="col-md-12 ">
			<!--Begin-->
			<script>
				$('.owl-carousel').owlCarousel({
					loop : true,

					dots : false,
					items : 1,
					autoplay : true,
					pagination : false,
					slideSpeed : 1000,
					autoplayHoverPause : true,

					480 : {
						items : 1,
						dots : false,
						autoWidth : true,
					},
				});
			</script>
		</div>
	</div>
</div>
<div class="adv">
	<div class="container">
		<div class="row">
			<div class="col-md-12">

				<div class="owl-carousel owl-theme owl-loaded owl-drag"
					style="margin-top: 20px;">
					<div class="owl-stage-outer">
						<div class="owl-stage"
							style="transform: translate3d(-1179px, 0px, 0px); transition: all 0.25s ease 0s; width: 2000px;">
							<div class="owl-item cloned"
								style="width: 400px; margin-right: 10px;">
								<div class="item">
									<img alt="" class="img-responsive"
										src="<c:url value='/static/img/bn001.jpg' />">
								</div>
							</div>
							<div class="owl-item cloned"
								style="width: 400px; margin-right: 10px;">
								<div class="item">
									<img alt="" class="img-responsive"
										src="<c:url value='/static/img/bn002.jpg' />">
								</div>
							</div>
							<div class="owl-item cloned"
								style="width: 400px; margin-right: 10px;">
								<div class="item">
									<img alt="" class="img-responsive"
										src="<c:url value='/static/img/bn001.jpg' />">
								</div>
							</div>
							<div class="owl-item active"
								style="width: 400px; margin-right: 10px;">
								<div class="item">
									<img alt="" class="img-responsive"
										src="<c:url value='/static/img/bn006.jpg' />">
								</div>
							</div>
							<div class="owl-item active"
								style="width: 400px; margin-right: 10px;">
								<div class="item">
									<img alt="" class="img-responsive"
										src="<c:url value='/static/img/bn001.jpg' />">
								</div>
							</div>
							<div class="owl-item active"
								style="width: 400px; margin-right: 10px;">
								<div class="item">
									<img alt="" class="img-responsive"
										src="<c:url value='/static/img/bn002.jpg' />">
								</div>
							</div>
							<div class="owl-item active"
								style="width: 400px; margin-right: 10px;">
								<div class="item">
									<img alt="" class="img-responsive"
										src="<c:url value='/static/img/bn001.jpg' />">
								</div>
							</div>
							<div class="owl-item active"
								style="width: 400px; margin-right: 10px;">
								<div class="item">
									<img alt="" class="img-responsive"
										src="<c:url value='/static/img/bn006.jpg' />">
								</div>
							</div>
							<div class="owl-item active"
								style="width: 400px; margin-right: 10px;">
								<div class="item">
									<img alt="" class="img-responsive"
										src="<c:url value='/static/img/bn002.jpg' />">
								</div>
							</div>
						</div>
					</div>
					<div class="owl-nav disabled">
						<button type="button" role="presentation" class="owl-prev">
							<span aria-label="Previous">‹</span>
						</button>
						<button type="button" role="presentation" class="owl-next">
							<span aria-label="Next">›</span>
						</button>
					</div>
					<div class="owl-dots disabled"></div>
				</div>

				<script>
					$('.owl-carousel').owlCarousel({
						loop : true,

						dots : false,
						margin : 10,
						items : 3,
						autoplay : true,
						pagination : false,
						slideSpeed : 1000,
						autoplayHoverPause : true,
						itemsDesktop : [ 1200, 3 ],
						itemsDesktopSmall : [ 980, 3 ],
						itemsTablet : [ 767, 1 ],
						itemsMobile : [ 480, 1 ],
					})
				</script>
			</div>
		</div>
	</div>
</div>

