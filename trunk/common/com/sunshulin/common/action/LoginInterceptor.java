package com.sunshulin.common.action;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.sunshulin.common.manager.SessionManager;

/**
 * 用户登录拦截器，如果用户没有登录或者session失效返回到登录界面
 * 
 * @author 孙树林
 * 
 */
public class LoginInterceptor extends AbstractInterceptor {

	private static final long serialVersionUID = -4630216548108313960L;

	/** 登录界面 */
	private final String RESULT_LOGIN = "login";

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		// 判断用户是否登录
//		if (!SessionManager.isLogin()) {
//			return RESULT_LOGIN;
//		}
		return actionInvocation.invoke();
	}

}
