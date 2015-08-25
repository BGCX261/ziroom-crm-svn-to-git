/**
 * JQuery扩展
 */
(function($) {
	/**
	 * JQuery对象扩展添加对象方法
	 */
	$.fn.extend({
		validator : function(json) {
			var errors = new Array();
			var obj = this;
			// 判断是否为表单对象
			if (!$(obj).is("form")) {
				alert("不是表单对象");
				return false;
			}
			// 验证
			var i = 0;
			$.each(json, function(field, rules) {
				var val = $.getValue(obj, field);
				$.each(rules, function(rule, param) {
					if (!$.rules(rule, val, param)) {
						var msg = param.msg;
						var arrs = new Array;
						arrs[0] = field;
						arrs[1] = msg;
						errors[i++] = arrs;
					}
				});
			});
			return errors;
		}
	});
	$.extend({
		/**
		 * 获得指定表单对象中的表单值
		 * 
		 * @param field
		 */
		getValue : function(obj, field) {
			// 通过字段获得表单元素，只获得第一个
			var element = obj.find(":input[name=" + field + "]")[0];
			if (element == undefined) {
				return undefined;
			}
			var val = null;
			// 判断表单元素类型
			if ($(element).is(
					"input[type=text],input[type=hidden],input[type=password]")
					|| $(element).is("select")
					|| $(element).is("textarea")
					|| $(element).is("file")) {
				// text,hidden,password类型,获得表单值
				val = $(element).val();
			} else if ($(element).is("input[type=checkbox]")) {
				// checkbox复选框类型, 获得表单选中复选框
				var checks = obj.find("input[type=checkbox][name=" + field
						+ "]:checked");
				$.each(checks, function(i) {
					if (i == 0) {
						val = $(this).val();
					} else {
						val += "," + $(this).val();
					}
				});
			} else if ($(element).is("input[type=radio]")) {
				// radio单选框类型，获得选中单选框
				var checks = obj.find("input[type=radio][name=" + field
						+ "]:checked");
				val = checks.val();
			}
			return val;
		},
		/**
		 * 根据验证规则，选择适合验证器
		 * 
		 * @param rule
		 * @param param
		 */
		rules : function(rule, val, param) {
			var rtn = true;
			switch (rule) {
			case 'required':
				rtn = $.required(val);
				break;
			case 'requiredstring':
				rtn = $.requiredstring(val);
				break;
			case 'int':
				rtn = $.int(val, param.min, param.max);
				break;
			case 'double':
				rtn = $.double(val, param.minInclusive, param.maxInclusive);
				break;
			case 'date':
				rtn = $.date(val, param.min, param.max);
				break;
			// case 'fieldexpression':
			// break;
			case 'email':
				rtn = $.email(val);
				break;
			case 'url':
				rtn = $.url(val);
				break;
			case 'stringlength':
				rtn = $.stringlength(val, param.minLength, param.maxLength);
				break;
			case 'regex':
				rtn = $.regex(val, param.expression);
				break;
			default:
				rtn = true;
			}
			return rtn;
		},
		/**
		 * 表单验证
		 * 
		 * @param formId
		 *            formID
		 * @param methods
		 *            外部提供方法
		 * @param style
		 *            使用错误提示样式
		 */
		checkedForm : function(formId, methods, style) {
			// 执行表单验证
			var method = formId + "()";
			var errors = eval(method);
			// 调用外部方法
			if (typeof methods != "undefined") {
				for (var i = 0; i < methods.length; i++) {
					var mtd = methods[i] + "()";
					var msg = eval(mtd);
					if (msg != "") {
						//errors += "\n" + msg;
					}
				}
			}
			if (errors.length > 0) {
				//var msg = "以下原因导致提交失败：\n";
				for (var i = 0; i < errors.length; i++) {
					var field = errors[i][0];
					var error =  errors[i][1];
					var element = $("#" + formId).find(":input[name=" + field + "]")[0];
					$(element).attr("title", error);
					$(element).css({backgroundColor:"red"}).bind("focus", function() {
						$(this).css({backgroundColor:""});
					});
					//var offset = $(element).offset();
					//var form_element = $("<div/>").addClass("formError").css({top:offset.top - 22,left:offset.left - $(element).width(),opacity:"0.87"}).appendTo(document.body);
					//var error_element = $("<div/>").addClass("formErrorContent").text("*" + error).appendTo(form_element);
					//msg += errors[i][1] + "\n";
					
				}
				//alert("表单验证失败，鼠标移动红色文本区域获得出错信息！");
				$.messager.alert('验证失败','表单验证失败','error');
				return false;
			} else {
				return true;
			}
		}
	});
}(jQuery));