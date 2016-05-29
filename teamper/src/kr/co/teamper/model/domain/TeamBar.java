package kr.co.teamper.model.domain;

public class TeamBar {
	private int tpTeamNo;
	private int tpTeamBarNo;
	private String tpTeamBarName;
	private int tpTeamBarSize;
	private int tpTeamBarPercent;
	private long tpTeamBarCreateDate;
	public TeamBar()
	{
		super();
	}
	public int getTpTeamNo() {
		return tpTeamNo;
	}
	public void setTpTeamNo(int tpTeamNo) {
		this.tpTeamNo = tpTeamNo;
	}
	public int getTpTeamBarNo() {
		return tpTeamBarNo;
	}
	public void setTpTeamBarNo(int tpTeamBarNo) {
		this.tpTeamBarNo = tpTeamBarNo;
	}
	public String getTpTeamBarName() {
		return tpTeamBarName;
	}
	public void setTpTeamBarName(String tpTeamBarName) {
		this.tpTeamBarName = tpTeamBarName;
	}
	public int getTpTeamBarSize() {
		return tpTeamBarSize;
	}
	public void setTpTeamBarSize(int tpTeamBarSize) {
		this.tpTeamBarSize = tpTeamBarSize;
	}
	public int getTpTeamBarPercent() {
		return tpTeamBarPercent;
	}
	public void setTpTeamBarPercent(int tpTeamBarPercent) {
		this.tpTeamBarPercent = tpTeamBarPercent;
	}
	public long getTpTeamBarCreateDate() {
		return tpTeamBarCreateDate;
	}
	public void setTpTeamBarCreateDate(long tpTeamBarCreateDate) {
		this.tpTeamBarCreateDate = tpTeamBarCreateDate;
	}
	public TeamBar(int tpTeamNo, int tpTeamBarNo, String tpTeamBarName, int tpTeamBarSize, int tpTeamBarPercent,
			long tpTeamBarCreateDate) {
		super();
		this.tpTeamNo = tpTeamNo;
		this.tpTeamBarNo = tpTeamBarNo;
		this.tpTeamBarName = tpTeamBarName;
		this.tpTeamBarSize = tpTeamBarSize;
		this.tpTeamBarPercent = tpTeamBarPercent;
		this.tpTeamBarCreateDate = tpTeamBarCreateDate;
	}
	
	
}
