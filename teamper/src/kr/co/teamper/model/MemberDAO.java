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
	
	public static int checkMember(String inputMemberEmail) {
		
		SqlSession sqlSession = DAOFactory.getSqlSession(true);
		
		try {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("memberEmail", inputMemberEmail);
		    
		    return (int)sqlSession.selectOne(namespace + ".checkMember", map);
		    
		} finally {
			sqlSession.close();
		}
	}
	public static int addMember(String inputMemberEmail, String inputMemberName, String encryptMemberPassword,
			String inputMemberIntro, long inputCurrentTime) {
	
		SqlSession sqlSession = DAOFactory.getSqlSession(false);
		int check = 0;
		try {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("memberEmail", inputMemberEmail);
		    map.put("memberPassword", encryptMemberPassword);
		    map.put("memberName", inputMemberName);
		    map.put("memberIntro", inputMemberIntro);
		    map.put("memberCreateDate", inputCurrentTime);
		    
		    check = (int)sqlSession.insert(namespace + ".addMember", map);
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

	public static boolean addMemberTimeTable(int tpMemberNo, int inputDay, String startTime, String endTime) {
		
		SqlSession sqlSession = DAOFactory.getSqlSession(false);
		int check = 0;
		try {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("memberNo", tpMemberNo);
		    map.put("inputDay", inputDay);
		    map.put("startTime", startTime);
		    map.put("endTime", endTime);
		    
		    check = (int)sqlSession.insert(namespace + ".addMemberTimeTable", map);
		    if(check==1) {
		    	sqlSession.commit();
		    	return true;
		    } else {
		    	sqlSession.rollback();
		    	return false;
		    }
		} finally {
			sqlSession.close();
		}
	}

	public static Member getMemberByMemberNo(int inputMemberNo) {
		
		SqlSession sqlSession = DAOFactory.getSqlSession(true);
		
		try {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("memberNo", inputMemberNo);
		    
		    return (Member)sqlSession.selectOne(namespace + ".getMemberByMemberNo", map);
		    
		} finally {
			sqlSession.close();
		}
	}
}
