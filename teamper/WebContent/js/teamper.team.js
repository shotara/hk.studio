var Team = {};

Team.AddTeam = function() {

	// 1 입력폼 체크
	if($("#inputTeamName").val() =="") {
		alert("팀명을 입력해주세요.");
		return false;
	}
		
	if($("#inputTeamInfo").val() == "") {
		alert("팀소개를 입력해주세요.");
		return false;
	}
	
	var action = "/team?action=addTeam";
	var form_data = {
		inputTeamName :  $("#inputTeamName").val(),
		inputTeamInfo : $("#inputTeamInfo").val()
	};
	
	$.ajax({
		type : "POST",
		url : action,
		data : form_data,
		dataType : "json",
		async: false,
		success: function(response) {
			if(response.outputResult == "1") {
				alert("팀이 생성되었습니다..");
				location.href = "/jsp/team/teamView.jsp";
				
			} else if(response.outputResult =="-1") {
				alert("팀명이나 팀소개가 입력되지 않았습니다.");
			} else {
				alert("알수없는 문제가 생겼습니다.");
			}

		}, error: function(xhr,status,error) {

		}
	});

	return false;
}

Team.AddTeamBar = function() {

	
	var action = "/team?action=addTeamBar";
	var form_data = {
		inputTeamName :  $("#InputTeamBarName").val(),
		inputTeamInfo : $("#InputTeamBarSize").val()
	};
	
	$.ajax({
		type : "POST",
		url : action,
		data : form_data,
		dataType : "json",
		async: false,
		success: function(response) {
			if(response.outputResult == "1") {
				alert("일감 생성되었습니다..");
				location.href = "/jsp/team/teamView.jsp";
				
			} else if(response.outputResult =="-1") {
				alert("일감 또는 일감사이즈가 입력되지 않았습니다.");
			} else {
				alert("알수없는 문제가 생겼습니다.");
			}

		}, error: function(xhr,status,error) {

		}
	});

	return false;
}


Team.AddTeamBarDetail = function() {

	
	var action = "/team?action=addTeamBar";
	var form_data = {
		inputTeamName :  $("#InputTeamBarName").val(),
		inputTeamInfo : $("#InputTeamBarSize").val()
	};
	
	$.ajax({
		type : "POST",
		url : action,
		data : form_data,
		dataType : "json",
		async: false,
		success: function(response) {
			if(response.outputResult == "1") {
				alert("일감 생성되었습니다..");
				location.href = "/jsp/team/teamView.jsp";
				
			} else if(response.outputResult =="-1") {
				alert("일감 또는 일감사이즈가 입력되지 않았습니다.");
			} else {
				alert("알수없는 문제가 생겼습니다.");
			}

		}, error: function(xhr,status,error) {

		}
	});

	return false;
}