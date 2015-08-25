package cn.ziroom.webserive.service;

import java.util.List;

import cn.ziroom.mapper.Circle;
import cn.ziroom.mapper.CircleMapper;

/**
 * 环线业务处理类
 * 
 * @author Administrator
 * 
 */
public class CircleService {

	private CircleMapper circleMapper;

	/**
	 * 保存数据
	 * 
	 * @param list
	 * @return
	 */
	public int insert(List<Circle> list) throws Exception {
		if (list != null) {
			int i = 0;
			for (Circle circle : list) {
				i++;
				circleMapper.insert(circle);
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
	public int update(List<Circle> list) throws Exception {
		if (list != null) {
			int i = 0;
			for (Circle circle : list) {
				i++;
				circleMapper.update(circle);
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
	
	public void setCircleMapper(CircleMapper circleMapper) {
		this.circleMapper = circleMapper;
	}
}
