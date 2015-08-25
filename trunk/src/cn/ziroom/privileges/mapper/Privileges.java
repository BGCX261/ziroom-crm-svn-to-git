package cn.ziroom.privileges.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sunshulin.service.GeneralCriteria;

public class Privileges extends GeneralCriteria {

	private static final long serialVersionUID = 6300288401657907277L;

	private Integer id;

	private String privilege_code;

	private String privilege_name;

	private String url;

	private String parent_code;

	private String path;

	private String is_leaf;
	
	private List<Privileges> nodeList = new ArrayList<Privileges>();
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPrivilege_code() {
		return privilege_code;
	}

	public void setPrivilege_code(String privilege_code) {
		this.privilege_code = privilege_code == null ? null : privilege_code.trim();
	}

	public String getPrivilege_name() {
		return privilege_name;
	}

	public void setPrivilege_name(String privilege_name) {
		this.privilege_name = privilege_name == null ? null : privilege_name.trim();
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url == null ? null : url.trim();
	}

	public String getParent_code() {
		return parent_code;
	}

	public void setParent_code(String parent_code) {
		this.parent_code = parent_code == null ? null : parent_code.trim();
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path == null ? null : path.trim();
	}

	public String getIs_leaf() {
		return is_leaf;
	}

	public void setIs_leaf(String is_leaf) {
		this.is_leaf = is_leaf == null ? null : is_leaf.trim();
	}

	public List<Privileges> getNodeList() {
		return nodeList;
	}

	public void setNodeList(List<Privileges> nodeList) {
		this.nodeList = nodeList;
	}
}