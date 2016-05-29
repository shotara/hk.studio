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
      try{
         String action = req.getParameter("action").toString();
         
         HashMap<String, String> map = new HashMap<String, String>();
         map.put("USER-IP", req.getRemoteAddr());
         
         switch(action) {
            case "addTeam":
               map.put("ACTION", "addTeam");
               TeamController.addTeam(req, res);
               break;
            case "getMember":
               map.put("ACTION", "getMember");
               TeamController.getMember(req, res);
               break;
            case "addTeamBar":
               map.put("ACTION", "addTeamBar");
               TeamController.addTeamBar(req, res);   
               break;
            case "addTeamBarDetail":
               map.put("ACTION", "addTeamBarDetail");
               TeamController.addTeamBarDetail(req, res);
               break;
            case "getTeamBarList":
               map.put("ACTION", "getTeamBarList");
               TeamController.getTeamBarList(req, res);
               break;
            case "getTeamBarDetailList":
               map.put("ACTION", "getTeamBarList");
               TeamController.getTeamBarDetailList(req, res);
               break;
            default:
         }
      }  catch(Exception e) {
         req.getRequestDispatcher("/02_page/error.jsp").forward(req, res);            
      }         
   }
}