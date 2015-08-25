package cn.ziroom.mapper;

import cn.ziroom.mapper.Subway;
import java.util.List;

public interface SubwayMapper {
    int count(Subway example);

    int deleteById(Integer subwayId);

    int insert(Subway record);

    List<Subway> selectList(Subway example);

    Subway selectById(Integer subwayId);

    int update(Subway record);
}