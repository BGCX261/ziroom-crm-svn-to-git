package cn.ziroom.basic.action;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import cn.ziroom.basic.mapper.Dict;
import cn.ziroom.basic.service.DictService;

import com.sunshulin.common.action.GeneralAction;
import com.sunshulin.util.GeneralUtils;

/**
 * 数据字典请求Action
 * 
 * @author Administrator
 * 
 */
public class DictAction extends GeneralAction {

	private static final long serialVersionUID = -3054445843940603094L;

	private Dict dict = new Dict();

	private DictService dictService;

	/**
	 * 按类型获得数据字典
	 * 
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	public void getDictType() throws IOException {
		Map<String, String> maps = (Map<String, String>) ServletActionContext.getRequest().getServletContext().getAttribute("dict");
		String json = maps.get(dict.getDictType());
		out(json);
	}

	public Dict getDict() {
		return dict;
	}

	public void setDict(Dict dict) {
		this.dict = dict;
	}

	@Override
	public Object getModel() {
		return dict;
	}

	public void setDictService(DictService dictService) {
		this.dictService = dictService;
	}

}
