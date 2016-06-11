<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="../header.jsp" flush="false" />
<link href="/css/timetableView.css" rel="stylesheet">
</head>
<body>
	<jsp:include page="timetableView.jsp" flush="false" />
	
	
	
	
<left><button type="button" class="btn btn-primary" onclick="location.href='/jsp/team/addTeamBar.jsp'">일감 입력하기</button></left>

	<div class="progress" style="width: 300px"onclick="window.location = 'addTeamBarDetail.jsp'" >
			<div class="progress-bar progress-bar-info" role="progressbar"
				aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"
				style="width: 20%" >20%</div>
		</div>
	<!-- 
<label class="control-label " for="name"> 일감1(단계 제목) </label>
		<div class="progress" style="width: 300px">
			<div class="progress-bar progress-bar-info" role="progressbar"
				aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"
				style="width: 20%">20%</div>
		</div>
		<div class="form-group">
			<label for="sel1">담당자 1</label>
			<div class="checkbox">
				<label><input type="checkbox" value="">일감세부 1</label>
			</div>
			<div class="checkbox">
				<label><input type="checkbox" value="">일감세부 2</label>
			</div>
			<div class="checkbox disabled">
				<label><input type="checkbox">일감세부 3</label>
			</div>
		</div>
		<div class="form-group">
			<label for="sel1">담당자 2</label>
			<div class="checkbox">
				<label><input type="checkbox" value="">일감세부 1</label>
			</div>
			<div class="checkbox">
				<label><input type="checkbox" value="">일감세부 2</label>
			</div>
			<div class="checkbox disabled">
				<label><input type="checkbox">일감세부 3</label>
			</div>
		</div>

	 -->
		
			<footer class="footer">
		<jsp:include page="../footer.jsp" flush="false" />
	</footer>
	<!--/ Footer(하단 고정) -->
</body>
</html>