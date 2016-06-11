<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="../header.jsp" flush="false" />

</head>
<body>

<p align="center">팀이 없습니다. 팀을 만들어주세요</p>
<center><button type="button" class="btn btn-primary" onclick="location.href='/jsp/team/addTeam.jsp'">팀만들기</button></center>
 <!-- content() -->

	<!-- Footer(하단 고정) -->
	<footer class="footer">
		<jsp:include page="../footer.jsp" flush="false" />
	</footer>
	<!--/ Footer(하단 고정) -->
</body>
</html>