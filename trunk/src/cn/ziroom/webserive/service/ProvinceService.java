package cn.ziroom.webserive.service;

import java.util.List;

import cn.ziroom.mapper.Province;
import cn.ziroom.mapper.ProvinceMapper;

/**
 * 省市业务处理类
 * 
 * @author Administrator
 * 
 */
public class ProvinceService {
	
	private ProvinceMapper provinceMapper;

	/**
	 * 保存数据
	 * 
	 * @param list
	 * @return
	 */
	public int insert(List<Province> list) throws Exception {
		if (list != null) {
			int i = 0;
			for (Province province : list) {
				i++;
				provinceMapper.insert(province);
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
	public int update(List<Province> list) throws Exception {
		if (list != null) {
			int i = 0;
			for (Province province : list) {
				i++;
				provinceMapper.update(province);
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

	public void setProvinceMapper(ProvinceMapper provinceMapper) {
		this.provinceMapper = provinceMapper;
	}
}
