/**
 * 根据城市名称查询该城市下的地区
 * 
 * @param value
 * @param param
 */
function selectDistrict(value, param1, param2, param3) {
	if (value != "") {
		// 删除option选项
		$("#district").children().remove();
		$.post("searchDistrictByCity.do", {
			"city.city_name" : value
		}, function(json) {
			var data = json.data;
			$("<option/>").attr("value", "").text("请选择..").appendTo(
					$("#district"));
			for ( var i = 0; i < data.length; i++) {
				var node = data[i];
				if (param1 && param1 == node.district_name) {
					$("<option/>").attr("selected", "selected").attr("value", node.district_name).text(
							node.district_name).appendTo($("#district"));
				} else {
					$("<option/>").attr("value", node.district_name).text(
							node.district_name).appendTo($("#district"));
				}
				
			}
		}, "json");
		// 环线
		selectCycle(value, param2);
		// 地铁线
		selectSubway(value, param3);
	} else {
		$("#district").children().remove();
		$("<option/>").attr("value", "").text("请选择..").appendTo($("#district"));
		$("#bussiness").children().remove();
		$("<option/>").attr("value", "").text("请选择..").appendTo($("#bussiness"));
		$("#cucle").children().remove();
		$("<option/>").attr("value", "").text("请选择..").appendTo($("#cucle"));
		$("#subway").children().remove();
		$("<option/>").attr("value", "").text("请选择..").appendTo($("#subway"));
		$("#stations").children().remove();
		$("<option/>").attr("value", "").text("请选择..").appendTo($("#stations"));
	}
}
/**
 * 根据地区名称查询该地区下的商圈
 * 
 * @param value
 * @param param
 */
function selectBusiness(value, param) {
	if (value != "") {
		// 删除option选项
		$("#bussiness").children().remove();
		$.post("searchBusinessByDistrict.do", {
			"district.district_name" : value
		}, function(json) {
			var data = json.data;
			$("<option/>").attr("value", "").text("请选择..").appendTo(
					$("#bussiness"));
			for ( var i = 0; i < data.length; i++) {
				var node = data[i];
				if (param && param == node.business_name) {
					$("<option/>").attr("selected","selected").attr("value", node.business_name).text(
							node.business_name).appendTo($("#bussiness"));
				} else {					
					$("<option/>").attr("value", node.business_name).text(
							node.business_name).appendTo($("#bussiness"));
				}
			}
		}, "json");
	} else {
		$("#bussiness").children().remove();
		$("<option/>").attr("value", "").text("请选择..").appendTo($("#bussiness"));
	}
}
/**
 * 根据城市名称查询该城市下的环线
 * 
 * @param value
 * @param param
 */
function selectCycle(value, param) {
	if (value != "") {
		// 删除option选项
		$.post("searchCycleByCity.do", {
			"city.city_name" : value
		}, function(json) {
			var data = json.data;
			$("#cucle").children().remove();
			$("<option/>").attr("value", "").text("请选择..").appendTo($("#cucle"));
			for ( var i = 0; i < data.length; i++) {
				var node = data[i];
				if (param && param == node.cycle_name) {
					$("<option/>").attr("selected","selected").attr("value", node.cycle_name).text(
							node.cycle_name).appendTo($("#cucle"));
				} else {					
					$("<option/>").attr("value", node.cycle_name).text(
							node.cycle_name).appendTo($("#cucle"));
				}
			}
		}, "json");
	} else {
		$("#cucle").children().remove();
		$("<option/>").attr("value", "").text("请选择..").appendTo($("#cucle"));
	}
}
/**
 * 根据城市名称查询该城市下的地铁线
 * 
 * @param value
 * @param param
 */
