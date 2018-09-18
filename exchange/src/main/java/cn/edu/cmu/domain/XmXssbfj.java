package cn.edu.cmu.domain;

public class XmXssbfj {
    /**
     * 附件id
     */
    private String fjId;

    /**
     * 文件id
     */
    private String fileId;

    /**
     * 申请记录id
     */
    private String sqjlId;

    /**
     * 状态
     */
    private String status;

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public XmXssbfj(String fjId, String fileId, String sqjlId, String status) {
        this.fjId = fjId;
        this.fileId = fileId;
        this.sqjlId = sqjlId;
        this.status = status;
    }

    /**
     *
     * @mbggenerated 2018-09-18
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
     * 状态
     * @return STATUS 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 状态
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     *
     * @mbggenerated 2018-09-18
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fjId=").append(fjId);
        sb.append(", fileId=").append(fileId);
        sb.append(", sqjlId=").append(sqjlId);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}