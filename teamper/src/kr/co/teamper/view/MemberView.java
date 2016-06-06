package kr.co.teamper.view;
import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.teamper.controller.MemberController;

public class MemberView extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		service(req, res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		service(req, res);
	}

	// doGet, doPost로 받은 request를 service로 보내준다.
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		req.setCharacterEncoding("UTF-8");
		try {
			// action에 있는 파라미터를 변수에 넣고 스위치문으로 컨트롤러를 호출한다.
			String action = req.getParameter("action").toString();

			switch (action) {
			case "joinMember":
				MemberController.joinMember(req, res);
				break;
			case "loginMember":
				MemberController.loginMember(req, res);
				break;
			case "logoutMember":
				MemberController.logoutMember(req, res);
				break;
			case "getMember":
				MemberController.getMember(req, res);
				break;
			default:
			}
		} catch (Exception e) {
			System.out.println("error");
			req.getRequestDispatcher("/page/error.jsp").forward(req, res);
		}
	}
}