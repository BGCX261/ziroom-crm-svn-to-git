package cn.ziroom.webserive.service;

import java.util.List;

import cn.ziroom.mapper.Bussiness;
import cn.ziroom.mapper.BussinessMapper;

/**
 * 商圈业务处理类
 * 
 * @author Administrator
 * 
 */
public class BussinessService {

	private BussinessMapper bussinessMapper;

	/**
	 * 保存数据
	 * 
	 * @param list
	 * @return
	 */
	public int insert(List<Bussiness> list) throws Exception {
		if (list != null) {
			int i = 0;
			for (Bussiness bussiness : list) {
				i++;
				bussinessMapper.insert(bussiness);
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
	public int update(List<Bussiness> list) throws Exception {
		if (list != null) {
			int i = 0;
			for (Bussiness bussiness : list) {
				i++;
				bussinessMapper.update(bussiness);
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

	public void setBussinessMapper(BussinessMapper bussinessMapper) {
		this.bussinessMapper = bussinessMapper;
	}
}
