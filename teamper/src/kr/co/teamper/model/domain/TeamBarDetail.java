package kr.co.teamper.model.domain;

public class TeamBarDetail {
	private int tpTeamBarDetailNo;
	private int tpTeamBarNo;
	private int tpTeamBarDetailStatus;
	private int tpMemberNo;
	private String tpTeamBarDetailContent;
	public TeamBarDetail()
	{
		super();
	}
	public int getTpTeamBarDetailNo() {
		return tpTeamBarDetailNo;
	}
	public void setTpTeamBarDetailNo(int tpTeamBarDetailNo) {
		this.tpTeamBarDetailNo = tpTeamBarDetailNo;
	}
	public int getTpTeamBarNo() {
		return tpTeamBarNo;
	}
	public void setTpTeamBarNo(int tpTeamBarNo) {
		this.tpTeamBarNo = tpTeamBarNo;
	}
	public int getTpTeamBarDetailStatus() {
		return tpTeamBarDetailStatus;
	}
	public void setTpTeamBarDetailStatus(int tpTeamBarDetailStatus) {
		this.tpTeamBarDetailStatus = tpTeamBarDetailStatus;
	}
	public int getTpMemberNo() {
		return tpMemberNo;
	}
	public void setTpMemberNo(int tpMemberNo) {
		this.tpMemberNo = tpMemberNo;
	}
	public String getTpTeamBarDetailContent() {
		return tpTeamBarDetailContent;
	}
	public void setTpTeamBarDetailContent(String tpTeamBarDetailContent) {
		this.tpTeamBarDetailContent = tpTeamBarDetailContent;
	}

	public TeamBarDetail(int tpTeamBarDetailNo, int tpTeamBarNo, int tpTeamBarDetailStatus,
			int tpMemberNo, String tpTeamBarDetailContent, boolean tpTeamBarDetailsWorked) {
		super();
		this.tpTeamBarDetailNo = tpTeamBarDetailNo;
		this.tpTeamBarNo = tpTeamBarNo;
		this.tpTeamBarDetailStatus = tpTeamBarDetailStatus;
		this.tpMemberNo = tpMemberNo;
		this.tpTeamBarDetailContent = tpTeamBarDetailContent;
	}

}
