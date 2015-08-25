package cn.ziroom.mapper;

import cn.ziroom.mapper.BuildingProcess;
import java.util.List;

public interface BuildingProcessMapper {
    int count(BuildingProcess example);

    int deleteById(Integer buildingProcessId);

    int insert(BuildingProcess record);

    List<BuildingProcess> selectList(BuildingProcess example);

    BuildingProcess selectById(Integer buildingProcessId);

    int update(BuildingProcess record);
}