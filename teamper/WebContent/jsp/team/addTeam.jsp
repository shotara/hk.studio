<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!-- Special version of Bootstrap that only affects content wrapped in .bootstrap-iso -->
<jsp:include page="../../jsp/header.jsp" flush="false" />
<!-- Inline CSS based on choices in "Settings" tab -->
<style>
.bootstrap-iso .formden_header h2, .bootstrap-iso .formden_header p,
	.bootstrap-iso form {
	font-family: Arial, Helvetica, sans-serif;
	color: black
}

.bootstrap-iso form button, .bootstrap-iso form button:hover {
	color: white !important;
}

.asteriskField {
	color: red;
}
</style>

<title>Teamper - 팀생성</title>
</head>
<body>
	<!-- HTML Form (wrapped in a .bootstrap-iso div) -->
	<div class="bootstrap-iso">
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-6 col-sm-6 col-xs-12">
					<div class="formden_header">
						<h2>팀 생성</h2>
						<p>팀장이 팀을 생성합니다.</p>
					</div>
					<form method="post">
						<div class="form-group ">
							<label class="control-label "> Team Name </label> 
							<input class="form-control" id="inputTeamName" type="text" />
						</div>
						<div class="form-group ">
							<label class="control-label"> Team Information </label>
							<textarea class="form-control" cols="40" id="inputTeamInfo"
								rows="10"></textarea>
						</div>
						<div class="form-group">
							<div>
								<button class="btn btn-primary " type="button" onclick="Team.AddTeam()">완료</button>
								<button type="button" class="btn btn-primary" onclick="location.href='/jsp/team/noTeam.jsp'">돌아가기</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>