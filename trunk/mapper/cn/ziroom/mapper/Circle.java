package cn.ziroom.mapper;

import com.sunshulin.service.GeneralCriteria;

/**
 * 环线，大街实体
 * @author Administrator
 *
 */
public class Circle extends GeneralCriteria {

	private static final long serialVersionUID = 2601343284872185945L;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_circle.CIRCLE_ID
     *
     * @mbggenerated Tue Nov 22 10:42:22 CST 2011
     */
    private Integer circleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_circle.CITY_ID
     *
     * @mbggenerated Tue Nov 22 10:42:22 CST 2011
     */
    private Integer cityId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_circle.CIRCLE_NAME
     *
     * @mbggenerated Tue Nov 22 10:42:22 CST 2011
     */
    private String circleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_circle.CIRCLE_CODE
     *
     * @mbggenerated Tue Nov 22 10:42:22 CST 2011
     */
    private String circleCode;

    public Integer getCircleId() {
        return circleId;
    }

    public void setCircleId(Integer circleId) {
        this.circleId = circleId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCircleName() {
        return circleName;
    }

    public void setCircleName(String circleName) {
        this.circleName = circleName == null ? null : circleName.trim();
    }

    public String getCircleCode() {
        return circleCode;
    }

    public void setCircleCode(String circleCode) {
        this.circleCode = circleCode == null ? null : circleCode.trim();
    }
}