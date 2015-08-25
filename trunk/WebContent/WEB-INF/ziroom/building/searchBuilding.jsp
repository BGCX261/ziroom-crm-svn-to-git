<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="ziroom" uri="/sunshulin"%>
<jsp:include page="/inc/header.jsp"/>
<script>
		$(function(){
			$("#jp").combobox({
				
			});
		 	$("#buildingType").combobox({
		 		url:'getDictType.do?dictType=HOUSE_TOWARD',
				data:[{'dictType':'HOUSE_TOWARD'}],
		 	    valueField:'dictName',
		 	    textField:'dictValue'
		 	});
		 	$("#elevator").combobox({
		 		url:'getDictType.do?dictType=HOUSE_TOWARD',
				data:[{'dictType':'HOUSE_TOWARD'}],
		 	    valueField:'dictName',
		 	    textField:'dictValue'
		 	});
		 	$("#heating").combobox({
		 		url:'getDictType.do?dictType=HOUSE_TOWARD',
				data:[{'dictType':'HOUSE_TOWARD'}],
		 	    valueField:'dictName',
		 	    textField:'dictValue'
		 	});
		 	$("#orientation").combobox({
		 		url:'getDictType.do?dictType=HOUSE_TOWARD',
				data:[{'dictType':'HOUSE_TOWARD'}],
		 	    valueField:'dictName',
		 	    textField:'dictValue'
		 	});
		 	$('#floor').numberbox();
		 	$('#totalFloor').numberbox();
		 	$('#buildingArea').numberbox({precision:2});
		 	$('#useArea').numberbox({precision:2});
		 	$('#bedroomAmount').numberspinner({min:0, max:10});
		 	$('#parlorAmount').numberspinner({min:0, max:10});
		 	$('#toiletAmount').numberspinner({min:0, max:10});
		 	$('#cookroomAmount').numberspinner({min:0, max:10});
		 	$('#balconyAmount').numberspinner({min:0, max:10});
		 	$('#terraceAmount').numberspinner({min:0, max:10});
		 	$('#gardenAmount').numberspinner({min:0, max:10});
			closeWin();
			$('#building').datagrid({
				title:'房屋列表',
				height:550,
				nowrap: false,
				striped: true,
				collapsible:true,
				url:'searchBuilding.do',
				remoteSort: false,
				idField:'buildingId',
				singleSelect:true,
				pageSize : 30,
				columns:[[
							{field:'buildingId',title:'房屋ID',width:80,hidden:true},
							{field:'buildingNumber',title:'房屋编号',width:80},
							{field:'unit',title:'单元',width:100},
							{field:'houseNumber',title:'门牌号',width:100},
							{field:'productid',title:'居室',width:100},
							{field:'buildingType',title:'建筑类型',width:80,align:'right',formatter:formatter},
							{field:'useArea',title:'使用面积',width:80,align:'right'},
							{field:'orientation',title:'房屋朝向',width:150,formatter:formatter},
							{field:'executiveAddress',title:'行政地址',width:60,align:'center'},
							{field:'propertyAddress',title:'产权地址',width:60,align:'center'},
							{field:'buildingStatus',title:'房屋状态',width:60,align:'center'}
						]],
				pagination:true,
				rownumbers:true,
				toolbar:[{
					id:'btnadd',
					text:'房屋登记',
					iconCls:'icon-add',
					handler:function(){
						addHouse();
					}
				},'-',{
					id:'btnadd',
					text:'实堪',
					iconCls:'icon-add',
					handler:function(){
						
					}
				},'-',{
					id:'btnadd',
					text:'跟进',
					iconCls:'icon-add',
					handler:function(){
						
					}
				}],
				onDblClickRow:function(rowIndex, rowData) {
					loadHouse(rowData.buildingId);
				}
			});
		});
		function closeWin() {
			$('#w').window('close');
		}
		function editBuilding() {
			$('#buildingForm').form('submit', {
				url:'editBuilding.do',
				onSubmit:function() {
					return $.checkedForm("buildingForm",[]);
				},
				success:function() {
					closeWin();
					$('#building').datagrid("reload");
				}
			});
		}
		function addHouse() {
			$('#buildingForm').form('clear');
			$('#w').window({
				title: '房屋登记',
				width: 800,
				modal: true,
				shadow: false,
				closed: false,
				height :520,
			});
		}
		function loadHouse(id) {
			$('#buildingForm').form('clear');
			$('#buildingForm').form('loadJsonToForm','findBuilding.do?buildingId='+id);
			$('#w').window({
				title: '编辑',
				width: 800,
				modal: true,
				shadow: false,
				closed: false,
				height :520,
			});
		}
		function formatter(value){
			var o = eval('(' + '<ziroom:dict dictType="HOUSE_TOWARD"/>' + ')');
			var finalValue = '';
			$.each(o, function() {
				var x = this;
				if(x.dictName==value) {
					finalValue = x.dictValue;	
				}
			});
			return finalValue;
		}
	</script>
