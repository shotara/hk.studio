package kr.co.teamper.model.domain;

public class Team {
	private int tpTeamNo;
	private String tpMemberNo;
	private String tpTeamName;
	private long tpTeamCreateDate;
	private String  tpTeamInfo;
	public Team()
	{
		super();
	}
	public int getTpTeamNo() {
		return tpTeamNo;
	}
	public void setTpTeamNo(int tpTeamNo) {
		this.tpTeamNo = tpTeamNo;
	}
	public String getTpMemberNo() {
		return tpMemberNo;
	}
	public void setTpMemberNo(String tpMemberNo) {
		this.tpMemberNo = tpMemberNo;
	}
	public String getTpTeamName() {
		return tpTeamName;
	}
	public void setTpTeamName(String tpTeamName) {
		this.tpTeamName = tpTeamName;
	}
	public long getTpTeamCreateDate() {
		return tpTeamCreateDate;
	}
	public void setTpTeamCreateDate(long tpTeamCreateDate) {
		this.tpTeamCreateDate = tpTeamCreateDate;
	}
	public String getTpTeamInfo() {
		return tpTeamInfo;
	}
	public void setTpTeamInfo(String tpTeamInfo) {
		this.tpTeamInfo = tpTeamInfo;
	}
	public Team(int tpTeamNo, String tpMemberNo, String tpTeamName, long tpTeamCreateDate, String tpTeamInfo) {
		super();
		this.tpTeamNo = tpTeamNo;
		this.tpMemberNo = tpMemberNo;
		this.tpTeamName = tpTeamName;
		this.tpTeamCreateDate = tpTeamCreateDate;
		this.tpTeamInfo = tpTeamInfo;
	}
}
