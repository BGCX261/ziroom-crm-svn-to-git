package cn.ziroom.webserive;

import java.util.List;

import cn.ziroom.mapper.Bussiness;
import cn.ziroom.webserive.service.BussinessService;

/**
 * 商圈webservice接口类
 * 
 * @author Administrator
 * 
 */
@javax.jws.WebService(serviceName = "BussinessWebService")
public class BussinessWebService {

	private BussinessService bussinessService;
	
	/**
	 * 保存数据
	 * 
	 * @param list
	 * @return
	 */
	public String insert(List<Bussiness> list) {
		try {
			bussinessService.insert(list);
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
	public String update(List<Bussiness> list) throws Exception {
		try {
			bussinessService.update(list);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "错误";
		}
	}
	
	/**
	 * 删除
	 * @param list
	 * @return
	 * @throws Exception
	 */
	public String delete(List<String> list) throws Exception {
		try {
			bussinessService.delete(list);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "错误";
		}
	}

	public void setBussinessService(BussinessService bussinessService) {
		this.bussinessService = bussinessService;
	}
}
