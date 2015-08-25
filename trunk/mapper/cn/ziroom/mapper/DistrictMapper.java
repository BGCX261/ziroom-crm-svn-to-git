package cn.ziroom.mapper;

import cn.ziroom.mapper.District;
import java.util.List;

public interface DistrictMapper {
    int count(District example);

    int deleteById(Integer districtId);

    int insert(District record);

    List<District> selectList(District example);

    District selectById(Integer districtId);

    int update(District record);
}