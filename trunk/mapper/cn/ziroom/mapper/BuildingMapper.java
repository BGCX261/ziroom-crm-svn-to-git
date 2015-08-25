package cn.ziroom.mapper;

import cn.ziroom.mapper.Building;
import java.util.List;

public interface BuildingMapper {
    int count(Building example);

    int deleteById(Integer buildingId);

    int insert(Building record);

    List<Building> selectList(Building example);

    Building selectById(Integer buildingId);

    int update(Building record);
}