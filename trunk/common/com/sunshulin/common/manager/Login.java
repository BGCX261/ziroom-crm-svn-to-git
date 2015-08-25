package com.sunshulin.common.manager;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息
 * 
 * @author 孙树林
 * 
 */
public class Login implements Serializable {

	private static final long serialVersionUID = 9078996073657145863L;

	private Integer id;

	private String staffid;

	private String sysId;

	private String staffPass;
	
	private String repeatPass;

	private String staffName;

	private String mobileNumber;

	private String managerId;

	private String cityName;

	private String operationReg;

	private String saleReg;

	private String businessReg;

	private String storeName;

	private String groupName;

	private String staffType;

	private String staffRole;

	private Date createTime;

	private String isAvailable;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStaffid() {
		return staffid;
	}

	public void setStaffid(String staffid) {
		this.staffid = staffid == null ? null : staffid.trim();
	}

	public String getSysId() {
		return sysId;
	}

	public void setSysId(String sysId) {
		this.sysId = sysId == null ? null : sysId.trim();
	}

	public String getStaffPass() {
		return staffPass;
	}

	public void setStaffPass(String staffPass) {
		this.staffPass = staffPass == null ? null : staffPass.trim();
	}

	public String getRepeatPass() {
		return repeatPass;
	}

	public void setRepeatPass(String repeatPass) {
		this.repeatPass = repeatPass;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName == null ? null : staffName.trim();
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber == null ? null : mobileNumber.trim();
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId == null ? null : managerId.trim();
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName == null ? null : cityName.trim();
	}

	public String getOperationReg() {
		return operationReg;
	}

	public void setOperationReg(String operationReg) {
		this.operationReg = operationReg == null ? null : operationReg.trim();
	}

	public String getSaleReg() {
		return saleReg;
	}

	public void setSaleReg(String saleReg) {
		this.saleReg = saleReg == null ? null : saleReg.trim();
	}

	public String getBusinessReg() {
		return businessReg;
	}

	public void setBusinessReg(String businessReg) {
		this.businessReg = businessReg == null ? null : businessReg.trim();
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName == null ? null : storeName.trim();
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName == null ? null : groupName.trim();
	}

	public String getStaffType() {
		return staffType;
	}

	public void setStaffType(String staffType) {
		this.staffType = staffType == null ? null : staffType.trim();
	}

	public String getStaffRole() {
		return staffRole;
	}

	public void setStaffRole(String staffRole) {
		this.staffRole = staffRole == null ? null : staffRole.trim();
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(String isAvailable) {
		this.isAvailable = isAvailable == null ? null : isAvailable.trim();
	}
}
