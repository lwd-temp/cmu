package cn.edu.cmu.domain;

public class DmXmmc {
    /**
     * 项目名称id
     */
    private String xmId;

    /**
     * 项目名称
     */
    private String xmmc;

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public DmXmmc(String xmId, String xmmc) {
        this.xmId = xmId;
        this.xmmc = xmmc;
    }

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public DmXmmc() {
        super();
    }

    /**
     * 项目名称id
     * @return XM_ID 项目名称id
     */
    public String getXmId() {
        return xmId;
    }

    /**
     * 项目名称id
     * @param xmId 项目名称id
     */
    public void setXmId(String xmId) {
        this.xmId = xmId == null ? null : xmId.trim();
    }

    /**
     * 项目名称
     * @return XMMC 项目名称
     */
    public String getXmmc() {
        return xmmc;
    }

    /**
     * 项目名称
     * @param xmmc 项目名称
     */
    public void setXmmc(String xmmc) {
        this.xmmc = xmmc == null ? null : xmmc.trim();
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
        sb.append(", xmId=").append(xmId);
        sb.append(", xmmc=").append(xmmc);
        sb.append("]");
        return sb.toString();
    }
}