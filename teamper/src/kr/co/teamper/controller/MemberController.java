package kr.co.teamper.controller;

import java.io.File;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.HashMap;

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
		// TODO Auto-generated method stub
		
	}

	public static void loginMember(HttpServletRequest req, HttpServletResponse res) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("USER-IP", req.getRemoteAddr());
		
		try {
			HttpSession session = req.getSession();

			String inputMemberEmail = req.getParameter("inputMemberEmail") != null ? req.getParameter("inputMemberEmail").toString() : null;
			String inputMemberPassword = req.getParameter("inputMemberPassword") != null ? req.getParameter("inputMemberPassword").toString() : null;
			
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
