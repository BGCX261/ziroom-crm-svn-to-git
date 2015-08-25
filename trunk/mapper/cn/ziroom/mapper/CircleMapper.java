package cn.ziroom.mapper;

import cn.ziroom.mapper.Circle;
import java.util.List;

public interface CircleMapper {
    int count(Circle example);

    int deleteById(Integer circleId);

    int insert(Circle record);

    List<Circle> selectList(Circle example);

    Circle selectById(Integer circleId);

    int update(Circle record);
}