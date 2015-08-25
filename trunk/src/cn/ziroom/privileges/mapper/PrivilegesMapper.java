package cn.ziroom.privileges.mapper;

import java.util.List;

public interface PrivilegesMapper {

	//public List<Privileges> select(Privileges privileges);
	
	public List<Privileges> selectByParentCode(Privileges privileges);

}