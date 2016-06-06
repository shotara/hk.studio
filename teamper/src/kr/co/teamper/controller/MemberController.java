package kr.co.teamper.controller;

import java.io.File;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import kr.co.teamper.model.MemberDAO;
import kr.co.teamper.model.domain.Member;
import kr.co.teamper.util.EncryptUtil;

public class MemberController {

	// 회원가입
	public static void joinMember(HttpServletRequest req, HttpServletResponse res) {

		try {
			
			String inputMemberEmail = req.getParameter("inputMemberEmail") != null ? req.getParameter("inputMemberEmail").toString() : "";
			String inputMemberPassword = req.getParameter("inputMemberPassword") != null ? req.getParameter("inputMemberPassword").toString() : "";
			String inputMemberPasswordConfirm = req.getParameter("inputMemberPasswordConfirm") != null ? req.getParameter("inputMemberPasswordConfirm").toString() : "";
			String encryptMemberPassword = EncryptUtil.testMD5(inputMemberPassword);
			String inputMemberName = req.getParameter("inputMemberName") != null ? req.getParameter("inputMemberName").toString() : "";
			String inputMemberIntro = req.getParameter("inputMemberIntro") != null ? req.getParameter("inputMemberIntro").toString() : "";
			String inputMemberTimeTable1 = req.getParameter("inputMemberTimeTable1")!= null ? req.getParameter("inputMemberTimeTable1").toString() : "";
			String inputMemberTimeTable2 = req.getParameter("inputMemberTimeTable1")!= null ? req.getParameter("inputMemberTimeTable2").toString() : "";
			String inputMemberTimeTable3 = req.getParameter("inputMemberTimeTable1")!= null ? req.getParameter("inputMemberTimeTable3").toString() : "";
			String inputMemberTimeTable4 = req.getParameter("inputMemberTimeTable1")!= null ? req.getParameter("inputMemberTimeTable4").toString() : "";
			String inputMemberTimeTable5 = req.getParameter("inputMemberTimeTable1")!= null ? req.getParameter("inputMemberTimeTable5").toString() : "";
			long inputCurrentTime = System.currentTimeMillis()/1000;
			
			//필수입력 체크
			if(inputMemberEmail.equals("")||inputMemberPassword.equals("")){
				System.out.println("필수입력란 미입력.");	
				return;
			}
			
			// 이메일 중복여부 체크
			Member checkMember = MemberDAO.getMember(inputMemberEmail, encryptMemberPassword);
			if(!checkMember.getTpMemberEmail().equals("")){
				System.out.println("이미 존재하는 회원입니다.");
				return;
			}
			
			// 비밀번호와 비밀번호 확인이 일치하지 않습니다.
			if(!inputMemberPassword.equals(inputMemberPasswordConfirm)) {
				System.out.println("비밀번호와 비밀번호 확인과 일치하지 않습니다.");
				return;
			}
			
			// DB에 회원 추가
			if(MemberDAO.addMember(inputMemberEmail, inputMemberName, encryptMemberPassword ,inputMemberIntro, inputCurrentTime)!=1){
				System.out.println("DB ERROR");
				return;
			}
		
			// 추가된 회원의 정보를 가져온다.
			Member getMember = MemberDAO.getMember(inputMemberEmail, encryptMemberPassword);
			
			// 시간표 입력
			if(!inputMemberTimeTable1.equals("")) setTimeTable(getMember.getTpMembeNo() ,1 ,inputMemberTimeTable1);			
			if(!inputMemberTimeTable2.equals("")) setTimeTable(getMember.getTpMembeNo() ,2, inputMemberTimeTable2);			
			if(!inputMemberTimeTable3.equals("")) setTimeTable(getMember.getTpMembeNo() ,3, inputMemberTimeTable3);			
			if(!inputMemberTimeTable4.equals("")) setTimeTable(getMember.getTpMembeNo() ,4, inputMemberTimeTable4);			
			if(!inputMemberTimeTable5.equals("")) setTimeTable(getMember.getTpMembeNo() ,5, inputMemberTimeTable5);					

			// index.jsp로 리턴
			return;
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	// 입력된 요일과 시간표를 DB에 입력한다.
	private static void setTimeTable(int tpMemberNo, int inputDay, String inputMemberTimeTable) {
		
		String temp;
		String startTime;
		String endTime;
		
		StringTokenizer st = new StringTokenizer(inputMemberTimeTable,";");
		while(st.hasMoreTokens()){
			
			temp = st.nextToken();
			
			StringTokenizer st2 = new StringTokenizer(temp,"~");
			startTime = st2.nextToken();
			endTime = st2.nextToken();
			
			if(!MemberDAO.addMemberTimeTable(tpMemberNo, inputDay, startTime, endTime)) {
				System.out.println("DB ERROR - "+inputDay);
			}
			
		}
	}

	// 로그인한다
	public static void loginMember(HttpServletRequest req, HttpServletResponse res) {
		
		try {
			HttpSession session = req.getSession();

			String inputMemberEmail = req.getParameter("inputMemberEmail") != null ? req.getParameter("inputMemberEmail").toString() : "";
			String inputMemberPassword = req.getParameter("inputMemberPassword") != null ? req.getParameter("inputMemberPassword").toString() : "";
			
			String encryptMemberPassword = EncryptUtil.testMD5(inputMemberPassword);
			
			// 이메일과 비밀번호 체크
			Member checkMember = MemberDAO.getMember(inputMemberEmail, encryptMemberPassword);
			
			// 아이디 혹은 비밀번호가 일치하지 않는 경우
			if(checkMember==null) {
				System.out.println("아이디 혹은 패스워드가 일치하지 않습니다.");
				return;
			}
			
			// 세션 저장
			session.setMaxInactiveInterval(3600);
			session.setAttribute("tpMemberNo", checkMember.getTpMembeNo());
			session.setAttribute("tpMemberEmail", checkMember.getTpMemberEmail());
			session.setAttribute("tpMemberName", checkMember.getTpMemberName());
			session.setAttribute("tpMemberIntro", checkMember.getTpMemberIntro());

			// index.jsp로 리턴
			return;
			
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void logoutMember(HttpServletRequest req, HttpServletResponse res) {
		
		try {
			HttpSession session = req.getSession(false);
			
			if(session == null) {
				System.out.println("이미 로그아웃 되있습니다.");
				return;
			}
			
			session.invalidate();
			
			res.getWriter().write("LogoutOK");
	
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void getMember(HttpServletRequest req, HttpServletResponse res) {

		try {
			int inputMemberNo = req.getParameter("inputMemberNo") != null ? Integer.parseInt(req.getParameter("inputMemberNo").toString()) : 0;
			
			//필수입력 체크
			if(inputMemberNo==0){
				System.out.println("필수입력란 미입력.");	
				return;
			}

			// 추가된 회원의 정보를 가져온다.
			Member getMember = MemberDAO.getMemberByMemberNo(inputMemberNo);


			// index.jsp로 리턴
			return;
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
