<%@ page contentType="text/html; charset=utf-8"%>

<html>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">
<head>
<title>회원가입</title>
<jsp:include page="../../jsp/header.jsp" flush="false" />
<script language="JavaScript">
	function checkIt() {

		var userinput = eval("document.userinput");

		if (userinput.inputMemberPassword.value != userinput.inputMemberPasswordConfirm.value) {
			alert("비밀번호를 동일하게 입력하세요");
			return false;
		}

	}

	// 아이디 중복 여부를 판단
	/*
	 function openConfirmid(userinput) {

	 // url과 사용자 입력 id를 조합합니다.
	 url = "confirmID.jsp?id=" + userinput.id.value ;
	
	 // 새로운 윈도우를 엽니다.
	 open(url, "confirm",
	 "toolbar=no, location=no,status=no,menubar=no,scrollbars=no,resizable=no,width=300, height=200");
	 }
	 */
</script>
<body>
	<div aligin="center">
		<form method="post" class="form-signin" action="joinMember"
			name="userinput" onSubmit="return checkIt()">

			<h2 class="form-signin-heading">Teamper 회원가입</h2>

			<input type="email" id="joinMemberEmail" class="form-control"
				placeholder="아이디(이메일주소)" required autofocus>

			<!--  <button class="btn btn-xs btn-primary btn-block"  OnClick="openConfirmid(this.form)">ID중복확인</button>-->

			<input type="password" id="joinMemberPassword" class="form-control" placeholder="비밀번호" required>
			<input type="password" id="joinMemberPasswordConfirm" class="form-control" placeholder="비밀번호 확인" required> 
			<input type="text" id="joinMemberName" class="form-control" placeholder="이름" required> 
			<input type="text" id="joinMemberIntro" class="form-control" placeholder="자기소개">
			<input type="text" id="joinMemberTimeTable1" class="form-control" placeholder="시간표입력    월           예시: 09~10;11~12">
			<input type="text" id="joinMemberTimeTable2" class="form-control" placeholder="                      화 "> 
			<input type="text" id="joinMemberTimeTable3" class="form-control" placeholder="                      수 "> 
			<input type="text" id="joinMemberTimeTable4" class="form-control" placeholder="                      목"> 
			<input type="text" id="joinMemberTimeTable5" class="form-control" placeholder="                      금 ">

			<button class="btn  btn-primary btn-block" type="button" onclick="Member.Join()">회원가입</button>
			<button class="btn  btn-primary btn-block" type="reset">다시입력</button>
			<button class="btn  btn-primary btn-block" onclick="javascript:window.location='/index.jsp'">돌아가기</button>
		</form>

	</div>
</body>
</html>