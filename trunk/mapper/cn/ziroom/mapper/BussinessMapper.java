package cn.ziroom.mapper;

import cn.ziroom.mapper.Bussiness;
import java.util.List;

public interface BussinessMapper {
    int count(Bussiness example);

    int deleteById(Integer businessId);

    int insert(Bussiness record);

    List<Bussiness> selectList(Bussiness example);

    Bussiness selectById(Integer businessId);

    int update(Bussiness record);
}