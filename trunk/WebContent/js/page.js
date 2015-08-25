/**
 * 
 */
(function($) {
	/**
	 * jquery实现分页
	 */
	$.fn.extend({
		page : function(options) {
			var currentPage = parseInt($(this).attr("page"));
			var totalLine = parseInt($(this).attr("totalLine"));
			if (totalLine > 0) {
				var totalPage = 0;
				if (totalLine % 10 != 0) {
					totalPage = Math.floor(totalLine / 10) + 1;
				} else {
					totalPage = totalLine / 10;
				}
				// 前一页标签
				if (currentPage != 1) {
					$(this).append("<a href=\"javascript:page(" + (currentPage-1) + ");\" class=\"next\" >&raquo; Previous</a>");
				} else {
					$(this).append("<span class=\"previous-off\">&laquo; Previous</span>");
				}
				
				// 计算位置
				var first = currentPage - 3;
				if (first <= 0) {
					first = 1;
				}
				var last = first + 6;
				if (last > totalPage) {
					first = parseInt(totalPage) - 6;
					if (first <= 0) {
						first = 1;
					}
					last = totalPage;
				}
				for (var i = first; i <= last; i++) {
					if (currentPage == i) {
						$(this).append("<span class=\"active\">" + i + "</span>");
					} else {
						$(this).append("<a href=\"javascript:page(" + i + ");\" >" + i + "</a>");
					}
				}
				
				// 后一页标签
				if (currentPage != totalPage) {
					$(this).append("<a href=\"javascript:page(" + (currentPage+1) + ");\" class=\"next\" >&raquo; next</a>");
				} else {
					
					$(this).append("<span class=\"previous-off\">&laquo; next</span>");
				}
			}
		}
	});
} (jQuery));