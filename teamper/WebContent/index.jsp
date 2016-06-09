<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>메인화면</title>
<link href="../css/6-03.css" rel="stylesheet">    
<script src="../js/jquery-1.11.2.min.js"></script>
<script src="../js/6-03.js"></script>
</head>
<body>
<div class="tab_container">
    <ul class="tab_title">
        <li><a href="#tab1" class="selected">Introduce</a></li>
        <li><a href="#tab2">Notice</a></li>
    </ul>
    <ul class="tab_panel">
        <li id="tab1">
            <div class="tab_image"><img src="../images/team1.jpg" alt="" /></div>            
            <h2>소개</h2>
            <font face="맑은 고딕">
            <p> 안녕하세요. 저희 teamper프로그램은 대학생 또는 팀활동을 하는 사람들에게 간편하게<br>
           		팀활동 진행상황을 UI를 통해 쉽게 보고 비교하고 도와주는 웹서비스입니다.<br>
            	아직 1차로 작성한 private 임으로 많이 부족합니다. 추후 업데이트를 통해서 <br>
            	public까지 구현할 예정임으로 기대하여주세요.<p>
            </font>
        </li>
        <li id="tab2">
            <div class="tab_image"><img src="../images/team2.jpg" alt="" /></div>            
            <h2>공지</h2>
            <font face="맑은 고딕">
            <p> 현재 private 으로 1차 구축하였습니다 <br>
           		 추후 update를 통해 갱신할 예정입니다 <p>
           	</font>
        </li>
    </ul>
</div>
</body>
</html>