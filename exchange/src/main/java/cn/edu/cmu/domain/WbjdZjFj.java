package cn.edu.cmu.domain;

import java.util.Date;

public class WbjdZjFj {
    /**
     * id主键
     */
    private String id;

    /**
     * 总结id
     */
    private String zjid;

    /**
     * 上传文件id
     */
    private String fid;

    /**
     * 文件说明
     */
    private String zjms;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 数据是否有效(0已经删除 1有效)
     */
    private String valid;

    /**
     *
     * @mbggenerated 2019-06-19
     */
    public WbjdZjFj(String id, String zjid, String fid, String zjms, Date createTime, String valid) {
        this.id = id;
        this.zjid = zjid;
        this.fid = fid;
        this.zjms = zjms;
        this.createTime = createTime;
        this.valid = valid;
    }

    /**
     *
     * @mbggenerated 2019-06-19
     */
    public WbjdZjFj() {
        super();
    }

    /**
     * id主键
     * @return ID id主键
     */
    public String getId() {
        return id;
    }

    /**
     * id主键
     * @param id id主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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
     * 上传文件id
     * @return FID 上传文件id
     */
    public String getFid() {
        return fid;
    }

    /**
     * 上传文件id
     * @param fid 上传文件id
     */
    public void setFid(String fid) {
        this.fid = fid == null ? null : fid.trim();
    }

    /**
     * 文件说明
     * @return ZJMS 文件说明
     */
    public String getZjms() {
        return zjms;
    }

    /**
     * 文件说明
     * @param zjms 文件说明
     */
    public void setZjms(String zjms) {
        this.zjms = zjms == null ? null : zjms.trim();
    }

    /**
     * 创建时间
     * @return CREATE_TIME 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
     *
     * @mbggenerated 2019-06-19
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", zjid=").append(zjid);
        sb.append(", fid=").append(fid);
        sb.append(", zjms=").append(zjms);
        sb.append(", createTime=").append(createTime);
        sb.append(", valid=").append(valid);
        sb.append("]");
        return sb.toString();
    }
}