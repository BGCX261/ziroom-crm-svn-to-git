package cn.ziroom.mapper;

import com.sunshulin.service.GeneralCriteria;
import java.util.Date;

/**
 * 房屋开发过程实体
 * @author Administrator
 *
 */
public class BuildingProcess extends GeneralCriteria {

	private static final long serialVersionUID = -8791460450397378443L;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_building_process.BUILDING_PROCESS_ID
     *
     * @mbggenerated Tue Nov 22 10:42:22 CST 2011
     */
    private Integer buildingProcessId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_building_process.BUILDING_ID
     *
     * @mbggenerated Tue Nov 22 10:42:22 CST 2011
     */
    private Integer buildingId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_building_process.USER_ID
     *
     * @mbggenerated Tue Nov 22 10:42:22 CST 2011
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_building_process.USERNAME
     *
     * @mbggenerated Tue Nov 22 10:42:22 CST 2011
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_building_process.PROCESS_TYPE
     *
     * @mbggenerated Tue Nov 22 10:42:22 CST 2011
     */
    private String processType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_building_process.START_TIME
     *
     * @mbggenerated Tue Nov 22 10:42:22 CST 2011
     */
    private Date startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_building_process.ENT_TIME
     *
     * @mbggenerated Tue Nov 22 10:42:22 CST 2011
     */
    private Date entTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_building_process.PROCESS_STATUS
     *
     * @mbggenerated Tue Nov 22 10:42:22 CST 2011
     */
    private String processStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_building_process.PROCESS_DESC
     *
     * @mbggenerated Tue Nov 22 10:42:22 CST 2011
     */
    private String processDesc;

    public Integer getBuildingProcessId() {
        return buildingProcessId;
    }

    public void setBuildingProcessId(Integer buildingProcessId) {
        this.buildingProcessId = buildingProcessId;
    }

    public Integer getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getProcessType() {
        return processType;
    }

    public void setProcessType(String processType) {
        this.processType = processType == null ? null : processType.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEntTime() {
        return entTime;
    }

    public void setEntTime(Date entTime) {
        this.entTime = entTime;
    }

    public String getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus == null ? null : processStatus.trim();
    }

    public String getProcessDesc() {
        return processDesc;
    }

    public void setProcessDesc(String processDesc) {
        this.processDesc = processDesc == null ? null : processDesc.trim();
    }
}