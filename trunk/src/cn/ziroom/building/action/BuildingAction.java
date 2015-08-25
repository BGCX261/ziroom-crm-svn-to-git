package cn.ziroom.building.action;

import java.util.ArrayList;
import java.util.List;

import cn.ziroom.building.service.BuildingService;
import cn.ziroom.mapper.Building;
import cn.ziroom.mapper.BuildingProcess;

import com.sunshulin.common.action.GeneralAction;

/**
 * 房屋管理请求Action处理类
 * 
 * @author Administrator
 * 
 */
public class BuildingAction extends GeneralAction {

	private static final long serialVersionUID = -5548343280284945462L;

	/** 房屋实体 */
	private Building building = new Building();
	/** 房屋实体列表 */
	private List<Building> buildingList = new ArrayList<Building>();
	/** 房屋开发过程实体 */
	private BuildingProcess buildingProcess = new BuildingProcess();
	/** 房屋开发过程实体列表 */
	private List<BuildingProcess> buildingProcessList = new ArrayList<BuildingProcess>();
	/** 房屋开发业务处理方法 */
	private BuildingService buildingService;

	/**
	 * 登记房屋请求处理方法
	 * 
	 * @throws Exception
	 */
	public void developmentHouse() throws Exception {
		buildingService.developmentHouse(building);
	}

	/**
	 * 房屋开发过程请求处理方法
	 * 
	 * @throws Exception
	 */
	public void developmentProcess() throws Exception {
		buildingService.developmentProcess(buildingProcess);
	}

	/**
	 * 查询房屋开发过程列表请求处理方法
	 * 
	 * @return
	 * @throws Exception
	 */
	public String searchProcess() throws Exception {
		buildingProcessList = buildingService.searchProcess(buildingProcess);
		return SUCCESS;
	}

	/**
	 * 查找房屋请求处理方法
	 * 
	 * @return
	 * @throws Exception
	 */
	public void findBuilding() throws Exception {
		String json = buildingService.findBuilding(building);
		out(json);
	}

	/**
	 * 编辑房屋信息请求处理方法
	 * 
	 * @throws Exception
	 */
	public void editBuilding() throws Exception {
		buildingService.editBuilding(building);
	}

	/**
	 * 查询房屋请求处理方法
	 * 
	 * @return
	 * @throws Exception
	 */
	public void searchBuilding() throws Exception {
		page(building);
		String json = buildingService.searchBuilding(building);
		out(json);
	}

	public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	public BuildingProcess getBuildingProcess() {
		return buildingProcess;
	}

	public void setBuildingProcess(BuildingProcess buildingProcess) {
		this.buildingProcess = buildingProcess;
	}

	public List<Building> getBuildingList() {
		return buildingList;
	}

	public void setBuildingList(List<Building> buildingList) {
		this.buildingList = buildingList;
	}

	public List<BuildingProcess> getBuildingProcessList() {
		return buildingProcessList;
	}

	public void setBuildingProcessList(List<BuildingProcess> buildingProcessList) {
		this.buildingProcessList = buildingProcessList;
	}

	public void setBuildingService(BuildingService buildingService) {
		this.buildingService = buildingService;
	}

	@Override
	public Object getModel() {
		return building;
	}
}
