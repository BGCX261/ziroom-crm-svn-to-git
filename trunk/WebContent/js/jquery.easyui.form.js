/**
 * 扩展jquery easy ui的form装载json数据功能
 */
(function() {
	$.extend($.fn.form.methods, {
		loadJsonToForm : function(jq, url) {
			return jq.each(function() {
				var o = this;
				if (url != null) {
					$.ajax({
						url : url,
						dataType : "json",
						success : function(data) {
							for(var name in data) {
								var val = data[name];
								if(typeof val=="object") {
									for(var s in val) {
										var v = val[s];
										setVal(o, v, name+"."+s);
									}
								} else {
									setVal(o, val, name);
								}	
							}
						}
					});
				} 
			});
			function setVal(o, val, name) {
				$("input[name=" + name + "]", o).val(val);
				$("textarea[name=" + name + "]", o).val(val);
				$("select[name=" + name + "]", o).val(val);
				var cc = [ "combo", "combobox", "combotree", "combogrid" ];
				for( var i = 0; i < cc.length; i++) {
					//_307(cc[i], name, val);
					var type= cc[i];
					var c = $(o).find("." + type + "-f[comboName=" + name + "]");
					if (c.length && c[type]) {
						if (c[type]("options").multiple) {
							c[type]("setValues", val);
						} else {
							c[type]("setValue", val);
						}
					}
				}
			}
		}
	});
})(jQuery);