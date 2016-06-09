package kr.co.teamper.model;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import kr.co.teamper.model.domain.Member;
import kr.co.teamper.model.domain.Team;
import kr.co.teamper.model.domain.TeamBar;
import kr.co.teamper.model.domain.TeamBarDetail;
import kr.co.teamper.util.DAOFactory;

public class TeamDAO {

	private static final String namespace = "team";
	
	public static int addTeam(int sessionMemberNo, String inputTeamName, String inputTeamInfo, long inputCurrentDate) {
		
		SqlSession sqlSession = DAOFactory.getSqlSession(false);
		int check=0;
		try {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("memberNo", sessionMemberNo);
			map.put("teamName", inputTeamName);
		    map.put("teamInfo", inputTeamInfo);
		    map.put("teamCurrentDate", inputCurrentDate);

		    
		    check = (int)sqlSession.insert(namespace + ".addTeam", map);
		    
		    if(check==1) {
		    	sqlSession.commit();
		    	return check;
		    } else {
		    	sqlSession.rollback();
		    	return check;
		    }
		} finally {
			sqlSession.close();
		}
	}

	public static Team viewTeam(int sessionMemberNo) {
		
		SqlSession sqlSession = DAOFactory.getSqlSession(true);
		
		try {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("memberNo", sessionMemberNo);
		    
		    return (Team)sqlSession.selectOne(namespace + ".viewTeam", map);
		    
		} finally {
			sqlSession.close();
		}
	}

	public static ArrayList<TeamBar> getTeamBar(int tpTeamNo, int sessionMemberNo) {
		
		SqlSession sqlSession = DAOFactory.getSqlSession(true);
		
		try {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("teamNo", tpTeamNo);
			map.put("memberNo", sessionMemberNo);

		    return (ArrayList)sqlSession.selectList(namespace + ".getTeamBar", map);
		    
		} finally {
			sqlSession.close();
		}
	}

	public static ArrayList<TeamBarDetail> getTeamBarDetail(int tpTeamBarNo, int tpTeamNo, int sessionMemberNo) {
		
		SqlSession sqlSession = DAOFactory.getSqlSession(true);
		
		try {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("teamBarNo", tpTeamBarNo);
			map.put("teamNo", tpTeamNo);
			map.put("memberNo", sessionMemberNo);

		    return (ArrayList)sqlSession.selectList(namespace + ".getTeamBarDetail", map);
		    
		} finally {
			sqlSession.close();
		}
	}

	public static int addTeamBar(int sessionMemberNo, int inputTeamNo, String inputTeamBarName, int inputTeamBarSize,
			int inputTeamBarPercent, long inputCurrentTime) {
		
		SqlSession sqlSession = DAOFactory.getSqlSession(false);
		int check=0;
		try {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("memberNo", sessionMemberNo);
			map.put("teamNo", inputTeamNo);
		    map.put("teamBarName", inputTeamBarName);
		    map.put("teamBarSize", inputTeamBarSize);
		    map.put("teamBarPercent", inputTeamBarPercent);
		    map.put("inputCurrentTime", inputCurrentTime);
		    
		    check = (int)sqlSession.insert(namespace + ".addTeamBar", map);
		    
		    if(check==1) {
		    	sqlSession.commit();
		    	return check;
		    } else {
		    	sqlSession.rollback();
		    	return check;
		    }
		} finally {
			sqlSession.close();
		}
	}

	public static int addTeamBarDetail(int inputTeamBarNo, int inputTeamBarDetailStatus,
			int inputMemberNo, String inputTeamBarDetailContent) {
		
		SqlSession sqlSession = DAOFactory.getSqlSession(false);
		int check=0;
		try {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("teamBarNo", inputTeamBarNo);
		    map.put("teamBarDetailStatus", inputTeamBarDetailStatus);
		    map.put("memberNo", inputMemberNo);
		    map.put("teamBarDetailContent", inputTeamBarDetailContent);
		    
		    check = (int)sqlSession.insert(namespace + ".addTeamBarDetail", map);
		    
		    if(check==1) {
		    	sqlSession.commit();
		    	return check;
		    } else {
		    	sqlSession.rollback();
		    	return check;
		    }
		} finally {
			sqlSession.close();
		}
	}

	public static int setTeamBarDetail(int inputTeamBarDetailNo, int inputTeamBarDetailStatus,
			int inputMemberNo) {
		
		SqlSession sqlSession = DAOFactory.getSqlSession(false);
		int check=0;
		try {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("teamBarDetailNo", inputTeamBarDetailNo);
		    map.put("teamBarDetailStatus", inputTeamBarDetailStatus);
		    map.put("memberNo", inputMemberNo);
		    
		    check = (int)sqlSession.update(namespace + ".setTeamBarDetail", map);
		    
		    if(check==1) {
		    	sqlSession.commit();
		    	return check;
		    } else {
		    	sqlSession.rollback();
		    	return check;
		    }
		} finally {
			sqlSession.close();
		}
	}
}
