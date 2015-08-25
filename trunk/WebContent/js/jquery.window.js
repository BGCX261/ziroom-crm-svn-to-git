/** 界面全局z_index */
var z_index = 9000;

/**
 * 关闭弹出窗口
 * @param id 窗口ID
 */

/**
 * 扩展JQuery
 */
(function($) {
	function create(o) {
		var mask = $("<div></div>");
		mask.attr("id", "mask_"+o.id);
		mask.addClass("window-mask");
		mask.css("z-index", z_index++);
		var _s1 = $("<div class=\"panel window\" id=\"" + o.id + "\"></div>").draggable();
		_s1.css("position","absolute");
		_s1.css("z-index", z_index++);
		_s1.css("cursor", "default");
		//_s1.width(400);
		//_s1.height(300);
		if(o.id != null) {
			var _s2 = $("<div class=\"panel-header panel-header-noborder window-header\"\></div>");
			_s2.appendTo(_s1);
			//_s2.width(400);
			var _s3 = $("<div class=\"panel-title\">" + o.title + "</div>").prependTo(_s2);
			_s3.css("cursor", "move");
			if (o.icon) {
				_s3.find(".panel-title").addClass("panel-with-icon");
				$("<div class=\"panel-icon\"></div>").addClass(opts.iconCls).appendTo(_s2);
			}
			var tool = $("<div class=\"panel-tool\"></div>").appendTo(_s2);
			$("<div class=\"panel-tool-close\"></div>").appendTo(tool).bind("click", closeWin);
			var _s4 = $("<div></div>").appendTo(_s1);
			if(o.url != null) {
				_s4.load(o.url, o.data, function() {
					//alert('a');
				});
			}
			//var _s4 = $("<div>" + d + "</div>").appendTo(_s1);
			_s4.addClass("easyui-window");
			var windowobj = $(document);
			var t = windowobj.scrollTop() + (($(window).height() - _s1.height())/2); //滚动条的竖位置
			if(t < 0) {
				t = 0;
			}
			var l = ($(window).width() - 800) /2;
			_s1.offset({top:t,left:l});
			mask.height($(document.body).width());
			$(document.body).append(_s1);
			$(document.body).append(mask);
		}
		function closeWin() {
			_s1.remove();
			mask.remove();
		};
	};
	$.win = function(options) {
		if(typeof options == "string") {
			return $.fn.panel.methods[options](this);
		}
		create(options);
	};
	$.win.methods = {
		close : function() {
			alert('a');
		}
	};
	$.win.defaults = {
			id : null,
			title : 'New Title',
			data : {},
			url : null,
			icon:null,
			width:400,
			height:300
	};
	$.closeWin = function(id) {
		$("#"+id).remove();
		$("#mask_"+id).remove();
	};
}(jQuery));