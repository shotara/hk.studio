<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Site Template</title>
<!-- Bootstrap core CSS & JavaScript -->
<link href="../css/bootstrap.min.css" rel="stylesheet">
<link href="../css/6-03.css" rel="stylesheet">   
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="../js/jquery-1.11.2.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
<script src="../js/6-03.js"></script>
<!-- Footer Custom style -->
<link href="../css/sticky-footer-navbar.css" rel="stylesheet">
<!-- 예제에서 사용하기 위해 정의한 CSS -->
<link href="../css/style.css" rel="stylesheet">
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
			<button type="button" class="btn btn-success">join us</button>
          </form>
      

        </div>
    </div>
</nav>
<!--/ Top Menu(상단고정) -->
 
 

 
 <!-- content -->
 <!-- Page Header -->    
<div class="book-page-header-about">
	<div class="page-header book-page-header">
		<div class="container">
			<h1>
			
				Notice <br> <small>공지사항을 알려드립니다.</small>
			</h1>
		</div>
	</div>
</div>
<!--/ Page Header -->
 			<center>
            <div class="tab_image"><img src="../images/team1.jpg" alt="" vspace=40/></div>            
            <h2>&nbsp;&nbsp;공지사항</h2>
            <p>&nbsp;&nbsp;&nbsp;1차 구축을 하였습니다<br>
            &nbsp;&nbsp;&nbsp;private 으로 팀이 구성되있는 상태를 전제로 기능을 구현합니다.<br>
            &nbsp;&nbsp;&nbsp;추후 public까지 구현하여 서비스를 제공할 예정입니다.</p>
       </center>
<!--  content 끝 -->


<!-- Footer(하단 고정) -->    
<footer class="footer">
	<div class="container">
		<p class="text-muted">&copy; COPYRIGHT 2016 Teamper</p>
	</div>
</footer>
<!--/ Footer(하단 고정) -->        

</body>
</html>