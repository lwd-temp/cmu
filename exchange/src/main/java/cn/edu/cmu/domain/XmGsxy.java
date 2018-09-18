package cn.edu.cmu.domain;

public class XmGsxy {
    /**
     * 主键
     */
    private String proCollegId;

    /**
     * 学院id
     */
    private String xyid;

    /**
     * 学院名称
     */
    private String xymc;

    /**
     * 扩展字段
     */
    private String xmid;

    /**
     * 状态
     */
    private String status;

    /**
     * null
     */
    private String valid;

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public XmGsxy(String proCollegId, String xyid, String xymc, String xmid, String status, String valid) {
        this.proCollegId = proCollegId;
        this.xyid = xyid;
        this.xymc = xymc;
        this.xmid = xmid;
        this.status = status;
        this.valid = valid;
    }

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public XmGsxy() {
        super();
    }

    /**
     * 主键
     * @return PRO_COLLEG_ID 主键
     */
    public String getProCollegId() {
        return proCollegId;
    }

    /**
     * 主键
     * @param proCollegId 主键
     */
    public void setProCollegId(String proCollegId) {
        this.proCollegId = proCollegId == null ? null : proCollegId.trim();
    }

    /**
     * 学院id
     * @return XYID 学院id
     */
    public String getXyid() {
        return xyid;
    }

    /**
     * 学院id
     * @param xyid 学院id
     */
    public void setXyid(String xyid) {
        this.xyid = xyid == null ? null : xyid.trim();
    }

    /**
     * 学院名称
     * @return XYMC 学院名称
     */
    public String getXymc() {
        return xymc;
    }

    /**
     * 学院名称
     * @param xymc 学院名称
     */
    public void setXymc(String xymc) {
        this.xymc = xymc == null ? null : xymc.trim();
    }

    /**
     * 扩展字段
     * @return XMID 扩展字段
     */
    public String getXmid() {
        return xmid;
    }

    /**
     * 扩展字段
     * @param xmid 扩展字段
     */
    public void setXmid(String xmid) {
        this.xmid = xmid == null ? null : xmid.trim();
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
     * null
     * @return VALID null
     */
    public String getValid() {
        return valid;
    }

    /**
     * null
     * @param valid null
     */
    public void setValid(String valid) {
        this.valid = valid == null ? null : valid.trim();
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
        sb.append(", proCollegId=").append(proCollegId);
        sb.append(", xyid=").append(xyid);
        sb.append(", xymc=").append(xymc);
        sb.append(", xmid=").append(xmid);
        sb.append(", status=").append(status);
        sb.append(", valid=").append(valid);
        sb.append("]");
        return sb.toString();
    }
}