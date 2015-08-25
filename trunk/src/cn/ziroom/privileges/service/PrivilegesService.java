package cn.ziroom.privileges.service;

import java.util.List;

import cn.ziroom.privileges.mapper.Privileges;
import cn.ziroom.privileges.mapper.PrivilegesMapper;

public class PrivilegesService {

	private PrivilegesMapper privilegesMapper;

	/**
	 * 获得菜单及其子菜单
	 * 
	 * @param parentCode
	 * @return
	 */
	public List<Privileges> searchPrivilegesByCode(String parentCode) {
		Privileges _privileges = new Privileges();
		_privileges.setParent_code(parentCode);
		List<Privileges> firstMenu = privilegesMapper.selectByParentCode(_privileges);
		for (Privileges privileges : firstMenu) {
			_privileges.setParent_code(privileges.getPrivilege_code());
			privileges.setNodeList(privilegesMapper.selectByParentCode(_privileges));
		}
		return firstMenu;
	}

	public void setPrivilegesMapper(PrivilegesMapper privilegesMapper) {
		this.privilegesMapper = privilegesMapper;
	}

}