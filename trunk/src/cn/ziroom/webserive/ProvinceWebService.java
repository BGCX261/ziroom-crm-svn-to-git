package cn.ziroom.webserive;

import java.util.List;

import javax.jws.WebMethod;

import cn.ziroom.mapper.Province;
import cn.ziroom.webserive.service.ProvinceService;

/**
 * 省市webservice接口
 * @author Administrator
 *
 */
@javax.jws.WebService(serviceName = "ProvinceWebService")
public class ProvinceWebService {

	private ProvinceService provinceService;

	/**
	 * 保存数据
	 * 
	 * @param list
	 * @return
	 */
	@WebMethod
	public String insert(List<Province> list) {
		try {
			provinceService.insert(list);
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
	public String update(List<Province> list) throws Exception {
		try {
			provinceService.update(list);
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
			provinceService.delete(list);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "错误";
		}
	}

	public void setProvinceService(ProvinceService provinceService) {
		this.provinceService = provinceService;
	}
}
