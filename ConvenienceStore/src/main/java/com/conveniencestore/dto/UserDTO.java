package com.conveniencestore.dto;

public class UserDTO {

	private String UserId;
	
	private String UserPwd;

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public String getUserPwd() {
		return UserPwd;
	}

	public void setUserPwd(String userPwd) {
		UserPwd = userPwd;
	}

	@Override
	public String toString() {
		return "UserDTO [UserId=" + UserId + ", UserPwd=" + UserPwd + "]";
	}
	
	
	
}

