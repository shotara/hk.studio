<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<!-- Top Menu(상단고정) -->
<jsp:include page="jsp/header.jsp" flush="false" />
<!--/ Top Menu(상단고정) -->
</head>

<body>
	<!-- Content -->
	<!-- Page Header -->
	<div class="book-page-header-about">
		<div class="page-header book-page-header">
			<div class="container">
				<h1>

					Hellow! Teamper! <br/><br/> <small>Teamper의 기능과 Hk. Studio 식구를 소개합니다.</small>
				</h1>
			</div>
		</div>
	</div>
	<!--/ Page Header -->

	<div class="container">

		<!-- Custom styles for this template -->
		<!-- Carousel -->
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- Indicators -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
			</ol>
			<div class="carousel-inner" role="listbox">
				<div class="item active">
					<img src="../images/1234.jpg" alt="First slide">
					<div class="container">
						<div class="carousel-caption">
						</div>
					</div>
				</div>
				
				<div class="item">
					<img src="../images/154.jpg" alt="Second slide">
					<div class="container">
						<div class="carousel-caption">
						</div>
					</div>
				</div>
				<div class="item">
					<img src="../images/5678.jpg" alt="Third slide">
					<div class="container">
						<div class="carousel-caption">
						</div>
					</div>
				</div>
			</div>
			<a class="left carousel-control" href="#myCarousel" role="button"
				data-slide="prev"> <span
				class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				<span class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#myCarousel" role="button"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				<span class="sr-only">Next</span>
			</a>
		</div>
		<!-- /.carousel -->

		<h2>The Crew</h2>
		<div class="row">
			<div class="col-md-4">
				<img src="images/kimhyeonwoo.jpg"
					class="img-responsive img-thumbnail" alt="Responsive image">
				<h4>
					김현우<small>Developer</small>
				</h4>
				<p>홈페이지의 백앤드 및 테스트 담당.</p><br/>
			</div>
			<div class="col-md-4">
				<img src="images/hancheonghwa.jpg"
					class="img-responsive img-thumbnail" alt="Responsive image">
				<h4>
					한청화 <small>PM</small>
				</h4>
				<p>홈페이지의 프론트앤드 및 PM담당</p><br/>
			</div>
			<div class="col-md-4">
				<img src="images/kimsungmin.jpg"
					class="img-responsive img-thumbnail" alt="Responsive image">
				<h4>
					김성민 <small>Developer</small>
				</h4>
				<p>홈페이지의 프론트앤드 및 사업관리담당.</p><br/>

			</div>
		</div>
	</div>
	<!--/ Content -->

	<!-- Footer(하단 고정) -->
	<footer class="footer">
		<jsp:include page="jsp/footer.jsp" flush="false" />
	</footer>
	<!--/ Footer(하단 고정) -->

</body>
</html>