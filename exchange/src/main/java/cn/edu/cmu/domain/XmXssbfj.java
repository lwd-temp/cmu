package cn.edu.cmu.domain;

import java.util.Date;

public class XmXssbfj {
    /**
     * 附件id
     */
    private String fjId;

    /**
     * 申请记录id
     */
    private String sqjlId;

    /**
     * 文件id
     */
    private String fileId;

    /**
     * 材料说明
     */
    private String clsm;

    /**
     * 数据是否有效(0已经删除 1有效)
     */
    private String valid;

    /**
     * 创建时间默认当前数据生成时间
     */
    private Date createTime;

    /**
     *
     * @mbggenerated 2018-11-06
     */
    public XmXssbfj(String fjId, String sqjlId, String fileId, String clsm, String valid, Date createTime) {
        this.fjId = fjId;
        this.sqjlId = sqjlId;
        this.fileId = fileId;
        this.clsm = clsm;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2018-11-06
     */
    public XmXssbfj() {
        super();
    }

    /**
     * 附件id
     * @return FJ_ID 附件id
     */
    public String getFjId() {
        return fjId;
    }

    /**
     * 附件id
     * @param fjId 附件id
     */
    public void setFjId(String fjId) {
        this.fjId = fjId == null ? null : fjId.trim();
    }

    /**
     * 申请记录id
     * @return SQJL_ID 申请记录id
     */
    public String getSqjlId() {
        return sqjlId;
    }

    /**
     * 申请记录id
     * @param sqjlId 申请记录id
     */
    public void setSqjlId(String sqjlId) {
        this.sqjlId = sqjlId == null ? null : sqjlId.trim();
    }

    /**
     * 文件id
     * @return FILE_ID 文件id
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * 文件id
     * @param fileId 文件id
     */
    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }

    /**
     * 材料说明
     * @return CLSM 材料说明
     */
    public String getClsm() {
        return clsm;
    }

    /**
     * 材料说明
     * @param clsm 材料说明
     */
    public void setClsm(String clsm) {
        this.clsm = clsm == null ? null : clsm.trim();
    }

    /**
     * 数据是否有效(0已经删除 1有效)
     * @return VALID 数据是否有效(0已经删除 1有效)
     */
    public String getValid() {
        return valid;
    }

    /**
     * 数据是否有效(0已经删除 1有效)
     * @param valid 数据是否有效(0已经删除 1有效)
     */
    public void setValid(String valid) {
        this.valid = valid == null ? null : valid.trim();
    }

    /**
     * 创建时间默认当前数据生成时间
     * @return CREATE_TIME 创建时间默认当前数据生成时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间默认当前数据生成时间
     * @param createTime 创建时间默认当前数据生成时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2018-11-06
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fjId=").append(fjId);
        sb.append(", sqjlId=").append(sqjlId);
        sb.append(", fileId=").append(fileId);
        sb.append(", clsm=").append(clsm);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}