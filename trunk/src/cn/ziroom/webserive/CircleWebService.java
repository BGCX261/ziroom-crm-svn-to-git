package cn.ziroom.webserive;

import java.util.List;

import javax.jws.WebMethod;

import cn.ziroom.mapper.Circle;
import cn.ziroom.webserive.service.CircleService;

/**
 * 环线webservice接口类
 * 
 * @author Administrator
 * 
 */
@javax.jws.WebService(serviceName = "CircleWebService")
public class CircleWebService {

	private CircleService circleService;

	/**
	 * 保存数据
	 * 
	 * @param list
	 * @return
	 */
	@WebMethod
	public String insert(List<Circle> list) {
		try {
			circleService.insert(list);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "错误";
		}
	}

	/**
	 * 更新
	 * 
	 * @return
	 * @throws Exception
	 */
	@WebMethod
	public String update(List<Circle> list) throws Exception {
		try {
			circleService.update(list);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "错误";
		}
	}

	/**
	 * 删除
	 * 
	 * @param list
	 * @return
	 * @throws Exception
	 */
	@WebMethod
	public String delete(List<String> list) throws Exception {
		try {
			circleService.delete(list);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "错误";
		}
	}

	public void setCircleService(CircleService circleService) {
		this.circleService = circleService;
	}

}
