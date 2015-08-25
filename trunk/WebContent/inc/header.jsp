<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>自如友家后台管理系统</title>
	
	<link rel="stylesheet" type="text/css" href="css/960.css"/>
	<link rel="stylesheet" type="text/css" href="css/reset.css"/>
	<link rel="stylesheet" type="text/css" href="css/text.css"/>
	<link rel="stylesheet" type="text/css" href="css/blue.css"/>
	<link rel="stylesheet" type="text/css" href="css/formValidator.css"/>
	<link rel="stylesheet" type="text/css" href="css/smoothness/ui.css"/>
	<link rel="stylesheet" type="text/css" href="themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="themes/icon.css">
	<link rel="stylesheet" type="text/css" href="css/niceforms-default.css">
	
	<script type="text/javascript" src="js/jquery-1.4.4.min.js"></script>
	<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="js/jquery.easyui.form.js"></script>
	<script type="text/javascript" src="js/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="js/blend/jquery.blend.js"></script>
	<script type="text/javascript" src="js/wysiwyg/jquery.wysiwyg.js"></script>
	<script type="text/javascript" src="js/ui.core.js"></script>
	<script type="text/javascript" src="js/ui.sortable.js"></script>    
	<script type="text/javascript" src="js/ui.dialog.js"></script>
	<script type="text/javascript" src="js/effects.js"></script>
	<script type="text/javascript" src="js/validator.js"></script>
	<script type="text/javascript" src="js/jquery-validator.js"></script>
	<script type="text/javascript" src="js/jquery.form.js"></script>
	<script type="text/javascript" src="js/jquery.window.js"></script>
	<!--  
	<script type="text/javascript" src="js/graphs.js"></script>
	<script type="text/javascript" src="js/flot/jquery.flot.pack.js"></script>
	<script type="text/javascript" src="js/flot/excanvas.pack.js"></script>
	-->
	<script type="text/javascript">
		$(document).ready(function(){
			// 渲染菜单效果
			$("#menu_group_main a").blend();
			// 切换风格
			$(".dropdown").click(function() { 
				$("#colorchanger").slideToggle("fast");	
			});
			// 渲染portlet
			$(".portlet").addClass("ui-widget ui-widget-content ui-helper-clearfix ui-corner-all")
				.find(".portlet-header")
					.addClass("ui-widget-header ui-corner-top")
					.prepend('<span class="ui-icon ui-icon-triangle-1-n"></span>')
					.end()
				.find(".portlet-content");
			/*
			$(".portlet-header .ui-icon").click(function() {
				$(this).parents(".portlet:first").find(".portlet-content").slideToggle("fast");
				$(this).toggleClass("ui-icon-triangle-1-s"); 
				return false;	
			});
			$(".column").sortable({
				connectWith: '.column',
				handle: '.portlet-header'
			});
			$(".column").disableSelection();
			$(".inline_calendar").click(function() { 
				$(".hidden_calendar").toggle("fast");
			});
			$(".info").click(function() {
				$(this).slideUp("fast");							 	  
			});
			*/
		});
	</script>
	
	<!--[if IE6]>
	<link rel="stylesheet" type="text/css" href="css/iefix.css" />
	<![endif]-->
	<!--[if IE 6]>
	<link rel="stylesheet" type="text/css" href="css/iefix.css"/>
	<script src="js/pngfix.js"></script>
	<script>
		DD_belatedPNG.fix('#menu ul li a span span');
	</script>    
	<![endif]-->
</head>


