package cn.ziroom.webserive.service;

import java.util.List;

import cn.ziroom.mapper.City;
import cn.ziroom.mapper.CityMapper;

/**
 * 城区业务处理类
 * 
 * @author Administrator
 * 
 */
public class CityService {

	private CityMapper cityMapper;
	
	/**
	 * 保存数据
	 * 
	 * @param list
	 * @return
	 */
	public int insert(List<City> list) throws Exception {
		if (list != null) {
			int i = 0;
			for (City city : list) {
				i++;
				cityMapper.insert(city);
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
	public int update(List<City> list) throws Exception {
		if (list != null) {
			int i = 0;
			for (City city : list) {
				i++;
				cityMapper.update(city);
			}
			return i;
		} else {
			return 0;
		}
	}

	/**
	 * 删除
	 * 
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

	public void setCityMapper(CityMapper cityMapper) {
		this.cityMapper = cityMapper;
	}
}
