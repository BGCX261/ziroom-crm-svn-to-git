package cn.ziroom.mapper;

import cn.ziroom.mapper.SubwayStation;
import java.util.List;

public interface SubwayStationMapper {
    int count(SubwayStation example);

    int deleteById(Integer stationId);

    int insert(SubwayStation record);

    List<SubwayStation> selectList(SubwayStation example);

    SubwayStation selectById(Integer stationId);

    int update(SubwayStation record);
}