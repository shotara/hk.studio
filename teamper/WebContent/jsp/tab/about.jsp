<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Site Template</title>
<!-- Bootstrap core CSS & JavaScript -->
<link href="../../css/bootstrap.min.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="../../js/bootstrap.min.js"></script>
<!-- Footer Custom style -->
<link href="../../css/sticky-footer-navbar.css" rel="stylesheet">
<!-- 예제에서 사용하기 위해 정의한 CSS -->
<link href="../../css/style.css" rel="stylesheet">
</head>
<body>

<!-- Top Menu(상단고정) -->
<nav class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Teamper</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
            	<li class="active"><a href="../team/teamView.jsp">Team</a></li>
                <li class="active"><a href="about.jsp">Introduce</a></li>
                <li><a href="notice.jsp">Notice</a></li>
            </ul>

    
          <form class="navbar-form navbar-right">
            <div class="form-group">
              <input type="text" placeholder="Email" class="form-control">
            </div>
            <div class="form-group">
              <input type="password" placeholder="Password" class="form-control">
            </div>
            <button type="submit" class="btn btn-success">Sign in</button>
			<button type="button" class="btn btn-success" onclick="location.href='../member/Join.jsp'">join us</button>
          </form>
      

        </div>
    </div>
</nav>
<!--/ Top Menu(상단고정) -->
 
 
<!-- Content -->
<!-- Page Header -->    
<div class="book-page-header-about">
	<div class="page-header book-page-header">
		<div class="container">
			<h1>
			
				About <br> <small>Teamper의 기능과 직원을 소개합니다.</small>
			</h1>
		</div>
	</div>
</div>
<!--/ Page Header -->

<div class="container">

    <!-- Custom styles for this template -->
    <link href="css/carousel.css" rel="stylesheet">
    
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
				<img src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="First slide">
				<div class="container">
					<div class="carousel-caption">
						<h1>시간표 대조</h1>
						<p>
						<font face="맑은 고딕">
						팀퍼를 통하여 팀원들의 시간표를 대조하여
						최적의 팀플활동 시간을 제시합니다.
						</font>
						</p>
					</div>
				</div>
			</div>
			<div class="item">
				<img src="data:image/gif;base64,R0lGODlhAQABAIAAAGZmZgAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="Second slide">
				<div class="container">
					<div class="carousel-caption">
						<h1>진행사항 파악</h1>
						<p>
						팀 활동의 진행사항을 UI를 통하여 손쉽게
						확인하고 진행율을 확인 할 수 있습니다.
						</p>
					</div>
				</div>
			</div>
			<div class="item">
				<img src="data:image/gif;base64,R0lGODlhAQABAIAAAFVVVQAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" alt="Third slide">
				<div class="container">
					<div class="carousel-caption">
						<h1>팀구하기</h1>
						<p>
						2차 구축시, 더 나아가서는 팀을 오프라인 상으로
						구하고 초대 하여 좀 더 나은 팀을 꾸릴 수 있습니다.
						</p>
					</div>
				</div>
			</div>
		</div>
		<a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"
			aria-hidden="true"></span> <span class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next"> <span class="glyphicon glyphicon-chevron-right"
			aria-hidden="true"></span> <span class="sr-only">Next</span>
		</a>
	</div>
	<!-- /.carousel -->

	<h2>The Crew</h2>
	<div class="row">
		<div class="col-md-4">
			<img src="../../images/kimhyeonwoo.jpg" class="img-responsive img-thumbnail" alt="Responsive image">
			<h4>
				김현우<small>Developer</small>
			</h4>
			<p>홈페이지의 백앤드 및 테스트 담당. </p>
			</div>
		<div class="col-md-4">	
			<img src="../../images/hancheonghwa.jpg" class="img-responsive img-thumbnail" alt="Responsive image">
			<h4>
				한청화 <small>PM</small>
			</h4>
			<p>홈페이지의 프론트앤드 및 PM담당</p>
		</div>
		<div class="col-md-4">	
			<img src="../../images/kimsungmin.jpg" class="img-responsive img-thumbnail" alt="Responsive image">
			<h4>
				김성민 <small>Developer</small>
			</h4>
			<p>홈페이지의 프론트앤드 및 사업관리담당.</p>
			
		</div>

		
	</div>

</div>    
<!--/ Content -->

<!-- Footer(하단 고정) -->    
<footer class="footer">
	<div class="container">
		<p class="text-muted">&copy; COPYRIGHT 2016 Teamper</p>
	</div>
</footer>
<!--/ Footer(하단 고정) -->        

</body>
</html>