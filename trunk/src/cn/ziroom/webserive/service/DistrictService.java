package cn.ziroom.webserive.service;

import java.util.List;

import cn.ziroom.mapper.District;
import cn.ziroom.mapper.DistrictMapper;

/**
 * 城区业务处理类
 * 
 * @author Administrator
 * 
 */
public class DistrictService {

	private DistrictMapper districtMapper;

	/**
	 * 保存数据
	 * 
	 * @param list
	 * @return
	 */
	public int insert(List<District> list) throws Exception {
		if (list != null) {
			int i = 0;
			for (District district : list) {
				i++;
				districtMapper.insert(district);
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
	public int update(List<District> list) throws Exception {
		if (list != null) {
			int i = 0;
			for (District district : list) {
				i++;
				districtMapper.update(district);
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
	
	public void setDistrictMapper(DistrictMapper districtMapper) {
		this.districtMapper = districtMapper;
	}
}
