package kr.co.teamper.controller;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;

import kr.co.teamper.model.MemberDAO;
import kr.co.teamper.model.TeamDAO;
import kr.co.teamper.model.domain.Member;
import kr.co.teamper.model.domain.Team;
import kr.co.teamper.model.domain.TeamBar;
import kr.co.teamper.model.domain.TeamBarDetail;
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
			long inputCurrentDate = System.currentTimeMillis() / 1000;

			JSONObject jObject = new JSONObject();
			res.setContentType("application/json");
			res.setCharacterEncoding("UTF-8");	
			
			// 필수입력 체크
			if (inputTeamName.equals("") || inputTeamInfo.equals("")) {
				System.out.println("필수입력란 미입력.");
				jObject.put("outputResult", "-1");
				res.getWriter().write(jObject.toString());
				return;
			}

			if (TeamDAO.addTeam(sessionMemberNo, inputTeamName, inputTeamInfo, inputCurrentDate) != 1) {
				System.out.println("DB ERROR");
				jObject.put("outputResult", "-2");
				res.getWriter().write(jObject.toString());
				return;
			}

			jObject.put("outputResult", "1");
			res.getWriter().write(jObject.toString());
			return;

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void viewTeam(HttpServletRequest req, HttpServletResponse res) {

		try {
			HttpSession session = req.getSession();

			int sessionMemberNo = session.getAttribute("tpMemberNo") != null ? Integer.parseInt(session.getAttribute("tpMemberNo").toString()) : 0;
			
			JSONObject jObject = new JSONObject();
			res.setContentType("application/json");
			res.setCharacterEncoding("UTF-8");	
			

			// 팀을 검색했을때 팀이 있으면 팀뷰, 없으면 생성해야함.
			Team team =  TeamDAO.viewTeam(sessionMemberNo);
			if (team==null) {
				// 팀이 없을때 
				System.out.println("NoTeam");
				jObject.put("outputResult", "-1");
				res.getWriter().write(jObject.toString());
				return;
			}

			req.setAttribute("outputTeamNo", team.getTpTeamNo());				
			req.setAttribute("outputTeamName", team.getTpTeamName());				
			req.setAttribute("outputTeamInfo", team.getTpTeamInfo());				
			req.setAttribute("outputMemberNo", team.getTpMemberNo());				

			// 팀 바를 표시한다. 없으면 생성해야한다.
			ArrayList<TeamBar> teamBarList = new ArrayList<TeamBar>(); 
			teamBarList = TeamDAO.getTeamBar(team.getTpTeamNo(), sessionMemberNo);
			ArrayList<TeamBarDetail> teamBarDetailList = new ArrayList<TeamBarDetail>(); 
			
			if(teamBarList.isEmpty()) {
//				System.out.println("NoList");
//				jObject.put("outputTeamNo", "-2");
//				res.getWriter().write(jObject.toString());
//				return;
			}
			

			ArrayList<ArrayList<HashMap<String, Object>>> outputTeamBar = new ArrayList<ArrayList<HashMap<String, Object>>>();
			for(int i=0; i<teamBarList.size(); i++) {
				ArrayList<HashMap<String, Object>> tempTeamBar = new ArrayList<HashMap<String, Object>>();		
				HashMap<String, Object> tempBar = new HashMap<String, Object>();		

				tempBar.put("outputTeamBarNo", teamBarList.get(i).getTpTeamBarNo());				
				tempBar.put("outputTeamBarName", teamBarList.get(i).getTpTeamBarName());				
				tempBar.put("outputTeamBarCreateDate", teamBarList.get(i).getTpTeamBarCreateDate());				
				tempBar.put("outputTeamBarPercent", teamBarList.get(i).getTpTeamBarPercent());				
				
				tempTeamBar.add(tempBar);
				
				// bar detail을 가져온다.
				teamBarDetailList = TeamDAO.getTeamBarDetail(teamBarList.get(i).getTpTeamBarNo(), team.getTpTeamNo(), sessionMemberNo);
				
				// detail이 있을 때
				if(!teamBarDetailList.isEmpty()) {
					for(int j=0; j<teamBarDetailList.size();j++) {
						HashMap<String, Object> tempBarDetail = new HashMap<String, Object>();		

						tempBarDetail.put("outputTeamBarDetailNo", teamBarDetailList.get(j).getTpTeamBarDetailNo());
						tempBarDetail.put("outputTeamBarDetailWorker", teamBarDetailList.get(j).getTpMemberNo());
						tempBarDetail.put("outputTeamBarDetailContent", teamBarDetailList.get(j).getTpTeamBarDetailContent());
						tempBarDetail.put("outputTeamBarDetailStatus", teamBarDetailList.get(j).getTpTeamBarDetailStatus());
						
						tempTeamBar.add(tempBarDetail);
						
					}
				}
				outputTeamBar.add(tempTeamBar);
			}
			

			session.setAttribute("tpTeamNo", team.getTpTeamNo());
			
			jObject.put("outputResult", "1");
			res.getWriter().write(jObject.toString());
			return;

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void addTeamBar(HttpServletRequest req, HttpServletResponse res) {

		try {
			HttpSession session = req.getSession();

			int sessionMemberNo = session.getAttribute("tpMemberNo") != null ? Integer.parseInt(session.getAttribute("tpMemberNo").toString()) : 0;
			int inputTeamNo = req.getParameter("inputTeamNo") != null	? Integer.parseInt(req.getParameter("inputTeamNo").toString()) : 0;
			String inputTeamBarName = req.getParameter("inputTeamBarName") != null	? req.getParameter("inputTeamBarName").toString() : "";
			int inputTeamBarSize = req.getParameter("inputTeamBarSize") != null	? Integer.parseInt(req.getParameter("inputTeamBarSize").toString()) : 0;
			int inputTeamBarPercent = 0;
			long inputCurrentTime = System.currentTimeMillis() / 1000;

			// 필수입력 체크
			if (inputTeamBarName.equals("") || inputTeamNo==0 || inputTeamBarSize==0) {
				System.out.println("필수입력란 미입력.");
				return;
			}

			if (TeamDAO.addTeamBar(sessionMemberNo, inputTeamNo, inputTeamBarName, inputTeamBarSize, inputTeamBarPercent, inputCurrentTime) != 1) {
				System.out.println("DB ERROR");
				return;
			}

			return;

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void addTeamBarDetail(HttpServletRequest req, HttpServletResponse res) {

		try {
			HttpSession session = req.getSession();

			int sessionMemberNo = session.getAttribute("tpMemberNo") != null ? Integer.parseInt(session.getAttribute("tpMemberNo").toString()) : 0;
			int inputTeamBarNo = req.getParameter("inputTeamBarNo") != null	? Integer.parseInt(req.getParameter("inputTeamBarNo").toString()) : 0;
			int inputTeamBarDetailStatus = req.getParameter("inputTeamBarDetailStatus") != null	? Integer.parseInt(req.getParameter("inputTeamBarDetailStatus").toString()) : 0;
			int inputMemberNo = req.getParameter("inputMemberNo") != null	?  Integer.parseInt(req.getParameter("inputMemberNo").toString()) : 0;
			String inputTeamBarDetailContent = req.getParameter("inputTeamBarDetailContent") != null	? req.getParameter("inputTeamBarDetailContent").toString() : "";

			// 필수입력 체크
			if (inputTeamBarDetailContent.equals("") || inputTeamBarNo==0 || inputTeamBarDetailStatus==0 || inputTeamBarDetailStatus==0) {
				System.out.println("필수입력란 미입력.");
				return;
			}

			if (TeamDAO.addTeamBarDetail(inputTeamBarNo, inputTeamBarDetailStatus, inputMemberNo, inputTeamBarDetailContent) != 1) {
				System.out.println("DB ERROR");
				return;
			}

			return;

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void setTeamBarDetail(HttpServletRequest req, HttpServletResponse res) {

		try {
			HttpSession session = req.getSession();

			int sessionMemberNo = session.getAttribute("tpMemberNo") != null ? Integer.parseInt(session.getAttribute("tpMemberNo").toString()) : 0;
			int inputTeamBarDetailNo = req.getParameter("inputTeamBarNo") != null	? Integer.parseInt(req.getParameter("inputTeamBarNo").toString()) : 0;
			int inputTeamBarDetailStatus = req.getParameter("inputTeamBarDetailStatus") != null	? Integer.parseInt(req.getParameter("inputTeamBarDetailStatus").toString()) : 0;
			int inputMemberNo = req.getParameter("inputMemberNo") != null	?  Integer.parseInt(req.getParameter("inputMemberNo").toString()) : 0;

			// 필수입력 체크
			if (inputTeamBarDetailNo==0 || inputTeamBarDetailStatus==0 || inputTeamBarDetailStatus==0) {
				System.out.println("필수입력란 미입력.");
				return;
			}

			// 담당자가 아니다
			if(sessionMemberNo!=inputMemberNo) {
				System.out.println("담당자가 아니다.");
				return;
			}
			
			if (TeamDAO.setTeamBarDetail(inputTeamBarDetailNo, inputTeamBarDetailStatus, inputMemberNo) != 1) {
				System.out.println("DB ERROR");
				return;
			}

			return;

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
