<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="g" uri="/sunshulin"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/autocomplete.css"/>
<script type="text/javascript" src="js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="js/autocomplete.js"></script>
<script type="text/javascript" src="js/localdata.js"></script>
<title></title>
<script type="text/javascript">
	$(document).ready(function(){
		$("#test").autocomplete({
			url: 'searchEstatesByPy.do',
			callBack: function(datas) {
				alert(datas.displayValue);
			} 
		});
		
	});
</script>
</head>
<body>
	<div style="height: 35px">小区拼音：<input type="text" name="estates.projectjianpin" id="test"/></div>
	
	<div style="height: 35px">数据字典：<g:dic name="test.name" type="HOUSE_FACE"/></div>
	<div style="height: 35px">所在商圈：<g:city id="city" name="test.city"/>
										<g:district id="district" name="test.district" refId="city"/>
										<g:business name="test.bussion" refId="district"/>
	</div>
	<div style="height: 35px">最近环线：<g:cycle name="test.cycle" refId="city"/><g:face name="test.face"/></div>
	<div style="height: 35px">最近地铁：<g:subway name="test.subway" refId="city" id="subway"/><g:station name="test.station" refId="subway"/></div>
</body>
</html>