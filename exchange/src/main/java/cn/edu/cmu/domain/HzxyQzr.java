package cn.edu.cmu.domain;

public class HzxyQzr {
    /**
     * 人员id
     */
    private String ryid;

    /**
     * 人员姓名
     */
    private String xm;

    /**
     * 协议id
     */
    private String xyid;

    /**
     * 状态
     */
    private String status;

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public HzxyQzr(String ryid, String xm, String xyid, String status) {
        this.ryid = ryid;
        this.xm = xm;
        this.xyid = xyid;
        this.status = status;
    }

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public HzxyQzr() {
        super();
    }

    /**
     * 人员id
     * @return RYID 人员id
     */
    public String getRyid() {
        return ryid;
    }

    /**
     * 人员id
     * @param ryid 人员id
     */
    public void setRyid(String ryid) {
        this.ryid = ryid == null ? null : ryid.trim();
    }

    /**
     * 人员姓名
     * @return XM 人员姓名
     */
    public String getXm() {
        return xm;
    }

    /**
     * 人员姓名
     * @param xm 人员姓名
     */
    public void setXm(String xm) {
        this.xm = xm == null ? null : xm.trim();
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
     * @mbggenerated 2018-09-17
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ryid=").append(ryid);
        sb.append(", xm=").append(xm);
        sb.append(", xyid=").append(xyid);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}