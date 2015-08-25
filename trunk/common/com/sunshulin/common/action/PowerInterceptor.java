package com.sunshulin.common.action;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * 权限拦截器,判断用户是否有使用系统功能拦截器，如果没有提示用户没有使用功能权限界面
 * @author 孙树林
 *
 */
public class PowerInterceptor extends AbstractInterceptor {

	private static final long serialVersionUID = 7624666476375155447L;
	/** 权限 */
	private static final String POWER_PAGE = "powerPage";

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		return actionInvocation.invoke();
	}

}
