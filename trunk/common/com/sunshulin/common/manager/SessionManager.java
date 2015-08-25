package com.sunshulin.common.manager;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

/**
 * session工具管理类
 * 
 * @author 孙树林
 * 
 */
public class SessionManager {

	public static final String LOGIN_SESSION = "user";

	/**
	 * 用户信息保存session中
	 */
	public static void setUser(Login login) {
		setAttr(LOGIN_SESSION, login);
	}

	/**
	 * 从session中获得用户信息
	 * 
	 * @return
	 */
	public static Login getUser() {
		Object obj = getAttr(LOGIN_SESSION);
		return obj != null ? (Login) obj : null;
	}

	/**
	 * 保存session属性
	 * 
	 * @param key
	 * @param value
	 */
	public static void setAttr(String key, Object value) {
		HttpServletRequest request = ServletActionContext.getRequest();
		request.getSession().setAttribute(key, value);
	}

	/**
	 * 获得属性
	 * 
	 * @param key
	 * @return
	 */
	public static Object getAttr(String key) {
		HttpServletRequest request = ServletActionContext.getRequest();
		return request.getSession().getAttribute(key);
	}
	
	public static boolean isLogin() {
		Login login = getUser();
		if (login != null) {
			return true;
		} else {
			return false;
		}
	}
}
