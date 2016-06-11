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

	<!-- content() -->
	<!-- 로그인 안했을 경우 -->
	<c:if test="${empty sessionScope.tpMemberNo}">
		<script>
			alert("먼저 회원가입을 해주세요!")
			location.href = "/jsp/member/join.jsp";
		</script>
	</c:if>

	<!-- 로그인 했을경우 -->
	<c:if test="${not empty sessionScope.tpMemberNo}">
		<!-- 팀이 없을경우 -->
		<p align="center">팀이 없습니다. 팀을 만들어주세요</p>
		<center>
			<button type="button" class="btn btn-primary"
				onclick="location.href='/jsp/team/addTeam.jsp'">팀만들기</button>
		</center>

		<div style="margin-left: 430px;">

			<button type="button" class="btn btn-primary"
				onclick="location.href='/jsp/team/addTeamBar.jsp'">일감 입력하기</button>

			<br></br> <label class="control-label " for="name"> 사업계획서 </label>
			<div>
				<div class="progress" style="width: 300px"
					onclick="window.location = 'addTeamBarDetail.jsp'">
					<div class="progress-bar progress-bar-info" role="progressbar"
						aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"
						style="width: 28%">28%</div>
				</div>
				<div class="form-group">
					<label for="sel1">김성민</label>
					<div class="checkbox">
						<label><input type="checkbox" value="">산출물계획</label>
					</div>
					<div class="checkbox">
						<label><input type="checkbox" value="">일정계획</label>
					</div>

				</div>
				<div class="form-group">
					<label for="sel1">김현우</label>
					<div class="checkbox">
						<label><input type="checkbox" value="">현황보고 및 업무
							범위</label>
					</div>
					<div class="checkbox">
						<label><input type="checkbox" value="" checked>프로젝트
							소요예산</label>
					</div>

				</div>
				<div class="form-group">
					<label for="sel1">한청화</label>
					<div class="checkbox">
						<label><input type="checkbox" value="">사업개요</label>
					</div>
					<div class="checkbox">
						<label><input type="checkbox" value="">사업 추진 방안</label>
					</div>
					<div class="checkbox disabled">
						<label><input type="checkbox" checked>사업계획 요약서</label>
					</div>
				</div>
			</div>

			<br></br>
			<label class="control-label " for="name"> 요구사항분석 </label>
			<div>
				<div class="progress" style="width: 300px"
					onclick="window.location = 'addTeamBarDetail.jsp'">
					<div class="progress-bar progress-bar-info" role="progressbar"
						aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"
						style="width: 50%">50%</div>
				</div>
				<div class="form-group">
					<label for="sel1">김성민</label>
					<div class="checkbox">
						<label><input type="checkbox" value="" checked>유저스토리
							워크샵</label>
					</div>
					<div class="checkbox">
						<label><input type="checkbox" value="">비기능적 요구사항</label>
					</div>

				</div>
				<div class="form-group">
					<label for="sel1">김현우</label>
					<div class="checkbox">
						<label><input type="checkbox" value="" checked>유저스토리
							워크샵</label>
					</div>
					<div class="checkbox">
						<label><input type="checkbox" value="">Class
							Diagram</label>
					</div>

				</div>
				<div class="form-group">
					<label for="sel1">한청화</label>
					<div class="checkbox">
						<label><input type="checkbox" value="" checked>유저스토리
							워크샵</label>
					</div>
					<div class="checkbox">
						<label><input type="checkbox" value="">DFD</label>
					</div>
				</div>
				<div></div>

			</div>
		</div>
	</c:if>
	<footer class="footer">
		<jsp:include page="../footer.jsp" flush="false" />
	</footer>
	<!--/ Footer(하단 고정) -->
</body>
</html>