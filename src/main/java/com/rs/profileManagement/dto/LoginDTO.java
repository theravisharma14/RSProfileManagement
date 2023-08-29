package com.rs.profileManagement.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class LoginDTO {

	@JsonIgnore
	private Long profileID;
	private String userName;
	private String userPass;
	private String userEmail;
	private Long  userMobile;
	private String userType;
	private String createUid;
	private String updateUid;
	
	public Long getProfileID() {
		return profileID;
	}
	public void setProfileID(Long profileID) {
		this.profileID = profileID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Long getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(Long userMobile) {
		this.userMobile = userMobile;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getCreateUid() {
		return createUid;
	}
	public void setCreateUid(String createUid) {
		this.createUid = createUid;
	}
	public String getUpdateUid() {
		return updateUid;
	}
	public void setUpdateUid(String updateUid) {
		this.updateUid = updateUid;
	}


}
