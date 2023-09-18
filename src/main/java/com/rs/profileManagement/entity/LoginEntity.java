package com.rs.profileManagement.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "RS_PROFILE_MANAGEMENT")
public class LoginEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="PROFILE_ID", unique=true, nullable=false)
	private Long profileID;
	
	@Column (name="USER_NAME")
	private String userName;
	
	@Column (name="USER_PASSWORD")
	private String userPass;
	
	@Column (name="USER_EMAIL")
	private String userEmail;
	
	@Column (name="USER_MOBILE")
	private Long  userMobile;
	
	@Column (name="USER_TYPE", unique=true, nullable=false)
	private String userType;
	
	@Column (name="CREATE_UID")
	@CreationTimestamp
	private Date createDATE;
	
	@Column(name="UPDATE_UID")
	@UpdateTimestamp
	private Date updateDATE;

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

	public Date getCreateDATE() {
		return createDATE;
	}

	public Date getUpdateDATE() {
		return updateDATE;
	}

	public void setCreateDATE(Date createDATE) {
		this.createDATE = createDATE;
	}

	public void setUpdateDATE(Date updateDATE) {
		this.updateDATE = updateDATE;
	}
	
}
