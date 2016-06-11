var Member = {};

Member.Join = function() {

	// 1 입력폼 체크
	if(!validateEmail($("#joinMemberEmail").val())) {
		alert("올바른 이메일 주소가 아닙니다.");
		return false;
	}
		
	if($("#joinMemberPassword").val() == "") {
		alert("비밀번호를 입력하세요.");
		return false;
	}
	
	if($("#joinMemberPasswordConfirm").val() == "") {
		alert("비밀번호 확인을 입력해주세요.");
		return false;
	}
		
	if($("#joinMemberName").val() == "") {
		alert("이름을 입력해주세요.");
		return false;
	}
	
	var action = "/member?action=joinMember";
	var form_data = {
		inputMemberEmail : $("#joinMemberEmail").val(),
		inputMemberPassword : $("#joinMemberPassword").val(),
		inputMemberPasswordConfirm : $("#joinMemberPasswordConfirm").val(),
		inputMemberName : $("#joinMemberName").val(),
		inputMemberIntro : $("#joinMemberIntro").val(),
		inputMemberTimeTable1 : $("#joinMemberTimeTable1").val(),
		inputMemberTimeTable2 : $("#joinMemberTimeTable2").val(),
		inputMemberTimeTable3 : $("#joinMemberTimeTable3").val(),
		inputMemberTimeTable4 : $("#joinMemberTimeTable4").val(),
		inputMemberTimeTable5 : $("#joinMemberTimeTable5").val()
	};
	
	$.ajax({
		type : "POST",
		url : action,
		data : form_data,
		dataType : "json",
		async: false,
		success: function(response) {
			if(response.outputResult == "1") {
				alert("회원가입 했습니다.");
				location.href = "/";
			} else {
				alert("등록되지 않은 이메일이거나,\n이메일 또는 비밀번호를 잘못 입력하셨습니다.");
			}

		}, error: function(xhr,status,error) {

		}
	});

	return false;
}

Member.login = function() {

	// 1 입력폼 체크
	if(!validateEmail($("#inputMemberEmail").val())) {
		alert("올바른 이메일 주소가 아닙니다.");
		return false;
	}
		
	if($("#inputMemberPassword").val() == "") {
		alert("비밀번호를 입력하세요.");
		return false;
	}

	var action = "/member?action=loginMember";
	var form_data = {
		inputMemberEmail : $("#inputMemberEmail").val(),
		inputMemberPassword : $("#inputMemberPassword").val()
	};
	
	$.ajax({
		type : "POST",
		url : action,
		data : form_data,
		dataType : "json",
		async: false,
		success: function(response) {
			if(response.outputResult == "1") {
				location.href = "/";
			} else {
				alert("등록되지 않은 이메일이거나,\n이메일 또는 비밀번호를 잘못 입력하셨습니다.");
			}

		}, error: function(xhr,status,error) {

		}
	});

	return false;
}

Member.LogOut = function() {
	
	var action = "/member?action=logoutMember";
	
	$.ajax({
		type : "POST",
		url : action,
		dataType : "text",
		async: false,
		success: function(response) {
			if(response == "LogoutOK") {
				alert("정상적으로 로그아웃 되었습니다.");
				location.reload(true);
			} else {
				alert("알 수 없는 에러가 발생하였습니다.");
			}
		}, error: function(xhr,status,error) {
			alert(error);
		}
	});
}

function validateEmail(email) {
	var regex=/^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/;   
	  
	if(regex.test(email) === false) {
	    return false;  
	} else {
		return true;
	}  
}