package cn.ziroom.mapper;

import cn.ziroom.mapper.City;
import java.util.List;

public interface CityMapper {
    int count(City example);

    int deleteById(Integer cityId);

    int insert(City record);

    List<City> selectList(City example);

    City selectById(Integer cityId);

    int update(City record);
}