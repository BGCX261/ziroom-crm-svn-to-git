package cn.ziroom.mapper;

import com.sunshulin.service.GeneralCriteria;

/**
 * 省份实体
 * @author Administrator
 *
 */
public class Province extends GeneralCriteria {

	private static final long serialVersionUID = 845968743810011222L;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_province.PROVINCE_ID
     *
     * @mbggenerated Tue Nov 22 10:42:22 CST 2011
     */
    private Integer provinceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_province.PROVINCE_NAME
     *
     * @mbggenerated Tue Nov 22 10:42:22 CST 2011
     */
    private String provinceName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_province.PROVINCE_SHORT
     *
     * @mbggenerated Tue Nov 22 10:42:22 CST 2011
     */
    private String provinceShort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_province.PROVINCE_HEADER
     *
     * @mbggenerated Tue Nov 22 10:42:22 CST 2011
     */
    private String provinceHeader;

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    public String getProvinceShort() {
        return provinceShort;
    }

    public void setProvinceShort(String provinceShort) {
        this.provinceShort = provinceShort == null ? null : provinceShort.trim();
    }

    public String getProvinceHeader() {
        return provinceHeader;
    }

    public void setProvinceHeader(String provinceHeader) {
        this.provinceHeader = provinceHeader == null ? null : provinceHeader.trim();
    }
}