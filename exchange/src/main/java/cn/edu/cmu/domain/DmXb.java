package cn.edu.cmu.domain;

public class DmXb {
    /**
     * null
     */
    private String code;

    /**
     * null
     */
    private String caption;

    /**
     *
     * @mbggenerated 2018-11-21
     */
    public DmXb(String code, String caption) {
        this.code = code;
        this.caption = caption;
    }

    /**
     *
     * @mbggenerated 2018-11-21
     */
    public DmXb() {
        super();
    }

    /**
     * null
     * @return CODE null
     */
    public String getCode() {
        return code;
    }

    /**
     * null
     * @param code null
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * null
     * @return CAPTION null
     */
    public String getCaption() {
        return caption;
    }

    /**
     * null
     * @param caption null
     */
    public void setCaption(String caption) {
        this.caption = caption == null ? null : caption.trim();
    }

    /**
     *
     * @mbggenerated 2018-11-21
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", code=").append(code);
        sb.append(", caption=").append(caption);
        sb.append("]");
        return sb.toString();
    }
}