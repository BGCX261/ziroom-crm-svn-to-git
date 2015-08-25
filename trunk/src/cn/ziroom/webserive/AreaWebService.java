package cn.ziroom.webserive;

import java.util.List;

import javax.jws.WebMethod;

import cn.ziroom.mapper.Area;
import cn.ziroom.webserive.service.AreaService;

/**
 * 小区webservice接口类
 * 
 * @author Administrator
 * 
 */
@javax.jws.WebService(serviceName = "AreaWebService")
public class AreaWebService {

	private AreaService areaService;
	
	/**
	 * 保存小区数据
	 * 
	 * @param list
	 * @return
	 */
	@WebMethod
	public String insert(List<Area> list) {
		try {
			areaService.insert(list);
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
	public String update(List<Area> list) throws Exception {
		try {
			areaService.update(list);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "错误";
		}
	}
	
	/**
	 * 删除小区
	 * @param list
	 * @return
	 * @throws Exception
	 */
	@WebMethod
	public String delete(List<String> list) throws Exception {
		try {
			areaService.delete(list);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "错误";
		}
	}

	public void setAreaService(AreaService areaService) {
		this.areaService = areaService;
	}
}
