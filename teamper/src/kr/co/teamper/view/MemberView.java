package kr.co.teamper.view;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.teamper.controller.MemberController;

public class MemberView {

public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
	service(req, res);
}

public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
	service(req, res);
}

public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
	
		req.setCharacterEncoding("UTF-8");
		try{
			String action = req.getParameter("action").toString();
			
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("USER-IP", req.getRemoteAddr());
			
			switch(action) {
				case "checkMember":
					map.put("ACTION", "checkMember");
					MemberController.checkMember(req, res);
					break;
				case "joinMember":
					map.put("ACTION", "joinMember");
					MemberController.joinMember(req, res);
					break;
				case "loginMember":
					map.put("ACTION", "loginMember");
					MemberController.loginMember(req, res);	
					break;
				case "logoutMember":
					map.put("ACTION", "logoutMember");
					MemberController.logoutMember(req, res);
					break;
				case "getMember":
					map.put("ACTION", "getMember");
					MemberController.getMember(req, res);
					break;
				default:
			}
		}  catch(Exception e) {
			req.getRequestDispatcher("/02_page/error.jsp").forward(req, res);				
		}			
	}
}