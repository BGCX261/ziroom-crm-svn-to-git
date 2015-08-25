package com.sunshulin.servlet;

import java.util.List;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import cn.ziroom.basic.mapper.Dict;
import cn.ziroom.basic.service.DictService;
import cn.ziroom.privileges.mapper.Privileges;
import cn.ziroom.privileges.service.PrivilegesService;

/*
 * 初始化的一个Servlet
 */
public class InitResourceServlet extends HttpServlet {

	private static final long serialVersionUID = -4133533753881272937L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		initResources(config.getServletContext());
		initDict(config.getServletContext());
	}

	/**
	 * 初始化系统菜单资源
	 */
	private void initResources(ServletContext servletContext) {
		WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(servletContext);
		PrivilegesService service = (PrivilegesService) context.getBean("privilegesService");
		// 获得一级菜单及其子菜单
		List<Privileges> firstMenu = service.searchPrivilegesByCode(null);
		servletContext.setAttribute("menu", firstMenu);
	}

	/**
	 * 初始化数据字典数据
	 * 
	 * @param servletContext
	 */
	private void initDict(ServletContext servletContext) {
		WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(servletContext);
		DictService service = (DictService) context.getBean("dictService");
		Map<String, String> maps = service.searchDict();
		servletContext.setAttribute("dict", maps);
	}
}
