package cn.ziroom.webserive.service;

import java.util.List;

import cn.ziroom.mapper.SubwayStation;
import cn.ziroom.mapper.SubwayStationMapper;

/**
 * 地铁站点业务处理类
 * 
 * @author Administrator
 * 
 */
public class SubwayStationService {

	private SubwayStationMapper subwayStationMapper;

	/**
	 * 保存数据
	 * 
	 * @param list
	 * @return
	 */
	public int insert(List<SubwayStation> list) throws Exception {
		if (list != null) {
			int i = 0;
			for (SubwayStation subwayStation : list) {
				i++;
				subwayStationMapper.insert(subwayStation);
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
	public int update(List<SubwayStation> list) throws Exception {
		if (list != null) {
			int i = 0;
			for (SubwayStation subwayStation : list) {
				i++;
				subwayStationMapper.update(subwayStation);
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
	
	public void setSubwayStationMapper(SubwayStationMapper subwayStationMapper) {
		this.subwayStationMapper = subwayStationMapper;
	}
}
