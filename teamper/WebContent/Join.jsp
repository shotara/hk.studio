<%@ page contentType="text/html; charset=euc-kr"%>

<html>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/join.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

<head>
<title>회원가입</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script language="JavaScript">
 
function checkIt() {
	
	var userinput = eval("document.userinput");

	if(userinput.inputMemberPassword.value != userinput.inputMemberPasswordConfirm.value)
	{
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
   
<form method="post" class="form-signin" action="joinMember" name="userinput" onSubmit="return checkIt()">

        <h2 class="form-signin-heading" >Teamper 회원가입</h2>
        
        <input type="email" name="inputMemberEmail" class="form-control" placeholder="아이디(이메일주소)" required autofocus>
        
        <!--  <button class="btn btn-xs btn-primary btn-block"  OnClick="openConfirmid(this.form)">ID중복확인</button>-->
        
        <input type="password" name="inputMemberPassword"  class="form-control" placeholder="비밀번호" required>
        
        <input type="password" name="inputMemberPasswordConfirm" class="form-control" placeholder="비밀번호 확인"  required>
     
        <input type="text" name="inputMemberName" class="form-control" placeholder="이름" required>
        
        <input type="text" name="inputMemberIntro" class="form-control" placeholder="자기소개" >
        
        <input type="text" name="inputMemberTimeTable1" class="form-control" placeholder="시간표입력    월           예시: 09~10;11~12" >
         
        <input type="text" name="inputMemberTimeTable2" class="form-control" placeholder="                      화 " >
          
        <input type="text" name="inputMemberTimeTable3" class="form-control" placeholder="                      수 " >
         
        <input type="text" name="inputMemberTimeTable4" class="form-control" placeholder="                      목" >
           
        <input type="text" name="inputMemberTimeTable5" class="form-control" placeholder="                      금 " >
      
     
        <button class="btn  btn-primary btn-block" type="submit" >회원가입</button>
        <button class="btn  btn-primary btn-block" type="reset" >다시입력</button>
        <button class="btn  btn-primary btn-block"  onclick="javascript:window.location='index.jsp'">돌아가기</button>
</form>


</body>
</html>