<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="/inc/header.jsp"/>
<script type="text/javascript" src="js/ui.datepicker.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		// 渲染portlet
		$(".portlet").addClass("ui-widget ui-widget-content ui-helper-clearfix ui-corner-all")
			.find(".portlet-header")
				.addClass("ui-widget-header ui-corner-top")
				.prepend('<span class="ui-icon ui-icon-triangle-1-n"></span>')
				.end()
			.find(".portlet-content");
		// 加入折叠
		$(".portlet-header .ui-icon").click(function() {
			$(this).parents(".portlet:first").find(".portlet-content").slideToggle("fast");
			$(this).toggleClass("ui-icon-triangle-1-s"); 
			return false;	
		});
		// 日历
		$(".hidden_calendar").datepicker();
		$(".inline_calendar").click(function() { 
			$(".hidden_calendar").toggle("fast");
		});	
	});
</script>
<div class="grid_16" id="content">
	<!--  模块标题  -->
	<div class="grid_9">
		<h1 class="dashboard">Dashboard</h1>
	</div>
	<!-- 模块事件提示(按情况使用)是个日历 -->
	<div class="grid_6" id="eventbox">
		<a href="#" class="inline_calendar">
			You don't have any events for today! Yay!
		</a>
		<div class="hidden_calendar"></div>
	</div>
	<div class="clear"></div>
	<!-- portlets -->
	<div id="portlets">
		<div class="clear"></div>
		<!-- portlet容器 -->
		<div class="portlet">
			<div class="portlet-header fixed">
				<img src="images/icons/user.gif" width="16" height="16" alt="Latest Registered Users" />Last Registered users Table Example
			</div>
			<div class="portlet-content nopadding">
				<form action="" method="post">
					<!-- 表格 -->
					<table width="100%" cellpadding="0" cellspacing="0"
						id="box-table-a" summary="Employee Pay Sheet">
						<thead>
							<tr>
								<th width="34" scope="col">
									<input type="checkbox" name="allbox" id="allbox" onclick="checkAll()" />
								</th>
								<th width="136" scope="col">Name</th>
								<th width="102" scope="col">Username</th>
								<th width="109" scope="col">Date</th>
								<th width="129" scope="col">Location</th>
								<th width="171" scope="col">E-mail</th>
								<th width="123" scope="col">Phone</th>
								<th width="90" scope="col">Actions</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td width="34">
									<label><input type="checkbox" name="checkbox" id="checkbox" /></label>
								</td>
								<td>Stephen C. Cox</td>
								<td>stephen</td>
								<td>20.06.2009</td>
								<td>Los Angeles, CA</td>
								<td>address1@yahoo.com</td>
								<td>332-5447879</td>
								<td width="90">
									<a href="#" class="approve_icon" title="Approve"></a>
									<a href="#" class="reject_icon" title="Reject"></a>
									<a href="#" class="edit_icon" title="Edit"></a>
									<a href="#" class="delete_icon" title="Delete"></a>
								</td>
							</tr>
							<tr>
								<td width="34">
									<input type="checkbox" name="checkbox2" id="checkbox2" />
								</td>
								<td>Josephin Tan</td>
								<td>josephin</td>
								<td>20.06.2009</td>
								<td>Los Angeles, CA</td>
								<td>address1@yahoo.com</td>
								<td>332-5447879</td>
								<td width="90">
									<a href="#" class="approve_icon" title="Approve"></a>
									<a href="#" class="reject_icon" title="Reject"></a>
									<a href="#" class="edit_icon" title="Edit"></a>
									<a href="#" class="delete_icon" title="Delete"></a>
								</td>
							</tr>
							<tr>
								<td width="34">
									<input type="checkbox" name="checkbox3" id="checkbox3" />
								</td>
								<td>Joyce Ming</td>
								<td>joyce_m</td>
								<td>20.06.2009</td>
								<td>Los Angeles, CA</td>
								<td>address1@yahoo.com</td>
								<td>332-5447879</td>
								<td width="90">
									<a href="#" class="approve_icon" title="Approve"></a>
									<a href="#" class="reject_icon" title="Reject"></a>
									<a href="#" class="edit_icon" title="Edit"></a>
									<a href="#" class="delete_icon" title="Delete"></a>
								</td>
							</tr>
							<tr>
								<td width="34">
									<input type="checkbox" name="checkbox4" id="checkbox4" />
								</td>
								<td>James A. Pentel</td>
								<td>james_pent</td>
								<td>20.06.2009</td>
								<td>Los Angeles, CA</td>
								<td>address1@yahoo.com</td>
								<td>332-5447879</td>
								<td width="90">
									<a href="#" class="approve_icon" title="Approve"></a>
									<a href="#" class="reject_icon" title="Reject"></a>
									<a href="#" class="edit_icon" title="Edit"></a>
									<a href="#" class="delete_icon" title="Delete"></a>
								</td>
							</tr>
							<!-- 分页 -->
							<tr class="footer">
								<td colspan="4">
									<!-- 操作 -->
									<a href="#" class="edit_inline">Edit all</a>
									<a href="#" class="delete_inline">Delete all</a>
									<a href="#" class="approve_inline">Approve all</a>
									<a href="#" class="reject_inline">Reject all</a>
								</td>
								<td align="right">&nbsp;</td>
								<td colspan="3" align="right">
									<!-- 分页信息 -->
									<div class="pagination">
										<span class="previous-off">&laquo; Previous</span> 
										<span class="active">1</span> 
										<a href="dashboard.html-page=2.htm">2</a>
										<a href="dashboard.html-page=3.htm">3</a>
										<a href="dashboard.html-page=4.htm">4</a>
										<a href="dashboard.html-page=5.htm">5</a>
										<a href="dashboard.html-page=6.htm">6</a>
										<a href="dashboard.html-page=7.htm">7</a>
										<a href="dashboard.html-page=2.htm"class="next">Next &raquo;</a>
									</div>
								</td>
							</tr>
						</tbody>
					</table>
				</form>
			</div>
		</div>
	</div>
	<div class="clear"></div>
</div>
<jsp:include page="/inc/footer.jsp"/>