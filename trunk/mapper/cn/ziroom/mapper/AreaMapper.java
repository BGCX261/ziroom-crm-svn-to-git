package cn.ziroom.mapper;

import cn.ziroom.mapper.Area;
import java.util.List;

public interface AreaMapper {
    int count(Area example);

    int deleteById(Integer areaId);

    int insert(Area record);

    List<Area> selectList(Area example);

    Area selectById(Integer areaId);

    int update(Area record);
}