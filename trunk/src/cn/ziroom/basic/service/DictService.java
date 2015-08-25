package cn.ziroom.basic.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.sunshulin.util.GeneralUtils;

import cn.ziroom.basic.mapper.Dict;
import cn.ziroom.basic.mapper.DictMapper;

/**
 * 数据字典业务处理类
 * 
 * @author Administrator
 * 
 */
public class DictService {

	private DictMapper dictMapper;

	/**
	 * 查询系统中的所有数据字典数据,按dictType数字字典分类保存到hasmap中
	 * 
	 * @return
	 */
	public Map<String, String> searchDict() {
		List<Dict> dictList = dictMapper.selectList();
		Map<String, String> map = new HashMap<String, String>();
		Iterator<Dict> it = dictList.iterator();
		while (it.hasNext()) {
			Dict dict = it.next();
			map.put(dict.getDictType(), GeneralUtils.easyUI(dict.getDictList()));
		}
		return map;
	}

	public void setDictMapper(DictMapper dictMapper) {
		this.dictMapper = dictMapper;
	}
}
