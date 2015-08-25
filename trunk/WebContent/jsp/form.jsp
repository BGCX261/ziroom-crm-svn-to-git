<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="/inc/header.jsp"/>
<script type="text/javascript" src="js/jquery.jNice.js"></script>
<link href="css/jNice.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="css/autocomplete.css"/>
<div class="grid_16" id="content">
	<!--  模块标题  -->
	<div class="grid_9">
		<h1 class="dashboard">form表单样式</h1>
	</div>
	<!-- 模块事件提示(按情况使用)是个日历 -->
	<div class="grid_6" id="eventbox">
		<a href="#" class="inline_calendar">
			You don't have any events for today! Yay!
		</a>
		<div class="hidden_calendar"></div>
	</div>
	<div class="clear"></div>
	<div>
		<form class="jNice">
			<table width="400" border="0" cellpadding="3" cellspacing="0">
				<tr height="20">
					<td width="100" align="right">Text:</td>
					<td><input name="textfield" type="text" id="textfield" size="30" /></td>
				</tr>
				<tr height="20">
					<td align="right">Password:</td>
					<td><input type="password" name="textfield2" id="textfield2" size="10" /></td>
				</tr>
				<tr height="20">
					<td align="right">Select:</td>
					<td>
						<select name="select" id="select">
							<option value="" selected="selected">Please Choose</option>
							<option value="1">Option 1</option>
							<option value="2">Option 2</option>
							<option value="3">Option 3</option>
							<option value="4">Option 4</option>
							<option value="5">Option 5</option>
							<option value="6">Option 6</option>
							<option value="7">Option 7</option>
							<option value="8">Option 8</option>
							<option value="9">Option 9 with a really long line, that should wrap</option>
							<option value="10">Option 10</option>
							<option value="11">Option 11</option>
						</select>
					</td>
				</tr>
				<tr height="20">
					<td align="right">Select 2:</td>
					<td>
						<select name="select" id="select2" onchange="alert('changed select 2');" style="width: 150px;">
							<option value="" selected="selected">Please Choose</option>
							<option value="1">Option 1</option>
							<option value="2">Option 2</option>
							<option value="3">Option 3</option>
							<option value="4">Option 4</option>
							<option value="5">Option 5</option>
							<option value="6">Option 6</option>
							<option value="7">Option 7</option>
							<option value="8">Option 8</option>
							<option value="9">Option 9 with a really long line, that should wrap</option>
							<option value="10">Option 10</option>
							<option value="11">Option 11</option>
						</select>
					</td>
				</tr>
				<tr height="20">
					<td align="right">Radio:</td>
					<td>
						<table border="0" cellpadding="0" cellspacing="0">
							<tr>
								<td>
									<label><input type="radio" name="radio" value="1" id="radio_0" onchange="alert('radio alter');" />Yes</label>
								</td>
							</tr>
							<tr>
								<td>
									<label><input type="radio" name="radio" value="0" id="radio_1" />No</label>
								</td>
							</tr>
							<tr>
								<td>
									<label><input type="radio" name="radio" value="-1" id="radio_2" />Maybe So</label>
								</td>
							</tr>
						</table>
					</td>
				</tr>
				<tr height="20">
					<td align="right">Radio 2:</td>
					<td>
						<table border="0" cellpadding="0" cellspacing="0">
							<tr>
								<td>
									<label><input type="radio" name="radio2" value="1" id="radio_0" />Yes</label>
								</td>
								<td>
									<label><input type="radio" name="radio2" value="0" id="radio_1" />No</label>
								</td>
								<td>
									<label><input type="radio" name="radio2" value="-1" id="radio_2" />Maybe So</label>
								</td>
							</tr>
						</table>
					</td>
				</tr>
				<tr height="20">
					<td align="right">Checkbox:</td>
					<td><input type="checkbox" name="checkbox" id="checkbox" /></td>
				</tr>
				<tr height="20">
					<td align="right">Checkbox 2:</td>
					<td><input type="checkbox" name="checkbox2" /></td>
				</tr>
				<tr height="20">
					<td align="right">Buttons:</td>
					<td>
						<input type="button" name="Submit" id="Submit" value="Submit" onclick="alert('a');"/>
						<input type="reset" value="Reset" />
					</td>
				</tr>
				<tr height="20">
					<td align="right">&nbsp;</td>
					<td>&nbsp;</td>
				</tr>
			</table>
		</form>
	</div>
</div>
<jsp:include page="/inc/footer.jsp"/>