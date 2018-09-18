package cn.edu.cmu.domain;

public class XmJlzjbg {
    /**
     * 总结id
     */
    private String zjid;

    /**
     * 申请记录id
     */
    private String sqjlId;

    /**
     * 文件id
     */
    private String fileId;

    /**
     * 0 已删除 1 正常
     */
    private String status;

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public XmJlzjbg(String zjid, String sqjlId, String fileId, String status) {
        this.zjid = zjid;
        this.sqjlId = sqjlId;
        this.fileId = fileId;
        this.status = status;
    }

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public XmJlzjbg() {
        super();
    }

    /**
     * 总结id
     * @return ZJID 总结id
     */
    public String getZjid() {
        return zjid;
    }

    /**
     * 总结id
     * @param zjid 总结id
     */
    public void setZjid(String zjid) {
        this.zjid = zjid == null ? null : zjid.trim();
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
     * 0 已删除 1 正常
     * @return STATUS 0 已删除 1 正常
     */
    public String getStatus() {
        return status;
    }

    /**
     * 0 已删除 1 正常
     * @param status 0 已删除 1 正常
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
        sb.append(", zjid=").append(zjid);
        sb.append(", sqjlId=").append(sqjlId);
        sb.append(", fileId=").append(fileId);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}