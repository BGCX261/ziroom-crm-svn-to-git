package cn.ziroom.webserive;

import java.util.List;

import javax.jws.WebMethod;

import cn.ziroom.mapper.District;
import cn.ziroom.webserive.service.DistrictService;

/**
 * 城区webservice接口
 * 
 * @author Administrator
 * 
 */
@javax.jws.WebService(serviceName = "DistrictWebService")
public class DistrictWebService {
	private DistrictService districtService;

	/**
	 * 保存数据
	 * 
	 * @param list
	 * @return
	 */
	@WebMethod
	public String insert(List<District> list) {
		try {
			districtService.insert(list);
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
	public String update(List<District> list) throws Exception {
		try {
			districtService.update(list);
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
			districtService.delete(list);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "错误";
		}
	}

	public void setDistrictService(DistrictService districtService) {
		this.districtService = districtService;
	}
}