function selectSubway(value, param) {
	if (value != "") {
		// 删除option选项
		$.post("searchSubwayByCity.do", {
			"city.city_name" : value
		}, function(json) {
			var data = json.data;
			$("#subway").children().remove();
			$("<option/>").attr("value", "").text("请选择..").appendTo(
					$("#subway"));
			for ( var i = 0; i < data.length; i++) {
				var node = data[i];
				if (param && param == node.subway_name) {
					$("<option/>").attr("selected","selected").attr("value", node.subway_name).text(
							node.subway_name).appendTo($("#subway"));
				} else {					
					$("<option/>").attr("value", node.subway_name).text(
							node.subway_name).appendTo($("#subway"));
				}
			}
		}, "json");
	} else {
		$("#subway").children().remove();
		$("<option/>").attr("value", "").text("请选择..").appendTo($("#subway"));
		$("#stations").children().remove();
		$("<option/>").attr("value", "").text("请选择..").appendTo($("#stations"));
	}
}
/**
 * 根据地铁线查询该地铁下的站点
 * 
 * @param value
 * @param param
 */
function selectStation(value, param) {
	if (value != "") {
		// 删除option选项
		$("#stations").children().remove();
		$.post("searchSubwayStationByCity.do", {
			"subway.subway_name" : value
		}, function(json) {
			var data = json.data;
			$("<option/>").attr("value", "").text("请选择..").appendTo(
					$("#stations"));
			for ( var i = 0; i < data.length; i++) {
				var node = data[i];
				if (param && param == node.station_name) {
					$("<option/>").attr("selected", "selected").attr("value", node.station_name).text(
							node.station_name).appendTo($("#stations"));
				} else {					
					$("<option/>").attr("value", node.station_name).text(
							node.station_name).appendTo($("#stations"));
				}
			}
		}, "json");
	} else {
		$("#stations").children().remove();
		$("<option/>").attr("value", "").text("请选择..").appendTo($("#stations"));
	}
}

/**
 * 设置城市下拉框选项
 * @param value
 */
function setSelectedCity(value) {
	$("#city").children("option[value=" + value + "]").attr("selected", "selected");
}
/**
 * 设置朝向选择
 * @param value
 */
function setSelectedCycleFace(value) {
	$("#face").children("option[value=" + value + "]").attr("selected", "selected");
}
/**
 * 根据小区拼音返回的值设置信息
 * 
 * @param json
 */
function selectHouseEdit(json) {
	$("#estate_name").val(json.projectname);
	$("#projectcode").val(json.projectcode);
	$("#estate_year").val(json.completionyear);
	$("#estate_address").val(json.address);
	$("#bus_code").val(json.bus_code);
	var city = "";
	var distric = "";
	var business = "";
	var cycle = "";
	var face = "";
	var subway = "";
	var station = "";
	var _city = json.city;
	if (_city != null) {
		city = _city.city_name != null ? _city.city_name : "";
	}
	var _distric = json.district;
	if (_distric != null) {
		distric = _distric.district_name != null ? _distric.district_name : "";
	}
	var _business = json.business;
	if (_business != null) {
		business = _business.business_name != null ? _business.business_name : "";
	}
	var _cycle = json.cycle;
	if (_cycle != null) {
		cycle = _cycle.cycle_name != null ? _cycle.cycle_name : "";
	}
	var _face = json.cycleFace;
	if (_face != null) {
		face = _face.face_name != null ? _face.face_name : "";
	}
	var _subway = json.subway;
	if (_subway != null) {
		subway = _subway.subway_name != null ? _subway.subway_name : "";
	}
	var _station = json.station;
	if (_station != null) {
		station = _station.station_name != null ? _station.station_name : "";
	}
	// 城市
	setSelectedCity(city);
	// 地区
	selectDistrict(city, distric, cycle, subway);
	// 商圈
	selectBusiness(distric, business);
	// 环线
	//selectCycle(city, cycle);
	// 朝向
	setSelectedCycleFace(face);
	// 地铁
	//selectSubway(city, subway);
	// 地铁线
	selectStation(subway, station);
}