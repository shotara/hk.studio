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

	public static void checkMember(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		
	}

	public static void joinMember(HttpServletRequest req, HttpServletResponse res) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("USER-IP", req.getRemoteAddr());
		
		try {
			
			String inputMemberEmail = req.getParameter("inputMemberEmail") != null ? req.getParameter("inputMemberEmail").toString() : "";
			String inputMemberPassword = req.getParameter("inputMemberPassword") != null ? req.getParameter("inputMemberPassword").toString() : "";
			String inputMemberPasswordConfirm = req.getParameter("inputMemberPasswordConfirm") != null ? req.getParameter("inputMemberPasswordConfirm").toString() : "";
			String encryptMemberPassword = EncryptUtil.testMD5(inputMemberPassword);
			String inputMemberName = req.getParameter("inputMemberName") != null ? req.getParameter("inputMemberName").toString() : "";
			String inputMemberInfo = req.getParameter("inputMemberInfo") != null ? req.getParameter("inputMemberInfo").toString() : "";
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
			
			// 아이디 혹은 비밀번호가
			if(!inputMemberPassword.equals(inputMemberPasswordConfirm)) {
				System.out.println("비밀번호가 비밀번호 확인과 일치하지 않습니다.");
				return;
			}
	
			
			MemberDAO.addMember(inputMemberEmail, inputMemberName, encryptMemberPassword, inputCurrentTime);
			
		
			if(!inputMemberTimeTable1.equals("")){
					
				setTimeTable(1, inputMemberTimeTable1);			
			}
			if(!inputMemberTimeTable2.equals("")){
				
				setTimeTable(2, inputMemberTimeTable2);			
			}
			if(!inputMemberTimeTable3.equals("")){
				
				setTimeTable(3, inputMemberTimeTable3);			
			}
			if(!inputMemberTimeTable4.equals("")){
				
				setTimeTable(4, inputMemberTimeTable4);			
			}
			if(!inputMemberTimeTable5.equals("")){
				
				setTimeTable(5, inputMemberTimeTable5);			
			}
			
			return;
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static void setTimeTable(int i, String inputMemberTimeTable) {
		
		StringTokenizer st = new StringTokenizer(inputMemberTimeTable,";");
		while(st.hasMoreTokens()){
			
			
			
			
		}
	
	}

	public static void loginMember(HttpServletRequest req, HttpServletResponse res) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("USER-IP", req.getRemoteAddr());
		
		try {
			HttpSession session = req.getSession();

			String inputMemberEmail = req.getParameter("inputMemberEmail") != null ? req.getParameter("inputMemberEmail").toString() : "";
			String inputMemberPassword = req.getParameter("inputMemberPassword") != null ? req.getParameter("inputMemberPassword").toString() : "";
			
			String encryptMemberPassword = EncryptUtil.testMD5(inputMemberPassword);
			
			// 이메일과 비밀번호 체크
			Member checkMember = MemberDAO.getMember(inputMemberEmail, encryptMemberPassword);
			
			// 아이디 혹은 비밀번호가 일치하지 않는 경우
			if(checkMember==null) {
				System.out.println("아이디 혹은 패스워드가 없습니다.");
				return;
			}
			
			// 세션 저장
			session.setMaxInactiveInterval(3600);
			session.setAttribute("tpMemberNo", checkMember.getTpMembeNo());
			session.setAttribute("tpMemberEmail", checkMember.getTpMemberEmail());
			session.setAttribute("tpMemberName", checkMember.getTpMemberName());
			session.setAttribute("tpMemberIntro", checkMember.getTpMemberIntro());

			return;
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void logoutMember(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		
	}

	public static void getMember(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		
	}

}
