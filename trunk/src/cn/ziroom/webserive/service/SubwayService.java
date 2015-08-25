package cn.ziroom.webserive.service;

import java.util.List;

import cn.ziroom.mapper.Subway;
import cn.ziroom.mapper.SubwayMapper;

/**
 * 地铁站业务处理类
 * 
 * @author Administrator
 * 
 */
public class SubwayService {

	private SubwayMapper subwayMapper;
	
	/**
	 * 保存数据
	 * 
	 * @param list
	 * @return
	 */
	public int insert(List<Subway> list) throws Exception {
		if (list != null) {
			int i = 0;
			for (Subway subway : list) {
				i++;
				subwayMapper.insert(subway);
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
	public int update(List<Subway> list) throws Exception {
		if (list != null) {
			int i = 0;
			for (Subway subway : list) {
				i++;
				subwayMapper.update(subway);
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

	public void setSubwayMapper(SubwayMapper subwayMapper) {
		this.subwayMapper = subwayMapper;
	}
}
