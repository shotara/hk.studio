package kr.co.teamper.view;
import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.teamper.controller.MemberController;
import kr.co.teamper.controller.TeamController;

public class TeamView {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		service(req, res);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		service(req, res);
	}
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		req.setCharacterEncoding("UTF-8");
		try {
			String action = req.getParameter("action").toString();

			switch (action) {
			case "addTeam":
				TeamController.addTeam(req, res);
				break;
			case "addTeamBar":
				TeamController.addTeamBar(req, res);
				break;
			case "addTeamBarDetail":
				TeamController.addTeamBarDetail(req, res);
				break;
			case "getTeamBarList":
				TeamController.getTeamBarList(req, res);
				break;
			case "getTeamBarDetailList":
				TeamController.getTeamBarDetailList(req, res);
				break;
			default:
			}
		} catch (Exception e) {
			req.getRequestDispatcher("/page/error.jsp").forward(req, res);
		}
	}
}