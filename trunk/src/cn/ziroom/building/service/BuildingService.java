package cn.ziroom.building.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.ziroom.mapper.Area;
import cn.ziroom.mapper.Building;
import cn.ziroom.mapper.BuildingMapper;
import cn.ziroom.mapper.BuildingProcess;
import cn.ziroom.mapper.BuildingProcessMapper;

import com.sunshulin.util.GeneralUtils;

/**
 * 房屋管理业务处理类
 * 
 * @author Administrator
 * 
 */
public class BuildingService {

	/** 房屋数据访问接口 */
	private BuildingMapper buildingMapper;
	/** 房屋开发过程管理数据访问接口 */
	private BuildingProcessMapper buildingProcessMapper;

	/**
	 * 登记房屋业务处理方法
	 * 
	 * @param building
	 */
	public void developmentHouse(Building building) {
		// 保存房屋信息
		/* @TODO 生成房屋的编码（系统编码） */
		buildingMapper.insert(building);
		/*
		 * 保存房屋的业主信息，房屋业主信息保存在房屋开发过程管理由于在 房屋开发过程中无法建立客户资源资料，需要由管家或
		 * 其它业务人员建立客户资源信息。
		 */
		BuildingProcess buildingProcess = new BuildingProcess();
		buildingProcess.setBuildingId(building.getBuildingId());
		buildingProcess.setProcessType("BUILDINGREGEDIT");
		buildingProcess.setStartTime(new Date());
		buildingProcessMapper.insert(buildingProcess);
	}

	/**
	 * 房屋开发过程管理;包含房屋跟进，房屋实堪，议价，特价审批等
	 * 
	 * @param buildingProcess
	 */
	public void developmentProcess(BuildingProcess buildingProcess) {
		buildingProcessMapper.insert(buildingProcess);
	}

	/**
	 * 房屋开发过程查询列表业务处理方法，暂时不实现分页处理
	 * 
	 * @param buildingProcess
	 * @return
	 */
	public List<BuildingProcess> searchProcess(BuildingProcess buildingProcess) {
		List<BuildingProcess> list = new ArrayList<BuildingProcess>();
		buildingProcessMapper.selectList(buildingProcess);
		return list;
	}

	/**
	 * 编辑房屋信息;只保存房屋基本信息资料，客户信息资料等信息。
	 * 
	 * @param building
	 */
	public void editBuilding(Building building) {
		/* 如果房屋ID存在更新房屋信息，否则保存房屋信息 */
		if (building.getBuildingId() != null) {
			buildingMapper.update(building);
		} else {
			/* @TODO 生成房屋的编码（系统编码） */

			buildingMapper.insert(building);
		}
	}

	/**
	 * 查找房屋信息业务处理方法
	 * 
	 * @param building
	 */
	public String findBuilding(Building building) {
		if (building != null && building.getBuildingId() != null) {
			building = buildingMapper.selectById(building.getBuildingId());
		}
		Area area = new Area();
		area.setAreaName("安贞西里");
		area.setAreaSpellingShort("azxl");
		building.setArea(area);
		return GeneralUtils.easyUI(building);
	}

	/**
	 * 搜索房屋信息业务处理方法
	 * 
	 * @param building
	 * @return
	 */
	public String searchBuilding(Building building) {
		return GeneralUtils.easyUI(buildingMapper.count(building), buildingMapper.selectList(building));
	}

	public void setBuildingMapper(BuildingMapper buildingMapper) {
		this.buildingMapper = buildingMapper;
	}

	public void setBuildingProcessMapper(BuildingProcessMapper buildingProcessMapper) {
		this.buildingProcessMapper = buildingProcessMapper;
	}
}
