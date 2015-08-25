/**
 * JQuery扩展；
 */
(function($) {
	$.fn.extend({
		/**
		 * 自动匹配为对象添加自动扩展的功能实现
		 * @param options
		 */
		autocomplete: function(options) {
			var mouseselected = false;
			// 文本框绑定事件
			$(this).bind("keyup", function() {
				var val = $(this).val();
				selectPage(this, val, options);
			});
			$(this).bind("focus", function() {
				var val = $(this).val();
				if (val != "") {
					selectPage(this, val, options);
				}
			});
			$(this).bind("blur", function() {
				if (!mouseselected) {
					$("#selectPage").remove();
				}
			});
			function selectPage(o, val, options) {
				if ($("#selectPage")) {
					$("#selectPage").remove();
				}
				if (val == "") {
					return false;
				}
				
				var url = options.url;
				var parameterName = $(o).attr("name");
				var parameters = eval("({'" + parameterName + "':'" + val + "'})");
				
				$.post(url, parameters, function(data) {
					
					var auto = data.autocomplete;
					if (auto == null || auto == "") {
						return;
					}
					
					var offset = $(o).offset();
					var d_element = $("<div/>").hide().addClass("selectPage").css({position: "absolute", width: $(o).width(), top: offset.top + 22, left: offset.left}).attr("id", "selectPage").appendTo(document.body);
					var u_element = $("<ul/>").css({"max-height":"180px",overflow:"auto"}).appendTo(d_element);
					
					
					for (var i = 0; i < auto.length; i++) {
						$("<li/>").attr("seq", i).attr("key", auto[i].displayValue).addClass(i % 2 == 0 ? "li_event" : "li_odd").html(auto[i].displayName).appendTo(u_element);
					}
					
					u_element.bind("mouseover", function(event) {
						var element = event.target;
						while(element && element.tagName != "LI") {
							element = element.parentNode;
						}
						$("li", u_element).removeClass("li_over");
						$(element).addClass("li_over");
					});
					
					u_element.bind("click", function(event) {
						var element = event.target;
						while(element && element.tagName != "LI") {
							element = element.parentNode;
						}
						var val = $(element).attr("key");
						$(o).val(val);
						if (options.callBack != null) {
							var seq = $(element).attr("seq");
							options.callBack.call(options.callBack, auto[seq]);
						}
						$("#selectPage").remove();
					}).bind("mousedown", function() {
						mouseselected = true;
					}).bind("mouseup", function() {
						mouseselected = false;
					}).bind("blur", function() {
						$("#selectPage").remove();
					});
					d_element.show();
				}, "json");
			}
		}
	});
	$.extend({
		/**
		 * 选择
		 * @param val
		 */
		
	});
}(jQuery));