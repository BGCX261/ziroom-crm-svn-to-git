package cn.ziroom.mapper;

import com.sunshulin.service.GeneralCriteria;

/**
 * 地铁实体
 * 
 * @author Administrator
 * 
 */
public class Subway extends GeneralCriteria {

	private static final long serialVersionUID = -6222216679040942988L;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column t_subway.SUBWAY_ID
	 * 
	 * @mbggenerated Tue Nov 22 10:42:22 CST 2011
	 */
	private Integer subwayId;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column t_subway.CITY_ID
	 * 
	 * @mbggenerated Tue Nov 22 10:42:22 CST 2011
	 */
	private Integer cityId;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column t_subway.SUBWAY
	 * 
	 * @mbggenerated Tue Nov 22 10:42:22 CST 2011
	 */
	private String subway;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column t_subway.SUBWAY_CODE
	 * 
	 * @mbggenerated Tue Nov 22 10:42:22 CST 2011
	 */
	private String subwayCode;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column t_subway.SUBWAY_DESC
	 * 
	 * @mbggenerated Tue Nov 22 10:42:22 CST 2011
	 */
	private String subwayDesc;

	public Integer getSubwayId() {
		return subwayId;
	}

	public void setSubwayId(Integer subwayId) {
		this.subwayId = subwayId;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getSubway() {
		return subway;
	}

	public void setSubway(String subway) {
		this.subway = subway == null ? null : subway.trim();
	}

	public String getSubwayCode() {
		return subwayCode;
	}

	public void setSubwayCode(String subwayCode) {
		this.subwayCode = subwayCode == null ? null : subwayCode.trim();
	}

	public String getSubwayDesc() {
		return subwayDesc;
	}

	public void setSubwayDesc(String subwayDesc) {
		this.subwayDesc = subwayDesc == null ? null : subwayDesc.trim();
	}
}