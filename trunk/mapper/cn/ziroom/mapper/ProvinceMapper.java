package cn.ziroom.mapper;

import cn.ziroom.mapper.Province;
import java.util.List;

public interface ProvinceMapper {
    int count(Province example);

    int deleteById(Integer provinceId);

    int insert(Province record);

    List<Province> selectList(Province example);

    Province selectById(Integer provinceId);

    int update(Province record);
}