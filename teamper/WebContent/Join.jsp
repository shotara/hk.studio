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
<title>ȸ������</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script language="JavaScript">
 
function checkIt() {
	
	var userinput = eval("document.userinput");

	if(userinput.inputMemberPassword.value != userinput.inputMemberPasswordConfirm.value)
	{
		alert("��й�ȣ�� �����ϰ� �Է��ϼ���");
		return false;
	}

}
   
// ���̵� �ߺ� ���θ� �Ǵ�
/*
function openConfirmid(userinput) {

// url�� ����� �Է� id�� �����մϴ�.
	url = "confirmID.jsp?id=" + userinput.id.value ;
 
// ���ο� �����츦 ���ϴ�.
	open(url, "confirm",
	"toolbar=no, location=no,status=no,menubar=no,scrollbars=no,resizable=no,width=300, height=200");
}
*/
</script>
   
   
<body>
   
<form method="post" class="form-signin" action="joinMember" name="userinput" onSubmit="return checkIt()">

        <h2 class="form-signin-heading" >Teamper ȸ������</h2>
        
        <input type="email" name="inputMemberEmail" class="form-control" placeholder="���̵�(�̸����ּ�)" required autofocus>
        
        <!--  <button class="btn btn-xs btn-primary btn-block"  OnClick="openConfirmid(this.form)">ID�ߺ�Ȯ��</button>-->
        
        <input type="password" name="inputMemberPassword"  class="form-control" placeholder="��й�ȣ" required>
        
        <input type="password" name="inputMemberPasswordConfirm" class="form-control" placeholder="��й�ȣ Ȯ��"  required>
     
        <input type="text" name="inputMemberName" class="form-control" placeholder="�̸�" required>
        
        <input type="text" name="inputMemberIntro" class="form-control" placeholder="�ڱ�Ұ�" >
        
        <input type="text" name="inputMemberTimeTable1" class="form-control" placeholder="�ð�ǥ�Է�    ��           ����: 09~10;11~12" >
         
        <input type="text" name="inputMemberTimeTable2" class="form-control" placeholder="                      ȭ " >
          
        <input type="text" name="inputMemberTimeTable3" class="form-control" placeholder="                      �� " >
         
        <input type="text" name="inputMemberTimeTable4" class="form-control" placeholder="                      ��" >
           
        <input type="text" name="inputMemberTimeTable5" class="form-control" placeholder="                      �� " >
      
     
        <button class="btn  btn-primary btn-block" type="submit" >ȸ������</button>
        <button class="btn  btn-primary btn-block" type="reset" >�ٽ��Է�</button>
        <button class="btn  btn-primary btn-block"  onclick="javascript:window.location='index.jsp'">���ư���</button>
</form>


</body>
</html>