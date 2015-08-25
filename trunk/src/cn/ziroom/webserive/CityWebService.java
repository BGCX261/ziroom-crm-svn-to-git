package cn.ziroom.webserive;

import java.util.List;

import javax.jws.WebMethod;

import cn.ziroom.mapper.City;
import cn.ziroom.webserive.service.CityService;

/**
 * 城区webservice接口类
 * 
 * @author Administrator
 * 
 */
@javax.jws.WebService(serviceName = "CityWebService")
public class CityWebService {

	private CityService cityService;

	/**
	 * 保存数据
	 * 
	 * @param list
	 * @return
	 */
	@WebMethod
	public String insert(List<City> list) {
		try {
			cityService.insert(list);
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
	public String update(List<City> list) throws Exception {
		try {
			cityService.update(list);
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
			cityService.delete(list);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "错误";
		}
	}

	public void setCityService(CityService cityService) {
		this.cityService = cityService;
	}
}
