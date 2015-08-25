package cn.ziroom.webserive;

import java.util.List;

import javax.jws.WebMethod;

import cn.ziroom.mapper.Subway;
import cn.ziroom.webserive.service.SubwayService;

/**
 * 地铁站webservice接口
 * 
 * @author Administrator
 * 
 */
@javax.jws.WebService(serviceName = "SubwayWebService")
public class SubwayWebService {
	private SubwayService subwayService;

	/**
	 * 保存数据
	 * 
	 * @param list
	 * @return
	 */
	@WebMethod
	public String insert(List<Subway> list) {
		try {
			subwayService.insert(list);
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
	public String update(List<Subway> list) throws Exception {
		try {
			subwayService.update(list);
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
			subwayService.delete(list);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "错误";
		}
	}

	public void setSubwayService(SubwayService subwayService) {
		this.subwayService = subwayService;
	}
}
