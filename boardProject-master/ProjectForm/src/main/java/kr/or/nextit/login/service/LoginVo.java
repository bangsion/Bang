package kr.or.nextit.login.service;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class LoginVo {
	private String memId;
	private String memPw;
	private String memName;
	private String memEmail;
	private String memPhone;
	private String regDate;
	private String add;

	public String getAdd() {
		return add;
	}

	public String getMemEmail() {
		return memEmail;
	}

	public String getMemId() {
		return memId;
	}

	public String getMemName() {
		return memName;
	}

	public String getMemPhone() {
		return memPhone;
	}

	public String getMemPw() {
		return memPw;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}

	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String toString() {

		return ToStringBuilder.reflectionToString(this);
	}

}
