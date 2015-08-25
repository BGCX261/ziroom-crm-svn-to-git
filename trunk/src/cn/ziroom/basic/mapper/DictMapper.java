package cn.ziroom.basic.mapper;

import cn.ziroom.basic.mapper.Dict;
import java.util.List;

/**
 * 数据字典实体数据访问接口
 * 
 * @author Administrator
 * 
 */
public interface DictMapper {

	int deleteById(Integer dictId);

	int insert(Dict record);

	List<Dict> selectList();

	Dict selectById(Integer dictId);

	int update(Dict record);
}