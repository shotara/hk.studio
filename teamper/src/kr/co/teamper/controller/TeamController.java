package kr.co.teamper.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.teamper.model.MemberDAO;
import kr.co.teamper.model.TeamDAO;
import kr.co.teamper.model.domain.Member;
import kr.co.teamper.util.EncryptUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TeamController {

	public static void addTeam(HttpServletRequest req, HttpServletResponse res) {

		try {
			HttpSession session = req.getSession();

			int sessionMemberNo = session.getAttribute("tpMemberNo") != null ? Integer.parseInt(session.getAttribute("tpMemberNo").toString()) : 0;
			String inputTeamName = req.getParameter("inputTeamName") != null	? req.getParameter("inputTeamName").toString() : "";
			String inputTeamInfo = req.getParameter("inputTeamInfo") != null ? req.getParameter("inputTeamInfo").toString() : "";
			long inputCurrentTime = System.currentTimeMillis() / 1000;

			// 필수입력 체크
			if (inputTeamName.equals("") || inputTeamInfo.equals("")) {
				System.out.println("필수입력란 미입력.");
				return;
			}

			if (TeamDAO.addMember(sessionMemberNo, inputTeamName, inputTeamInfo, inputCurrentTime) != 1) {
				System.out.println("DB ERROR");
				return;
			}

			return;

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void addTeamBar(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub

	}

	public static void addTeamBarDetail(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub

	}

	public static void getTeamBarList(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub

	}

	public static void getTeamBarDetailList(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub

	}
}
