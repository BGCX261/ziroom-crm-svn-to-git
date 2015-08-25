/**
 * JQuery验证,扩展jQuery对象本身添加验证方法
 */
(function($) {
	$
			.extend({
				/**
				 * 必填字段校验方法,判断表单内容是否为NULL,字符串参考requiredstring
				 * 
				 * @param val
				 */
				required : function(val) {
					if (val != undefined && val != "") {
						return true;
					} else {
						return false;
					}
				},
				/**
				 * 字符串必填校验方法
				 * 
				 * @param val
				 */
				requiredstring : function(val) {
					if (val != undefined) {
						val = val.replace(/(^\s*)|(\s*$)/g, "");
					} else {
						return false;
					}
					if (val.length == 0) {
						return false;
					} else {
						return true;
					}
				},
				/**
				 * 字符串长度校验方法
				 * 
				 * @param val
				 * @param min
				 * @param max
				 */
				stringlength : function(val, minLength, maxLength) {
					var len = -1;
					if (val != undefined) {
						len = val.length;
					} else {
						return false;
					}
					if (minLength != undefined && minLength != null) {
						if (!$.min(len, minLength)) {
							return false;
						}
					}
					if (maxLength != undefined && maxLength != null) {
						if (!$.max(len, maxLength)) {
							return false;
						}
					}
					return true;
				},
				/**
				 * 整数校验方法
				 * 
				 * @param val
				 * @param min
				 * @param max
				 */
				int : function(val, min, max) {
					if (val != null && val != undefined && val != "") {
						var reg = /^(\d*|\-?[1-9]{1}\d*)$/;
						if (!val.match(reg)) {
							return false;
						}
					} else {
						return true;
					}
					if (min != undefined && min != null) {
						if (val != "") {
							if (!$.min(parseInt(val), min)) {
								return false;
							}
						} else {
							return false;
						}
					}
					if (max != undefined && max != null) {
						if (val != "") {
							if (!$.max(parseInt(val), max)) {
								return false;
							}
						} else {
							return false;
						}
					}
					return true;
				},
				/**
				 * 浮点数值验证
				 * 
				 * @param val
				 * @param minInclusive
				 * @param maxInclusive
				 */
				double : function(val, minInclusive, maxInclusive) {
					if (val != null && val != undefined && val != "") {
						var reg = (/^-?([1-9]\d*\.\d+|[1-9]\d*|0|0\.\d*[1-9])$/);
						if (!val.match(reg)) {
							return false;
						}
					} else {
						return true;
					}
					if (minInclusive != undefined && minInclusive != null) {
						if (val != "") {
							if (!$.min(parseFloat(val), minInclusive)) {
								return false;
							}
						} else {
							return false;
						}
					}
					if (maxInclusive != undefined && maxInclusive != null) {
						if (val != "") {
							if (!$.max(parseFloat(val), maxInclusive)) {
								return false;
							}
						} else {
							return false;
						}
					}
					return true;
				},
				/**
				 * 邮箱验证
				 * 
				 * @param val
				 */
				email : function(val) {
					var reg = /^[_A-Za-z0-9]+(.[_A-Za-z0-9]+)*@[A-Za-z0-9]+(.[_A-Za-z0-9]+)+$/;
					return $.regex(val, reg);
				},
				/**
				 * 网址验证
				 * 
				 * @param val
				 */
				url : function(val) {
					var reg = /^(https?):\/\/(((([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(%[\da-f]{2})|[!\$&'\(\)\*\+,;=]|:)*@)?(((\d|[1-9]\d|1\d\d|2[0-4]\d|25[0-5])\.(\d|[1-9]\d|1\d\d|2[0-4]\d|25[0-5])\.(\d|[1-9]\d|1\d\d|2[0-4]\d|25[0-5])\.(\d|[1-9]\d|1\d\d|2[0-4]\d|25[0-5]))|((([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])*([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])))\.)+(([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])*([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])))\.?)(:\d*)?)(\/((([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(%[\da-f]{2})|[!\$&'\(\)\*\+,;=]|:|@)+(\/(([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(%[\da-f]{2})|[!\$&'\(\)\*\+,;=]|:|@)*)*)?)?(\?((([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(%[\da-f]{2})|[!\$&'\(\)\*\+,;=]|:|@)|[\uE000-\uF8FF]|\/|\?)*)?(\#((([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(%[\da-f]{2})|[!\$&'\(\)\*\+,;=]|:|@)|\/|\?)*)?$/i;
					return $.regex(val, reg);
				},
				/**
				 * 正则表达式验证
				 * 
				 * @param val
				 * @param reg
				 * @returns
				 */
				regex : function(val, reg) {
					if (val != null && val != "") {
						//reg = /((\d{11})|^((\d{7,8})|(\d{4}|\d{3})-(\d{7,8})|(\d{4}|\d{3})-(\d{7,8})-(\d{4}|\d{3}|\d{2}|\d{1})|(\d{7,8})-(\d{4}|\d{3}|\d{2}|\d{1}))$)/;
						return val.match(reg);
					} else {
						return true;
					}
				},
				/**
				 * 日期验证
				 * 
				 * @param val
				 * @param min
				 * @param max
				 */
				date : function(val, min, max) {
					if (val != null && val != undefined && val != "") {
						var reg = (/^[1-2]\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|[3][0-1])$/);
						if (reg.test(val)) {
							return false;
						} else {
							if (!$.isDate(val)) {
								return false;
							}
						}
					}
					var d = new Date(Date.parse(val.replace(/-/g, "/")));
					if (min != undefined && min != null) {
						if (val != "") {
							var m = new Date(Date.parse(min.replace(/-/g, "/")));
							if (d < m) {
								return false;
							}
						}
					}
					
					if (max != undefined && max != null) {
						if (val != "") {
							var m = new Date(Date.parse(max.replace(/-/g, "/")));
							if (d > m) {
								return false;
							}
						}
					}
					return true;
				},
				/**
				 * 判断最小
				 * 
				 * @param m
				 * @param j
				 * @returns {Boolean}
				 */
				min : function(m, j) {
					if (m < j) {
						return false;
					} else {
						return true;
					}
				},
				/**
				 * 判断最大
				 * 
				 * @param m
				 * @param j
				 * @returns {Boolean}
				 */
				max : function(m, j) {
					if (m > j) {
						return false;
					} else {
						return true;
					}
				},
				/**
				 * 合法日期验证
				 * 
				 * @param val
				 * @returns {Boolean}
				 */
				isDate : function(val) {
					var isTrue = true;
					var year, month, day;
					var d = val.split("-");
					year = parseInt(d[0]);
					month = parseInt(d[1]);
					day = d[2];
					switch (month) {
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						if (parseInt(day) <= 31 && parseInt(day) > 0) {
							isTrue = true;
						} else {
							isTrue = false;
						}
						break;
					case 4:
					case 6:
					case 9:
					case 11:
						if (parseInt(day) <= 30 && parseInt(day) > 0) {
							isTrue = true;
						} else {
							isTrue = false;
						}
						break;
					case 2:
						if ((year % 4 == 0 && year % 100 != 0)
								|| year % 400 == 0) {
							if (parseInt(day) <= 29 && parseInt(day) > 0) {
								isTrue = true;
							} else {
								isTrue = false;
							}
						} else {
							if (parseInt(day) <= 28 && parseInt(day) > 0) {
								isTrue = true;
							} else {
								isTrue = false;
							}
						}
						break;
					}
					return isTrue;
				}
			});
}(jQuery));