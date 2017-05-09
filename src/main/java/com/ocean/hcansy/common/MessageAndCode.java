package com.ocean.hcansy.common;

public enum MessageAndCode {
	
	/**
	 * message: 请求响应成功<br/>
	 * code: 0
	 */
	DEFAULT("请求响应成功", 0),
	
	/**
	 * message: 用户未登录或登录信息失效<br/>
	 * code: 1000
	 */
	USER_NOT_LOGIN("用户未登录或登录信息失效", 1000),
	
	/**
	 * message: 用户名错误<br/>
	 * code: 1001
	 */
	LOGIN_USERNAME_ERROR("用户名错误", 1001),
	
	/**
	 * message: 登录密码错误<br/>
	 * code: 1002
	 */
	LOGIN_PASSWORD_ERROR("登录密码错误", 1002),
	
	/**
	 * message: 没有权限<br/>
	 * code: 1005
	 */
	NO_PERMISSION("没有权限", 1005);
	
	private String message;
	
	private Integer code;
	
	private MessageAndCode(String message, Integer code){
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	};
	
}
