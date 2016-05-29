package kr.co.teamper.model;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import kr.co.teamper.util.DAOFactory;

import kr.co.teamper.model.domain.Member;

public class MemberDAO {
	
	private static final String namespace = "member";

	public static Member getMember(String inputMemberEmail, String encryptMemberPassword) {
		
		SqlSession sqlSession = DAOFactory.getSqlSession(true);
		
		try {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("memberEmail", inputMemberEmail);
		    map.put("memberPassword", encryptMemberPassword);
		    
		    return (Member)sqlSession.selectOne(namespace + ".getMember", map);
		    
		} finally {
			sqlSession.close();
		}
	}

	public static void addMember(String inputMemberEmail, String inputMemberName, String encryptMemberPassword,
			long inputCurrentTime) {
		// TODO Auto-generated method stub
		
	}

}
