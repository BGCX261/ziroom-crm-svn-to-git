package com.sunshulin.spring;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * spring sqlmapper 通知类型:后置通知
 * 
 * @author 孙树林
 * 
 */
public class MapperAfterReturningAdvice implements MethodBeforeAdvice {

	/**
	 * 前置通知
	 * 
	 * @param method
	 * @param parameters
	 * @param target
	 * @throws Throwable
	 */
	@Override
	public void before(Method method, Object[] parameters, Object target) throws Throwable {
		
	}
}
