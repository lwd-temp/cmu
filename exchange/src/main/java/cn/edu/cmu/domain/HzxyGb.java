package cn.edu.cmu.domain;

import java.util.Date;

public class HzxyGb {
    /**
     * 国别id
     */
    private String gbid;

    /**
     * 国别名称
     */
    private String gbmc;

    /**
     * 盒子颜色 此处需求还需待确认???
     */
    private String hzys;

    /**
     * 协议id
     */
    private String xyid;

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
     * @mbggenerated 2018-09-20
     */
    public HzxyGb(String gbid, String gbmc, String hzys, String xyid, String valid, Date createTime) {
        this.gbid = gbid;
        this.gbmc = gbmc;
        this.hzys = hzys;
        this.xyid = xyid;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2018-09-20
     */
    public HzxyGb() {
        super();
    }

    /**
     * 国别id
     * @return GBID 国别id
     */
    public String getGbid() {
        return gbid;
    }

    /**
     * 国别id
     * @param gbid 国别id
     */
    public void setGbid(String gbid) {
        this.gbid = gbid == null ? null : gbid.trim();
    }

    /**
     * 国别名称
     * @return GBMC 国别名称
     */
    public String getGbmc() {
        return gbmc;
    }

    /**
     * 国别名称
     * @param gbmc 国别名称
     */
    public void setGbmc(String gbmc) {
        this.gbmc = gbmc == null ? null : gbmc.trim();
    }

    /**
     * 盒子颜色 此处需求还需待确认???
     * @return HZYS 盒子颜色 此处需求还需待确认???
     */
    public String getHzys() {
        return hzys;
    }

    /**
     * 盒子颜色 此处需求还需待确认???
     * @param hzys 盒子颜色 此处需求还需待确认???
     */
    public void setHzys(String hzys) {
        this.hzys = hzys == null ? null : hzys.trim();
    }

    /**
     * 协议id
     * @return XYID 协议id
     */
    public String getXyid() {
        return xyid;
    }

    /**
     * 协议id
     * @param xyid 协议id
     */
    public void setXyid(String xyid) {
        this.xyid = xyid == null ? null : xyid.trim();
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
     * @mbggenerated 2018-09-20
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gbid=").append(gbid);
        sb.append(", gbmc=").append(gbmc);
        sb.append(", hzys=").append(hzys);
        sb.append(", xyid=").append(xyid);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}