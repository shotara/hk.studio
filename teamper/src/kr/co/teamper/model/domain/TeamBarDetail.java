package kr.co.teamper.model.domain;

public class TeamBarDetail {
	private int TeamBarNo;
	private int TeamBarDetailNo;
	private String TeamBarDetailWorker;
	private String TeamBarDetailContent;
	private boolean TeamBarDetailsWorked;
	public TeamBarDetail()
	{
		super();
	}
	public int getTeamBarNo() {
		return TeamBarNo;
	}
	public void setTeamBarNo(int teamBarNo) {
		TeamBarNo = teamBarNo;
	}
	public int getTeamBarDetailNo() {
		return TeamBarDetailNo;
	}
	public void setTeamBarDetailNo(int teamBarDetailNo) {
		TeamBarDetailNo = teamBarDetailNo;
	}
	public String getTeamBarDetailWorker() {
		return TeamBarDetailWorker;
	}
	public void setTeamBarDetailWorker(String teamBarDetailWorker) {
		TeamBarDetailWorker = teamBarDetailWorker;
	}
	public String getTeamBarDetailContent() {
		return TeamBarDetailContent;
	}
	public void setTeamBarDetailContent(String teamBarDetailContent) {
		TeamBarDetailContent = teamBarDetailContent;
	}
	public boolean isTeamBarDetailsWorked() {
		return TeamBarDetailsWorked;
	}
	public void setTeamBarDetailsWorked(boolean teamBarDetailsWorked) {
		TeamBarDetailsWorked = teamBarDetailsWorked;
	}
	public TeamBarDetail(int teamBarNo, int teamBarDetailNo, String teamBarDetailWorker, String teamBarDetailContent,
			boolean teamBarDetailsWorked) {
		super();
		TeamBarNo = teamBarNo;
		TeamBarDetailNo = teamBarDetailNo;
		TeamBarDetailWorker = teamBarDetailWorker;
		TeamBarDetailContent = teamBarDetailContent;
		TeamBarDetailsWorked = teamBarDetailsWorked;
	}
}
