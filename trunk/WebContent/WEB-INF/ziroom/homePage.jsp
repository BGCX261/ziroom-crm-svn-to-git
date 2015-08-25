<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="/inc/header.jsp"/>

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
		<div class="column" id="left">
			<div class="portlet">
				<div class="portlet-header">
					<img src="/images/icons/chart_bar.gif" width="16" height="16" alt="Reports" /> Visitors - Last 30 days
				</div>
				<div class="portlet-content">
					<div id="placeholder" style="width: auto; height: 250px;"></div>
				</div>
			</div>
			<div class="portlet">
				<div class="portlet-header">Anything (no icon too if you like it better)</div>
				<div class="portlet-content">
					<p>
						This can be any content you want. I placed a basic form
						here with text editor so you can see the functionality of the
						forms too.
					</p>
					<h3>This is a form</h3>
					<form id="form1" name="form1" method="post" action="">
						<label>Some title</label> 
						<input type="text" name="textfield" id="textfield" class="smallInput" /> 
						<label>Large input box</label>
						<input type="text" name="textfield2" id="textfield2" class="largeInput" />
						<label>This is a textarea</label>
						<textarea name="textarea" cols="45" rows="3" class="smallInput" id="textarea"></textarea>
						<a class="button"><span>Submit in blue</span></a> 
						<a class="button_grey"><span>Submit this form</span></a>
					</form>
					<p>&nbsp;</p>
				</div>
			</div>
		</div>
		<div class="column">
			<div class="portlet">
				<div class="portlet-header">
					<img src="/images/icons/comments.gif" width="16" height="16" alt="Comments" />Latest Comments
				</div>
				<div class="portlet-content">
					<p class="info" id="success">
						<span class="info_inner">Lorem ipsum dolor sit amet,consectetuer adipiscing elit</span>
					</p>
					<p class="info" id="error">
						<span class="info_inner">Lorem ipsum dolor sit amet,consectetuer adipiscing elit</span>
					</p>
					<p class="info" id="warning">
						<span class="info_inner">Lorem ipsum dolor sit amet,consectetuer adipiscing elit</span>
					</p>
					<p class="info" id="info">
						<span class="info_inner">Lorem ipsum dolor sit amet,consectetuer adipiscing elit</span>
					</p>
					Lorem ipsum dolor sit amet, consectetuer adipiscing elit
				</div>
			</div>
			<div class="portlet">
				<div class="portlet-header">
					<img src="/images/icons/feed.gif" width="16" height="16" alt="Feeds" />Your selected News source
				</div>
				<div class="portlet-content">
					<ul class="news_items">
						<li>
							Lorem ipsum dolor sit amet, consectetur adipiscing
							elit. Aenean adipiscing massa quis arcu interdum scelerisque.
							Duis vitae nunc nisi. Quisque eget leo a nibh gravida vulputate
							ut sed nulla. <a href="#">Donec quis lectus turpis, sed
								mollis nibh</a>. Donec ut mi eu metus ultrices porttitor.
							Phasellus nec elit in nisi
						</li>
						<li>
							Nunc convallis, enim quis tincidunt dictum, ante ipsum
							interdum massa, consequat sodales arcu magna nec eros.<a
							href="#"> Vivamus nec placerat odio.</a> Sed nec mi sed orci
							mattis feugiat. Etiam est dui, rutrum nec dictum vel, accumsan
							id sem.
						</li>
						<li>
							Nunc convallis, enim quis tincidunt dictum, ante ipsum
							interdum massa, consequat sodales arcu magna nec eros.<a
							href="#"> Vivamus nec placerat odio.</a> Sed nec mi sed orci
							mattis feugiat. Etiam est dui, rutrum nec dictum vel, accumsan
							id sem.
						</li>
						<li>
							Nunc convallis, enim quis tincidunt dictum, ante ipsum
							interdum massa, consequat sodales arcu magna nec eros.<a
							href="#"> Vivamus nec placerat odio.</a> Sed nec mi sed orci
							mattis feugiat. Etiam est dui, rutrum nec dictum vel, accumsan
							id sem.
						</li>
						<li>
							Nunc convallis, enim quis tincidunt dictum, ante ipsum
							interdum massa, consequat sodales arcu magna nec eros.<a
							href="#"> Vivamus nec placerat odio.</a> Sed nec mi sed orci
							mattis feugiat.
						</li>
					</ul>
					<a href="#">&raquo; View all news items</a>
				</div>
			</div>
		</div>
		<div class="clear"></div>
	</div>
<jsp:include page="/inc/footer.jsp"/>