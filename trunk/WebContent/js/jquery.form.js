/**
 * 扩展JQuery
 */
(function($) {
	
	/**
	 * 对象扩展，从form表单中获得表单元素，封装成数组
	 */
	$.extend({
		formData : function(formId) {
			//var elements = $("#"+formId).find(":input");
			// 元素
			var str = '({m:1';
			var textElements = $("#"+formId).find(":text");
			$.each(textElements, function() {
				str += ',"' + $(this).attr('name') + '":"' + $(this).val() + '"';
			});
			
			var checkedElements = $('#'+formId).find(':checkbox:checked');
			$.each(checkedElements, function() {
				str += ',"' + $(this).attr('name') + '":"' + $(this).val() + '"';
			});
			
			var radioElements = $('#'+formId).find(':radio:checked');
			$.each(radioElements, function() {
				str += ',"' + $(this).attr('name') + '":"' + $(this).val() + '"';
			});
			
			var hiddenElements = $('#'+formId).find('input[type=hidden]');
			$.each(hiddenElements, function() {
				str += ',"' + $(this).attr('name') + '":"' + $(this).val() + '"';
			});
			
			var passElements = $('#'+formId).find(':password');
			$.each(passElements, function() {
				str += ',"' + $(this).attr('name') + '":"' + $(this).val() + '"';
			});
			
			var textareaElements = $('#'+formId).find('textarea');
			$.each(textareaElements, function() {
				str += ',"' + $(this).attr('name') + '":"' + $(this).val() + '"';
			});
			
			var selectElements = $('#'+formId).find('select');
			$.each(selectElements, function() {
				str += ',"' + $(this).attr('name') + '":"' + $(this).val() + '"';
			});
			str +='})';
			return eval(str);
		}
	});
}(jQuery));