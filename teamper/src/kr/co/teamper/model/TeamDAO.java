package kr.co.teamper.model;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import kr.co.teamper.util.DAOFactory;

public class TeamDAO {

	private static final String namespace = "team";
	
	public static int addMember(int sessionMemberNo, String inputTeamName, String inputTeamInfo, long inputCurrentTime) {
		SqlSession sqlSession = DAOFactory.getSqlSession(true);
		
		try {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("memberNo", sessionMemberNo);
			map.put("teamName", inputTeamName);
		    map.put("teamInfo", inputTeamInfo);
		    map.put("teamCurrentTime", inputCurrentTime);

		    return (int)sqlSession.insert(namespace + ".addTeam", map);
		    
		} finally {
			sqlSession.close();
		}

	}

}