<body>
	<!-- WRAPPER START 页面部分的开始， 整个页面的第一个div -->
	<div class="container_16" id="wrapper">
	
		<!-- 隐藏的颜色主题皮肤  -->
		<div style="position: relative;">
			<div id="colorchanger">
				<a href="dashboard_red.html"><span class="redtheme">红色</span></a>
				<a href="dashboard.html"><span class="bluetheme">蓝色</span></a> 
				<a href="dashboard_green.html"><span class="greentheme">绿色</span></a>
			</div>
		</div>
		
		
		<!--LOGO 自如友家的Logo图片-->
		<div class="grid_8" id="logo">
			自如。友家
		</div>
		
		<div class="grid_8">
			<!-- 用户工具条 -->
			<div id="user_tools">
				<span>
					<a href="#" class="mail" alt="系统消息">(1)</a> 欢迎 
					<a href="#">欢迎：自如管家</a> | <a class="dropdown" href="#">更换风格</a> | 
					<a href="#">退出系统</a>
				</span>
			</div>
		</div>
		
		
		<!-- 一级菜单容器 -->
		<div class="grid_16" id="header">
			<!-- 一级菜单 -->
			<div id="menu">
				<ul class="group" id="menu_group_main">
					<!--  
					<li class="item first" id="one">
						<a href="dashboard.html" class="main current"><span class="outer"><span class="inner dashboard">主页</span></span></a></li>
					<li class="item middle" id="two">
						<a href="buildingEditPage.do" class="main"><span class="outer"><span class="inner content">房屋管理</span></span></a></li>
					<li class="item middle" id="three">
						<a href="#" class="main"><span class="outer"><span class="inner users">合同管理</span></span></a></li>
					<li class="item middle" id="four">
						<a href="#" class="main"><span class="outer"><span class="inner reports">房源管理</span></span></a></li>
					<li class="item middle" id="five">
						<a href="#" class="main"><span class="outer"><span class="inner media_library">客户管理</span></span></a></li>        
					<li class="item middle" id="six">
						<a href="#" class="main"><span class="outer"><span class="inner event_manager">产品管理</span></span></a></li>        
					<li class="item middle" id="seven">
						<a href="#" class="main"><span class="outer"><span class="inner newsletter">投诉管理</span></span></a></li>        
					<li class="item last" id="eight">
						<a href="#" class="main"><span class="outer"><span class="inner settings">内容管理</span></span></a></li> 
					-->
					<s:set id="menuLength" value="#application.menu.size"/>
					<s:set id="selectedFirst" value="#request.selectedFirst"/>
					<s:set id="count" value="0"/>
					<s:iterator id="menu" value="#application.menu">
						<s:if test="#count == 0">
							<li class="item first" id="one">
						</s:if>
						<s:elseif test="#count == 7">
							<li class="item last" id="eight">
						</s:elseif>
						<s:else>
							<li class="item middle" id="two">
						</s:else>
							<s:if test="#selectedFirst == null && #count == 0">
								<s:set id="nodeList" value="#menu.nodeList"/>
								<a href="<s:property value="#menu.url"/>" class="main current">
							</s:if>
							<s:elseif test="#selectedFirst == #menu.privilege_code">
								<s:set id="nodeList" value="#menu.nodeList"/>
								<a href="<s:property value="#menu.url"/>" class="main current">
							</s:elseif>
							<s:else>
								<a href="<s:property value="#menu.url"/>" class="main">
							</s:else>	
									<span class="outer">
										<span class='<s:property value="#menu.path"/>'><s:property value="#menu.privilege_name"/></span>
									</span>
								</a>
							</li>
						<s:set id="count" value="#count+1"/>
					</s:iterator>
				</ul>
			</div>
		</div>
		
		<div class="grid_16">
			<!-- tabs start 二级导航标签内容 -->
			<div id="tabs">
				<div class="container">
					<ul>
						<s:set id="selectedSecond" value="#request.selectedSecond" />
						<s:set id="cc" value="0"/>
						<s:iterator id="node" value="#nodeList">			
							<li>
								<s:if test="#selectedSecond == null && #cc==0">
									<a href="<s:property value="#node.url"/>" class="current">
								</s:if>
								<s:elseif test="#selectedSecond == #node.privilege_code">
									<a href="<s:property value="#node.url"/>" class="current">
								</s:elseif>
								<s:else>
									<a href="<s:property value="#node.url"/>">
								</s:else>
									<span><s:property value="#node.privilege_name"/></span>
								</a>
							</li>
							<s:set id="cc" value="#cc+1"/>
						</s:iterator>
						<!--  
						<li><a href="#" class="current"><span>公告板元素</span></a></li>
						<li><a href="forms.html"><span>内容编辑</span></a></li>
						<li><a href="#"><span>二级子菜单</span></a></li>
						<li><a href="#"><span>二级子菜单</span></a></li>
						<li><a href="#"><span>二级子菜单</span></a></li>
						<li><a href="#"><span>二级子菜单</span></a></li>
						<li><a href="#" class="more"><span>更多子菜单</span></a></li>  
						-->
					</ul>
				</div>
			</div>
		</div>
		<div class="grid_16" id="content">