<div class="grid_9">
	<h1 class="dashboard">房屋管理</h1>
</div>
<div class="grid_6" id="eventbox">
</div>
<div class="clear"></div>
<!-- portlets -->
<div id="portlets">
	<table id="building"></table>
</div>
<div class="clear"></div>
<!-- 房屋登记表单 -->
<div id="w" class="easyui-window" title="My Window" iconCls="icon-save" style="width:800px;padding:5px;background: #fafafa;">
	<div class="easyui-layout" fit="true">
		<div region="center" border="false" style="padding:10px;background:#fff;border:1px solid #ccc;">
			<form action="editBuilding.do" method="post" id="buildingForm">
			<input type="hidden" name="buildingId">
			<fieldset>
		    	<legend>小区信息</legend>
		        <table style="" width="100%" border="0" class="tableform">
		        	<tr>
		        		<td>小区简拼：</td>
		        		<td>
							<input id="jp" type="text" size="10" name="area.areaSpellingShort"  maxlength="30" value="<s:property value="area.areaSpellingShort"/>">
		        			
		        		</td>
		        		<td>小区名称：</td>
		        		<td>
							<input type="text" name="area.areaName" size="10" maxlength="30" value="<s:property value="area.areaName"/>">
		        		</td>
		        		<td>小区别名：</td>
		        		<td>
							<input type="text" name="area.areaAlias" size="10" maxlength="30" value="<s:property value="area.areaAlias"/>">
		        		</td>
		        	</tr>
		        	<tr>
		        		<td>小区地址：</td>
		        		<td colspan="5">
							<input type="text" name="area.areaAddress" size="50" maxlength="30" value="<s:property value="area.areaAddress"/>">
		        		</td>
		        	</tr>
		        </table>
		    </fieldset>
		    <fieldset>
		    	<legend>房屋信息</legend>
		        <table style="margin-top: 10px" width="100%" class="tableform">
		        	<tr>
		        		<td>房屋编号：</td>
		        		<td>
							<input type="text" name="buildingNumber" size="10" maxlength="30" value="<s:property value="buildingNumber"/>">
		        		</td>
		        		<td>单元：</td>
		        		<td>
							<input type="text" name="unit" size="5" maxlength="5" value="<s:property value="unit"/>">
		        		</td>
		        		<td>门牌号：</td>
		        		<td>
							<input type="text" name="houseNumber" size="5" maxlength="5" value="<s:property value="houseNumber"/>">
		        		</td>
		        		<td>楼层：</td>
		        		<td>
							<input type="text" id="floor" name="floor" size="3" maxlength="3" value="<s:property value="floor"/>">/
							<input type="text" id="totalFloor" name="totalFloor" size="3" maxlength="3" value="<s:property value="totalFloor"/>">
		        		</td>
		        		<td>建筑类型：</td>
		        		<td>
		        			<input type="text" style="width: 80px" id="buildingType" name="buildingType" size="3" maxlength="3" value="<s:property value="buildingType"/>">
							
		        		</td>
		        	</tr>
		        	<tr>
		        		<td>电梯情况：</td>
		        		<td>
		        			<input type="text" style="width: 80px" id="elevator" name="elevator" size="3" maxlength="3" value="<s:property value="elevator"/>">

		        		</td>
		        		<td>供暖方式：</td>
		        		<td>
		        			<input type="text" style="width: 80px" id="heating" name="heating" size="3" maxlength="3" value="<s:property value="heating"/>">

		        		</td>
		        		<td>房屋朝向：</td>
		        		<td>
		        			<input type="text" style="width: 80px" id="orientation" name="orientation" size="3" maxlength="3" value="<s:property value="orientation"/>">

		        		</td>
		        		<td>建筑面积：</td>
		        		<td>
							<input type="text" id="buildingArea" name="buildingArea" size="8" maxlength="8" value="<s:property value="buildingArea"/>">
		        		</td>
		        		<td>使用面积：</td>
		        		<td>
							<input type="text" id="useArea" name="useArea" size="8" maxlength="8" value="<s:property value="useArea"/>">
		        		</td>
		        	</tr>
		        	<tr>
		        		<td>行政地址：</td>
		        		<td colspan="4">
							<input type="text" name="executiveAddress" size="36" maxlength="36" value="<s:property value="executiveAddress"/>">
		        		</td>
		        		<td>产权地址：</td>
		        		<td colspan="4">
							<input type="text" name="propertyAddress" size="36" maxlength="36" value="<s:property value="propertyAddress"/>">
		        		</td>
		        	</tr>
		        	<tr>
		        		<td>户型：</td>
		        		<td colspan="9">
							<input type="text" id="bedroomAmount" name="bedroomAmount" size="2" maxlength="1" value="<s:property value="bedroomAmount"/>">
							&nbsp;室
							<input type="text" id="parlorAmount" name="parlorAmount" size="2" maxlength="1" value="<s:property value="parlorAmount"/>">
							&nbsp;厅
							<input type="text" id="toiletAmount" name="toiletAmount" size="2" maxlength="1" value="<s:property value="toiletAmount"/>">
							&nbsp;卫
							<input type="text" id="cookroomAmount" name="cookroomAmount" size="2" maxlength="1" value="<s:property value="cookroomAmount"/>">
							&nbsp;厨
							<input type="text" id="balconyAmount" name="balconyAmount" size="2" maxlength="1" value="<s:property value="balconyAmount"/>">
							&nbsp;阳台
							<input type="text" id="terraceAmount" name="terraceAmount" size="2" maxlength="1" value="<s:property value="terraceAmount"/>">
							&nbsp;花园
							<input type="text" id="gardenAmount" name="gardenAmount" size="2" maxlength="1" value="<s:property value="gardenAmount"/>">
							&nbsp;露台
		        		</td>
		        	</tr>
		        </table>
		    </fieldset>
		    <fieldset>
		    	<legend>业主信息</legend>
		        <table style="margin-top: 10px" width="100%">
		        	<tr>
		        		<td>业主名称：</td>
		        		<td>
							
		        		</td>
		        		<td>电话：</td>
		        		<td>
							
		        		</td>
		        		<td>身份证号：</td>
		        		<td>
							
		        		</td>
		        	</tr>
		        </table>
		    </fieldset>
		</form>
		</div>
		<div region="south" border="false" style="text-align:right;height:30px;line-height:30px;">
			<a class="easyui-linkbutton" iconCls="icon-ok" href="javascript:void(0)" onclick="editBuilding()">确认</a>
			<a class="easyui-linkbutton" iconCls="icon-cancel" href="javascript:void(0)" onclick="closeWin()">关闭</a>
		</div>
	</div>
</div>
<ziroom:validator actionName="editBuilding" formId="buildingForm"/>
<jsp:include page="/inc/footer.jsp"/>