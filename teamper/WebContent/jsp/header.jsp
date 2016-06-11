<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<% request.setCharacterEncoding("utf-8");%>

<!-- Bootstrap core CSS & JavaScript -->
<link href="/css/6-01.css" rel="stylesheet">
<link href="/css/6-03.css" rel="stylesheet">
<link href="/css/bootstrap.css" rel="stylesheet">
<link href="/css/bootstrap.min.css" rel="stylesheet">
<link href="/css/bootstrap-iso.css" rel="stylesheet">
<link href="/css/bootstrap-theme.css" rel="stylesheet">
<link href="/css/bootstrap-theme.min.css" rel="stylesheet">
<link href="/css/carousel.css" rel="stylesheet">
<link href="/css/ie10-viewport-bug-workaround.css" rel="stylesheet">
<link href="/css/join.css" rel="stylesheet">
<link href="/css/jumbotron.css" rel="stylesheet">
<link href="/css/sticky-footer-navbar.css" rel="stylesheet">
<link href="/css/style.css" rel="stylesheet">
<link href="/css/theme.css" rel="stylesheet">

<script src="/js/6-03.js"></script>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/ie-emulation-modes-warning.js"></script>
<script src="/js/jquery-1.11.2.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>

<!-- Top Menu() -->
<nav class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/">Teamper</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
<% String id = "";

id = (String)session.getAttribute("id");            // request에서 id 파라미터를 가져온다

if(id==null){                            // id가 Null 이거나 없을 경우
%>
                <li class="active"><a href="/jsp/team/noTeam.jsp">Team</a></li>
                <li><a href="/jsp/tab/notice.jsp">Notice</a></li>
            </ul>

          <form class="navbar-form navbar-right">
            <div class="form-group">
              <input type="text" placeholder="Email" class="form-control">
            </div>
            <div class="form-group">
              <input type="password" placeholder="Password" class="form-control">
            </div>
            <button type="submit" class="btn btn-success">Sign in</button>
			<button type="button" class="btn btn-success" onclick="location.href='/jsp/member/Join.jsp'">join us</button>
          </form>
<%} %>         
          
<%if(id!=null){                            // id가 Null 이거나 없을 경우
%>          
   				<li class="active"><a href="/jsp/team/teamView.jsp">Team</a></li>
                <li><a href="/jsp/tab/notice.jsp">Notice</a></li>
            </ul>
<%} %>
          
     <!--로그인 끝-->
        </div>
    </div>
</nav>

