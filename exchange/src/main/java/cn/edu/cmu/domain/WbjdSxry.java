package cn.edu.cmu.domain;

public class WbjdSxry {
    /**
     * 人员id
     */
    private String ryid;

    /**
     * 来访id
     */
    private String lfid;

    /**
     * 姓名
     */
    private String xm;

    /**
     * 国籍
     */
    private String gj;

    /**
     * 职务
     */
    private String zw;

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public WbjdSxry(String ryid, String lfid, String xm, String gj, String zw) {
        this.ryid = ryid;
        this.lfid = lfid;
        this.xm = xm;
        this.gj = gj;
        this.zw = zw;
    }

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public WbjdSxry() {
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
     * 来访id
     * @return LFID 来访id
     */
    public String getLfid() {
        return lfid;
    }

    /**
     * 来访id
     * @param lfid 来访id
     */
    public void setLfid(String lfid) {
        this.lfid = lfid == null ? null : lfid.trim();
    }

    /**
     * 姓名
     * @return XM 姓名
     */
    public String getXm() {
        return xm;
    }

    /**
     * 姓名
     * @param xm 姓名
     */
    public void setXm(String xm) {
        this.xm = xm == null ? null : xm.trim();
    }

    /**
     * 国籍
     * @return GJ 国籍
     */
    public String getGj() {
        return gj;
    }

    /**
     * 国籍
     * @param gj 国籍
     */
    public void setGj(String gj) {
        this.gj = gj == null ? null : gj.trim();
    }

    /**
     * 职务
     * @return ZW 职务
     */
    public String getZw() {
        return zw;
    }

    /**
     * 职务
     * @param zw 职务
     */
    public void setZw(String zw) {
        this.zw = zw == null ? null : zw.trim();
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
        sb.append(", ryid=").append(ryid);
        sb.append(", lfid=").append(lfid);
        sb.append(", xm=").append(xm);
        sb.append(", gj=").append(gj);
        sb.append(", zw=").append(zw);
        sb.append("]");
        return sb.toString();
    }
}