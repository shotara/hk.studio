package kr.co.teamper.model.domain;

public class Member {

	private int tpMembeNo;
	private String tpMemberEmail;
	private String tpMemberName;
	private String tpMemberPassword;
	private String tpMemberPhone;
	private String tpMemberIntro;
	private long tpMemberCreateDate;
	public Member() {
		super();
	}
	public int getTpMembeNo() {
		return tpMembeNo;
	}
	public void setTpMembeNo(int tpMembeNo) {
		this.tpMembeNo = tpMembeNo;
	}
	public String getTpMemberEmail() {
		return tpMemberEmail;
	}
	public void setTpMemberEmail(String tpMemberEmail) {
		this.tpMemberEmail = tpMemberEmail;
	}
	public String getTpMemberName() {
		return tpMemberName;
	}
	public void setTpMemberName(String tpMemberName) {
		this.tpMemberName = tpMemberName;
	}
	public String getTpMemberPassword() {
		return tpMemberPassword;
	}
	public void setTpMemberPassword(String tpMemberPassword) {
		this.tpMemberPassword = tpMemberPassword;
	}
	public String getTpMemberPhone() {
		return tpMemberPhone;
	}
	public void setTpMemberPhone(String tpMemberPhone) {
		this.tpMemberPhone = tpMemberPhone;
	}
	public String getTpMemberIntro() {
		return tpMemberIntro;
	}
	public void setTpMemberIntro(String tpMemberIntro) {
		this.tpMemberIntro = tpMemberIntro;
	}
	public long getTpMemberCreateDate() {
		return tpMemberCreateDate;
	}
	public void setTpMemberCreateDate(long tpMemberCreateDate) {
		this.tpMemberCreateDate = tpMemberCreateDate;
	}
	public Member(int tpMembeNo, String tpMemberEmail, String tpMemberName, String tpMemberPassword,
			String tpMemberPhone, String tpMemberIntro, long tpMemberCreateDate) {
		super();
		this.tpMembeNo = tpMembeNo;
		this.tpMemberEmail = tpMemberEmail;
		this.tpMemberName = tpMemberName;
		this.tpMemberPassword = tpMemberPassword;
		this.tpMemberPhone = tpMemberPhone;
		this.tpMemberIntro = tpMemberIntro;
		this.tpMemberCreateDate = tpMemberCreateDate;
	}

}
