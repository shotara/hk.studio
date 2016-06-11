<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="../header.jsp" flush="false" />

</head>
<body>

<p align="center">일감이 없습니다. 일감을 입력해주세요.</p>
<center><button type="button" class="btn btn-primary" onclick="location.href='/jsp/team/addTeamBar.jsp'">일감 입력하기</button></center>
 <!-- content() -->

	<!-- Footer(하단 고정) -->
	<footer class="footer">
		<jsp:include page="../footer.jsp" flush="false" />
	</footer>
	<!--/ Footer(하단 고정) -->
</body>
</html>