package cn.ziroom.webserive.service;

import java.util.List;

import cn.ziroom.mapper.Area;
import cn.ziroom.mapper.AreaMapper;

/**
 * 小区业务处理类
 * 
 * @author Administrator
 * 
 */
public class AreaService {

	private AreaMapper areaMapper;

	/**
	 * 保存小区数据
	 * 
	 * @param list
	 * @return
	 */
	public int insert(List<Area> list) throws Exception {
		if (list != null) {
			int i = 0;
			for (Area area : list) {
				i++;
				areaMapper.insert(area);
			}
			return i;
		} else {
			return 0;
		}
	}

	/**
	 * 更新
	 * 
	 * @return
	 * @throws Exception
	 */
	public int update(List<Area> list) throws Exception {
		if (list != null) {
			int i = 0;
			for (Area area : list) {
				i++;
				areaMapper.update(area);
			}
			return i;
		} else {
			return 0;
		}
	}
	
	/**
	 * 删除小区
	 * @param list
	 * @return
	 * @throws Exception
	 */
	public int delete(List<String> list) throws Exception {
		if (list != null) {
			return 0;
		} else {
			return 0;
		}
	}

	public void setAreaMapper(AreaMapper areaMapper) {
		this.areaMapper = areaMapper;
	}
}
