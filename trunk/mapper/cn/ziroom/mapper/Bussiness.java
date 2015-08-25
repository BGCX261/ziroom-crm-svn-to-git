package cn.ziroom.mapper;

import com.sunshulin.service.GeneralCriteria;

/**
 * 商圈实体
 * @author Administrator
 *
 */
public class Bussiness extends GeneralCriteria {

	private static final long serialVersionUID = 3285675995673833215L;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_business.BUSINESS_ID
     *
     * @mbggenerated Tue Nov 22 10:42:22 CST 2011
     */
    private Integer businessId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_business.DISTRICT_ID
     *
     * @mbggenerated Tue Nov 22 10:42:22 CST 2011
     */
    private Integer districtId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_business.BUSSION_CODE
     *
     * @mbggenerated Tue Nov 22 10:42:22 CST 2011
     */
    private String bussionCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_business.BUSINESS_NAME
     *
     * @mbggenerated Tue Nov 22 10:42:22 CST 2011
     */
    private String businessName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_business.BUSINESS_PINYIN
     *
     * @mbggenerated Tue Nov 22 10:42:22 CST 2011
     */
    private String businessPinyin;

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public String getBussionCode() {
        return bussionCode;
    }

    public void setBussionCode(String bussionCode) {
        this.bussionCode = bussionCode == null ? null : bussionCode.trim();
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName == null ? null : businessName.trim();
    }

    public String getBusinessPinyin() {
        return businessPinyin;
    }

    public void setBusinessPinyin(String businessPinyin) {
        this.businessPinyin = businessPinyin == null ? null : businessPinyin.trim();
    }
}