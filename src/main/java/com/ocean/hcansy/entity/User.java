package com.ocean.hcansy.entity;

/**
 * 用户信息实体
 * @author yunhai
 *
 */
public class User {

	/** 主键ID */
	private Long id;
	
	/** 用户姓名 */
	private String userName;
	
	/** 登录密码 */
	private String password;
	
	/** 手机号码 */
	private String phoneNumber;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
